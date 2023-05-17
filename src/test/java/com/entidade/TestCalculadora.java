package com.entidade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestCalculadora {

    /**
     * Teste da adição da calculadora.
     */
    @Test
    void testGetAdicao() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getAdicao(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Teste da subtração da calculadora.
     */
    @Test
    void testGetSubtracao() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getSubtracao(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Teste do produto da calculadora.
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
    void testGetDivisao() {
        Expressao expressao = new Expressao(4.0, 2.0);
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDivisao(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
