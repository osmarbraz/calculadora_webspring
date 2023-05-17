package com.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.entidade.Expressao;
import com.formulario.ExpressaoFrm;
import static com.util.Util.nonNullCopyProperties;

class TestUtil {

    /**
     * Testa se o método copia os valores dos atributos.
     */
    @Test
    void testnonNullCopyProperties() {
        Expressao expressaoOrigem = new Expressao(1, 2);
        Expressao expressaoDestino = new Expressao(3, 4);

        nonNullCopyProperties(expressaoOrigem, expressaoDestino);

        assertTrue((expressaoOrigem.getValorA() == expressaoDestino.getValorA())
                && expressaoOrigem.getValorB() == expressaoDestino.getValorB());
    }

    /**
     * Testa se o método copia os valores dos atributos nulos.
     */
    @Test
    void testnonNullCopyPropertiesValoresVazios() {
        ExpressaoFrm expressaoOrigem = new ExpressaoFrm(1, 2, null, null);
        ExpressaoFrm expressaoDestino = new ExpressaoFrm(3, 4, "teste", "teste");

        nonNullCopyProperties(expressaoOrigem, expressaoDestino);

        assertTrue((expressaoOrigem.getValorA() == expressaoDestino.getValorA())
                && expressaoOrigem.getValorB() == expressaoDestino.getValorB());
    }
}
