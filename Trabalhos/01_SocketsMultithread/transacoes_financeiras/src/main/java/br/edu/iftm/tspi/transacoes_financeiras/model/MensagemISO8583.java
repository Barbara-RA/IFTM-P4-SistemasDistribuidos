package br.edu.iftm.tspi.transacoes_financeiras.model;


import java.nio.charset.StandardCharsets;

public class MensagemISO8583 {
    private String tipoMensagem; // Ex.: "0200" ou "0210"
    private double valor;
    private String numeroCartao;
    private String horaLocal;
    private String dataTransacao;
    private String formaPagamento;
    private String codigoResposta; // Para a resposta
    private String NSU; // Para a resposta

    // Construtor da requisição
    public MensagemISO8583(String tipoMensagem, double valor, String numeroCartao, String horaLocal, String dataTransacao, String formaPagamento) {
        this.tipoMensagem = tipoMensagem;
        this.valor = valor;
        this.numeroCartao = numeroCartao;
        this.horaLocal = horaLocal;
        this.dataTransacao = dataTransacao;
        this.formaPagamento = formaPagamento;
    }

    // Construtor da resposta
    public MensagemISO8583(String tipoMensagem, String codigoResposta, String NSU) {
        this.tipoMensagem = tipoMensagem;
        this.codigoResposta = codigoResposta;
        this.NSU = NSU;
    }

    // Serializar para o formato ISO 8583 no formato do exemplo repassado na atividade
    public byte[] serializar() {
        String mensagem = String.format(
            "%s%012d%s%s%s%s", 
            tipoMensagem,                     // Tipo da mensagem
            (int) (valor * 100),              // Valor em centavos
            horaLocal,                        // Hora local
            dataTransacao,                    // Data da transação
            numeroCartao,                     // Número do cartão
            formaPagamento                    // Forma de pagamento
        );
        return mensagem.getBytes(StandardCharsets.UTF_8);
    }

    // Ajustando o método para exibir o conteúdo da mensagem ISO 8583
    public static MensagemISO8583 desserializar(byte[] bytes) {
        String mensagem = new String(bytes, StandardCharsets.UTF_8);
        String tipoMensagem = mensagem.substring(0, 4);
        double valor = Double.parseDouble(mensagem.substring(4, 16)) / 100.0;
        String horaLocal = mensagem.substring(16, 22);
        String dataTransacao = mensagem.substring(22, 26);
        String numeroCartao = mensagem.substring(26, 38);
        String formaPagamento = mensagem.substring(38);

        return new MensagemISO8583(tipoMensagem, valor, numeroCartao, horaLocal, dataTransacao, formaPagamento);
    }

    public String getTipoMensagem() {
        return tipoMensagem;
    }

    public double getValor() {
        return valor;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getHoraLocal() {
        return horaLocal;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String getCodigoResposta() {
        return codigoResposta;
    }

    public String getNSU() {
        return NSU;
    }
    
}


