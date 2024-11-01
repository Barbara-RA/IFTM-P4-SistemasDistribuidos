import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServidorSocketThread implements Runnable {

    private final Socket socketClient;

    public ServidorSocketThread(Socket socketClient) {
        this.socketClient = socketClient;
    }

    @Override
    public void run() {
        try (DataInputStream entrada = new DataInputStream(socketClient.getInputStream());
             DataOutputStream saida = new DataOutputStream(socketClient.getOutputStream())) {

            String linha;
            while ((linha = entrada.readUTF()) != null && !linha.trim().isEmpty()) {
                System.out.println("Cliente " + socketClient.getInetAddress() +" " + socketClient.getPort() + " disse: " + linha  );

                // Enviar a mensagem para todos os clientes, exceto o remetente
                Servidor.enviarParaTodos("Cliente " + socketClient.getInetAddress() + " " + socketClient.getPort() +": " + linha, socketClient);
            }
        } catch (IOException e) {
            System.err.println("Erro de I/O durante comunicação com o cliente: " + e.getMessage());
        } finally {
            // Remover o cliente da lista quando a conexão for encerrada
            Servidor.removerCliente(socketClient);

            // Fechar o socket
            try {
                socketClient.close();
            } catch (IOException e) {
                System.err.println("Erro ao fechar o socket: " + e.getMessage());
            }
        }
    }
}
