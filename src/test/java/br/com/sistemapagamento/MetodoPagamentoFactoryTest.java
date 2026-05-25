package br.com.sistemapagamento;

import br.com.sistemapagamento.factory.MetodoPagamentoFactory;
import br.com.sistemapagamento.flyweight.MetodoPagamento;

public class MetodoPagamentoFactoryTest {

    public static void main(String[] args) {

        System.out.println("=== TESTE 1: Reutilização do PIX ===");
        MetodoPagamento pagamento1 = MetodoPagamentoFactory.getMetodo("PIX");
        MetodoPagamento pagamento2 = MetodoPagamentoFactory.getMetodo("PIX");

        if (pagamento1 == pagamento2) {
            System.out.println("PASSOU: mesmo objeto reutilizado");
        } else {
            System.out.println("FALHOU");
        }


        System.out.println("\n=== TESTE 2: Objetos diferentes ===");
        MetodoPagamento pix = MetodoPagamentoFactory.getMetodo("PIX");
        MetodoPagamento cartao = MetodoPagamentoFactory.getMetodo("CARTAO");

        if (pix != cartao) {
            System.out.println("PASSOU: objetos diferentes");
        } else {
            System.out.println("FALHOU");
        }


        System.out.println("\n=== TESTE 3: Tipo inválido ===");
        try {
            MetodoPagamentoFactory.getMetodo("DINHEIRO");
            System.out.println("FALHOU");
        } catch (IllegalArgumentException e) {
            System.out.println("PASSOU: erro capturado -> " + e.getMessage());
        }
    }
}