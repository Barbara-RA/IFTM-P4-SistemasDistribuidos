package br.edu.iftm.tspi.transacoes_financeiras.socket;

import java.net.Socket;

import br.edu.iftm.tspi.transacoes_financeiras.model.MensagemISO8583;

import java.io.InputStream;
import java.io.OutputStream;

public class ClienteTransacaoSocket {
    private final String enderecoServidor;
    private final int portaServidor;

    public ClienteTransacaoSocket(String enderecoServidor, int portaServidor) {
        this.enderecoServidor = enderecoServidor;
        this.portaServidor = portaServidor;
    }

    public void enviarMensagem(MensagemISO8583 mensagem) {
        try (Socket socket = new Socket(enderecoServidor, portaServidor);
                OutputStream output = socket.getOutputStream();
                InputStream input = socket.getInputStream()) {

            // Enviar mensagem ao servidor
            output.write(mensagem.serializar());
            System.out.println("Mensagem enviada: " + new String(mensagem.serializar()));

            // Receber resposta do servidor
            byte[] buffer = new byte[128]; // Tamanho fixo para a mensagem
            int bytesRead = input.read(buffer);

            if (bytesRead > 0) {
                MensagemISO8583 resposta = MensagemISO8583.desserializar(buffer);
                System.out.println("Resposta recebida: Tipo=" + resposta.getTipoMensagem() +
                        ", Código=" + resposta.getCodigoResposta() +
                        ", NSU=" + resposta.getNSU());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
