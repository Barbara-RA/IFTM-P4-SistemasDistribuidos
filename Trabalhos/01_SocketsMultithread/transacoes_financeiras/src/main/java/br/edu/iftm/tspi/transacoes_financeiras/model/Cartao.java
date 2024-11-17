package br.edu.iftm.tspi.transacoes_financeiras.model;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private String numero;
    private String nomeCliente;
    private double saldo;
    private List<Transacao> transacoes;

    public Cartao(String numero, String nomeCliente, double saldo) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void debitar(double valor) {
        this.saldo -= valor;
    }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }
}
