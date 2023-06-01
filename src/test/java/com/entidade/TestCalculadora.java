package com.entidade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculadora {

    /**
     * Teste da adição da calculadora.
     */
    @Test
    void testGetSoma() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Teste da subtração da calculadora.
     */
    @Test
    void testGetDiferenca() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Teste da multiplicação da calculadora.
     */
    @Test
    void testGetProduto() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getProduto(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Teste da divisão da calculadora.
     */
    @Test
    void testGetQuociente() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getQuociente(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
