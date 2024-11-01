import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws Exception {
        try (Socket conexao = new Socket("127.0.0.1", 2001);
            DataInputStream entrada = new DataInputStream(conexao.getInputStream());
            DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in))) {

            // Thread para ouvir as mensagens recebidas do servidor
            new Thread(() -> {
                try {
                    String linhaRecebida;
                    while ((linhaRecebida = entrada.readUTF()) != null) {
                        System.out.println(linhaRecebida);
                    }
                } catch (Exception e) {
                    System.err.println("Erro ao receber mensagem do servidor: " + e.getMessage());
                }
            }).start();

            // Envio de mensagens para o servidor
            while (true) {
                System.out.print("> ");
                String linha = teclado.readLine();
                saida.writeUTF(linha);

                if (linha.equalsIgnoreCase("sair")) {
                    break;
                }
            }
        }
    }
}
