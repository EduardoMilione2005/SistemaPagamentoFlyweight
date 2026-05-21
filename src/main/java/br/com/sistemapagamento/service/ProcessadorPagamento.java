package br.com.sistemapagamento.service;

import br.com.sistemapagamento.factory.MetodoPagamentoFactory;
import br.com.sistemapagamento.flyweight.MetodoPagamento;
import br.com.sistemapagamento.model.Transacao;

public class ProcessadorPagamento {

    public void processar(Transacao transacao) {
        MetodoPagamento metodo =
                MetodoPagamentoFactory.getMetodo(transacao.getTipoPagamento());

        metodo.processarPagamento(transacao);
    }
}