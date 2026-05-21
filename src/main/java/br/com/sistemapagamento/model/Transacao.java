package br.com.sistemapagamento.model;

public class Transacao {

    private final String cliente;
    private final double valor;
    private final String pedido;
    private final String tipoPagamento;

    public Transacao(String cliente, double valor, String pedido, String tipoPagamento) {
        this.cliente = cliente;
        this.valor = valor;
        this.pedido = pedido;
        this.tipoPagamento = tipoPagamento;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getPedido() {
        return pedido;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}