package br.edu.iftm.tspi.transacoes_financeiras;

import br.edu.iftm.tspi.transacoes_financeiras.model.MensagemISO8583;
import br.edu.iftm.tspi.transacoes_financeiras.socket.ClienteTransacaoSocket;

public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteTransacaoSocket cliente = new ClienteTransacaoSocket("localhost", 8080);

        try {
            // Quando a transação for Aprovada
            System.out.println("Situação 1: Transação aprovada");
            MensagemISO8583 transacaoAprovada = new MensagemISO8583(
                    "0200",
                    100.00,
                    "401231021845",
                    "104446",
                    "0512",
                    "1" 
            );
            cliente.enviarMensagem(transacaoAprovada);

            // Quando o saldo for insuficiente
            System.out.println("\nSituação 2: Saldo Insuficiente");
            MensagemISO8583 saldoInsuficiente = new MensagemISO8583(
                    "0200",
                    2000.00,
                    "401231021845",
                    "104446",
                    "0512",
                    "1");
            cliente.enviarMensagem(saldoInsuficiente);

            // Quando o cartão for inexistente
            System.out.println("\nSituação 3: Cartão Inexistente");
            MensagemISO8583 cartaoInexistente = new MensagemISO8583(
                    "0200",
                    50.00,
                    "999999999999",
                    "104446",
                    "0512",
                    "1");
            cliente.enviarMensagem(cartaoInexistente);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}