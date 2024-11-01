import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class App {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(2001, 10000);
        while (true) {
            System.out.println("Esperando conexão...");
            try (Socket conexao = s.accept()) {
                DataInputStream entrada = new DataInputStream(conexao.getInputStream());
                DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());

                System.out.println("Conectou!");
                String linha;
                while ((linha = entrada.readUTF()) != null && !linha.trim().isEmpty()) {
                    saida.writeUTF("O servidor leu: " + linha);
                }
            }
        }

    }
}
