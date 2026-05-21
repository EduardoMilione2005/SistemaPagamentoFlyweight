package br.com.sistemapagamento.flyweight;

import br.com.sistemapagamento.model.Transacao;

public class PagamentoPix implements MetodoPagamento {

    private final String tipo = "PIX";

    @Override
    public void processarPagamento(Transacao transacao) {
        System.out.println(
                transacao.getCliente() +
                        " pagou R$ " + transacao.getValor() +
                        " via " + tipo +
                        " | Pedido: " + transacao.getPedido()
        );
    }
}