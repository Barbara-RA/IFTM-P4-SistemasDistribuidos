import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    // Lista de clientes conectados (mantida privada)
    private static final List<Socket> clientes = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(2001)) {
            System.out.println("Servidor iniciado. Aguardando conexões...");
            while (true) {
                Socket conexao = serverSocket.accept();
                adicionarCliente(conexao);
                System.out.println("Conexão estabelecida!");
                imprimirClientesConectados();
                new Thread(new ServidorSocketThread(conexao)).start();
            }
        }
    }

    // Método para adicionar cliente à lista
    public static synchronized void adicionarCliente(Socket cliente) {
        clientes.add(cliente);
    }

    // Método para remover cliente da lista
    public static synchronized void removerCliente(Socket cliente) {
        clientes.remove(cliente);
    }

    // Método para imprimir os clientes conectados
    public static synchronized void imprimirClientesConectados() {
        System.out.println("Clientes conectados:");
        for (Socket cliente : clientes) {
            System.out.println("Cliente: " + cliente.getInetAddress() + " " + cliente.getPort());
        }
    }

    // Método para enviar mensagens a todos os clientes conectados
    public static void enviarParaTodos(String mensagem, Socket remetente) {
        synchronized (clientes) {
            for (Socket cliente : clientes) {
                if (cliente != remetente) {
                    try {
                        DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
                        saida.writeUTF(mensagem);
                    } catch (IOException e) {
                        System.err.println("Erro ao enviar mensagem para um cliente: " + e.getMessage());
                    }
                }
            }
        }
    }
}
