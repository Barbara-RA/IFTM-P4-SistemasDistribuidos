import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket( 2001,  10000)) {
            System.out.println("Servidor iniciado. Aguardando conexões...");
            while (true) {
                Socket conexao = serverSocket.accept();
                System.out.println("Conexão estabelecida!");
                new Thread(new ServidorSocketThread(conexao),"ThreadConexao").start();
            }
        }
    }
}
