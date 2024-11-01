package br.edu.iftm.tspi.sd.websockets_exemplo.websocket.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TextoWebSocketHandler extends TextWebSocketHandler {

    private ScheduledExecutorService scheduler;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("Conexão estabelecida: " + session.getId());

        // Iniciar um agendador para enviar mensagens a cada 5 segundos
        scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(() -> {
            try {
                // Verifica se a sessão ainda está aberta
                if (session.isOpen()) {
                    session.sendMessage(new TextMessage("Mensagem automática do servidor a cada 5 segundos"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String payload = message.getPayload();
        System.out.println("Mensagem recebida: " + payload);
        session.sendMessage(new TextMessage("Mensagem recebida no servidor: " + payload));
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        System.out.println("Conexão fechada: " + session.getId());

        // Parar o agendador quando a conexão for fechada
        if (scheduler != null && !scheduler.isShutdown()) {
            scheduler.shutdown();
        }
    }
}
