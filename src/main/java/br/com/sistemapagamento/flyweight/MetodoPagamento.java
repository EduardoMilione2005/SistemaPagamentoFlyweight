package br.com.sistemapagamento.flyweight;

import br.com.sistemapagamento.model.Transacao;

public interface MetodoPagamento {
    void processarPagamento(Transacao transacao);
}