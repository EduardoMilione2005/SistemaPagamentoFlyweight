package br.com.sistemapagamento;

import br.com.sistemapagamento.model.Transacao;
import br.com.sistemapagamento.service.ProcessadorPagamento;

public class Main {

    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento();

        Transacao t1 = new Transacao("João", 100.0, "PED001", "PIX");
        Transacao t2 = new Transacao("Maria", 250.0, "PED002", "PIX");
        Transacao t3 = new Transacao("Carlos", 500.0, "PED003", "CARTAO");
        Transacao t4 = new Transacao("Ana", 300.0, "PED004", "BOLETO");

        processador.processar(t1);
        processador.processar(t2);
        processador.processar(t3);
        processador.processar(t4);
    }
}