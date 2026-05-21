package br.com.sistemapagamento;

import br.com.sistemapagamento.factory.MetodoPagamentoFactory;
import br.com.sistemapagamento.flyweight.MetodoPagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MetodoPagamentoFactoryTest {

    @Test
    void deveReutilizarMesmoObjetoPix() {
        MetodoPagamento pagamento1 = MetodoPagamentoFactory.getMetodo("PIX");
        MetodoPagamento pagamento2 = MetodoPagamentoFactory.getMetodo("PIX");

        assertSame(pagamento1, pagamento2);
    }

    @Test
    void deveCriarObjetosDiferentesParaTiposDiferentes() {
        MetodoPagamento pix = MetodoPagamentoFactory.getMetodo("PIX");
        MetodoPagamento cartao = MetodoPagamentoFactory.getMetodo("CARTAO");

        assertNotSame(pix, cartao);
    }

    @Test
    void deveRetornarErroParaMetodoInvalido() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> MetodoPagamentoFactory.getMetodo("DINHEIRO")
        );

        assertEquals("Tipo inválido", exception.getMessage());
    }
}