package com.entidade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestExpressao {

    /**
     * Testa o construtor sem argumentos do expressao.
     */
    @Test
    void testExpressaoSemArgumento() {
        Expressao instancia = new Expressao();
        
        assertTrue(((instancia.getValorA() == 0) && instancia.getValorB() == 0));
    }
    
    /**
     * Testa o construtor com argumentos do expressao.
     */
    @Test
    void testExpressaoComArgumento() {
        Expressao instancia = new Expressao(1,2);
        
        assertTrue(((instancia.getValorA() == 1) && instancia.getValorB() == 2));
    }

    /**
     * Teste os sets da expressão.
     */
    @Test
    void testSetCliente() {
        Expressao instancia = new Expressao();
        instancia.setValorA(1);
        instancia.setValorB(2);
        
        assertTrue(((instancia.getValorA() == 1) && instancia.getValorB() == 2));
    }

    /**
     * Testa o to string.
     */
    @Test
    void testParaString() {
        Expressao instancia = new Expressao();
        String esperado = "valorA:0.0 - valorB:0.0";
        
        assertEquals(esperado, instancia.toString());
    }
}