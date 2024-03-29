package com.servico;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.entidade.Expressao;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TestCalculadoraServico {

    /**
     * Autowire no serviço que queremos testar
     */
    @Autowired
    private CalculadoraServico calculadoraServico;

    /**
     * Verifica se serviço foi carregado.
     *
     * @throws Exception
     */
    @Test
    void testCarregamentoServico() {
        assertThat(calculadoraServico).isNotNull();
    }

    /**
     * Testa a soma de uma expressão através do serviço.
     */
    @Test
    void testGetSoma() {
        Expressao expressao = new Expressao(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadoraServico.soma(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Testa a diferenca de uma expressão através do serviço.
     */
    @Test
    void testGetDiferenca() {
        Expressao expressao = new Expressao(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadoraServico.diferenca(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Testa o produto de uma expressão através do serviço.
     */
    @Test
    void testGetProduto() {
        Expressao expressao = new Expressao(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calculadoraServico.produto(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    /**
     * Testa o quociente de uma expressão através do serviço.
     */
    @Test
    void testGetQuociente() {
        Expressao expressao = new Expressao(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadoraServico.quociente(expressao);
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
