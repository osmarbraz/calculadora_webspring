package com.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.entidade.Expressao;
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
}
