package br.com.sistemapagamento.factory;

import br.com.sistemapagamento.flyweight.*;

import java.util.HashMap;
import java.util.Map;

public class MetodoPagamentoFactory {

    private static final Map<String, MetodoPagamento> metodos = new HashMap<>();

    public static MetodoPagamento getMetodo(String tipo) {

        MetodoPagamento metodo = metodos.get(tipo.toUpperCase());

        if (metodo == null) {
            switch (tipo.toUpperCase()) {
                case "PIX":
                    metodo = new PagamentoPix();
                    break;
                case "CARTAO":
                    metodo = new PagamentoCartao();
                    break;
                case "BOLETO":
                    metodo = new PagamentoBoleto();
                    break;
                default:
                    throw new IllegalArgumentException("Tipo inválido");
            }

            metodos.put(tipo.toUpperCase(), metodo);
        }

        return metodo;
    }
}