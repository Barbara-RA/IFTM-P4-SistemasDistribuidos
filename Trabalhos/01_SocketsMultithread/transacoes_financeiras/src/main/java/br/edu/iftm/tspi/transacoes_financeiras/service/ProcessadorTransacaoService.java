package br.edu.iftm.tspi.transacoes_financeiras.service;

import br.edu.iftm.tspi.transacoes_financeiras.model.Cartao;
import br.edu.iftm.tspi.transacoes_financeiras.model.MensagemISO8583;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProcessadorTransacaoService {
    private final Map<String, Cartao> cartoes;
    private final AtomicInteger contadorNSU;

    public ProcessadorTransacaoService() {
        cartoes = new HashMap<>();
        contadorNSU = new AtomicInteger(1);

        // Inicializando cartões na memória
        cartoes.put("401231021845", new Cartao("401231021845", "João Silva", 1000.00));
        cartoes.put("601145678901", new Cartao("601145678901", "Maria Oliveira", 500.00));
    }

    public synchronized MensagemISO8583 processarMensagem(MensagemISO8583 mensagem) {
        Cartao cartao = cartoes.get(mensagem.getNumeroCartao());
        if (cartao == null) {
            return new MensagemISO8583("0210", "05", "000000000"); // Cartão inexistente
        }

        if (cartao.getSaldo() < mensagem.getValor()) {
            return new MensagemISO8583("0210", "51", "000000000"); // Saldo insuficiente
        }

        // Transação aprovada
        cartao.debitar(mensagem.getValor());
        String NSU = String.format("%09d", contadorNSU.getAndIncrement());
        return new MensagemISO8583("0210", "00", NSU);
    }
}
