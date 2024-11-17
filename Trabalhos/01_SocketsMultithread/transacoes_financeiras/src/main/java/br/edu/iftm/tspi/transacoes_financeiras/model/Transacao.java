package br.edu.iftm.tspi.transacoes_financeiras.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transacao {
    private double valor;
    private LocalDate data;
    private LocalTime hora;
    private String redeTransmissora;
    private String formaPagamento;
    private String NSU;
    private String codigoResposta;

    public Transacao(double valor, LocalDate data, LocalTime hora, String redeTransmissora,
            String formaPagamento, String NSU, String codigoResposta) {
        this.valor = valor;
        this.data = data;
        this.hora = hora;
        this.redeTransmissora = redeTransmissora;
        this.formaPagamento = formaPagamento;
        this.NSU = NSU;
        this.codigoResposta = codigoResposta;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getRedeTransmissora() {
        return redeTransmissora;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getNSU() {
        return NSU;
    }

    public String getCodigoResposta() {
        return codigoResposta;
    }
}
