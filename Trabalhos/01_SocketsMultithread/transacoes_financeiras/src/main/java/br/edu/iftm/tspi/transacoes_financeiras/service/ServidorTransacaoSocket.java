package br.edu.iftm.tspi.transacoes_financeiras.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.edu.iftm.tspi.transacoes_financeiras.model.MensagemISO8583;

public class ServidorTransacaoSocket {
    private final int porta;
    private final ProcessadorTransacaoService processadorService;

    public ServidorTransacaoSocket(int porta) {
        this.porta = porta;
        this.processadorService = new ProcessadorTransacaoService();
    }

    public void iniciar() {
        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Servidor iniciado na porta " + porta);

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try (InputStream input = socket.getInputStream();
                            OutputStream output = socket.getOutputStream()) {

                        byte[] buffer = new byte[128]; // Tamanho fixo para a mensagem
                        int bytesRead = input.read(buffer);

                        if (bytesRead > 0) {
                            MensagemISO8583 mensagem = MensagemISO8583.desserializar(buffer);
                            MensagemISO8583 resposta = processadorService.processarMensagem(mensagem);
                            output.write(resposta.serializar());
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
