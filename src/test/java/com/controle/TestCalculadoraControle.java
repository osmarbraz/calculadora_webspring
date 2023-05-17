package com.controle;

import com.formulario.ExpressaoFrm;
import com.servico.CalculadoraServico;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.ui.Model;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class TestCalculadoraControle {

    @Mock
    private CalculadoraServico servico;
    
    @Mock
    private Model model;
    
    private CalculadoraControle controle;
    
    /**
     * Configura o teste antes de cada execução.
     */
    @BeforeEach
    public void setUp() {
        servico = mock(CalculadoraServico.class);
        model = mock(Model.class);
        controle = new CalculadoraControle(servico);
    }

    /**
     * Verifica se o serviço foi carregado.
     *
     * @throws Exception
     */
    @Test
    void testCarregamentoServico() {
        assertThat(servico).isNotNull();
    }

    /**
     * Verifica se o model foi carregado.
     *
     * @throws Exception
     */
    @Test
    void testCarregamentoModel() {
        assertThat(model).isNotNull();
    }

    /**
     * Teste do formulário da calculadora.
     */
    @Test
    void testFrmCalculadora() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();

        String resultado = controle.frmCalculadora(expressaoFrm, model);
        assertEquals("FrmCalculadora", resultado);
    }
    
    /**
     * Teste da adição da calculadora através do controle.
     */
    @Test
    void testCalculoOperacaoAdicao() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();
        expressaoFrm.setValorA(4);
        expressaoFrm.setValorB(2);
        expressaoFrm.setOperacao("adicao");

        when(servico.adicao(any())).thenReturn(6.0);

        String resultado = controle.calculadoraResultado(expressaoFrm, model);
        assertEquals("CalculadoraResultado", resultado);
        assertEquals("A adição de 4.0 + 2.0 = 6.0", expressaoFrm.getMensagem());

        verify(model, times(1)).addAttribute(anyString(), any());        
    }
    
    /**
     * Teste da subtração da calculadora através do controle.
     */
    @Test
    void testCalculoOperacaoSubtracao() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();
        expressaoFrm.setValorA(4);
        expressaoFrm.setValorB(2);
        expressaoFrm.setOperacao("subtracao");

        when(servico.subtracao(any())).thenReturn(2.0);

        String resultado = controle.calculadoraResultado(expressaoFrm, model);
        assertEquals("CalculadoraResultado", resultado);
        assertEquals("A subtração de 4.0 - 2.0 = 2.0", expressaoFrm.getMensagem());

        verify(model, times(1)).addAttribute(anyString(), any()); 
    }
    
    /**
     * Teste do produto da calculadora através do controle.
     */
    @Test
    void testCalculoOperacaoProduto() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();
        expressaoFrm.setValorA(4);
        expressaoFrm.setValorB(2);
        expressaoFrm.setOperacao("produto");

        when(servico.produto(any())).thenReturn(8.0);

        String resultado = controle.calculadoraResultado(expressaoFrm, model);
        assertEquals("CalculadoraResultado", resultado);
        assertEquals("O produto de 4.0 * 2.0 = 8.0", expressaoFrm.getMensagem());

        verify(model, times(1)).addAttribute(anyString(), any()); 
    }
    
    /**
     * Teste da divisão da calculadora através do controle.
     */
    @Test
    void testCalculoOperacaoDivisao() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();
        expressaoFrm.setValorA(4);
        expressaoFrm.setValorB(2);
        expressaoFrm.setOperacao("divisao");

        when(servico.divisao(any())).thenReturn(2.0);

        String resultado = controle.calculadoraResultado(expressaoFrm, model);
        assertEquals("CalculadoraResultado", resultado);
        assertEquals("A divisão de 4.0 / 2.0 = 2.0", expressaoFrm.getMensagem());

        verify(model, times(1)).addAttribute(anyString(), any()); 
    }
    
    /**
     * Teste de operação inválida da calculadora através do controle.
     */
    @Test
    void testCalculoOperacaInvalida() throws Exception {
        ExpressaoFrm expressaoFrm = new ExpressaoFrm();
        expressaoFrm.setValorA(4);
        expressaoFrm.setValorB(2);
        expressaoFrm.setOperacao("xxxx");

        String resultado = controle.calculadoraResultado(expressaoFrm, model);
        assertEquals("CalculadoraResultado", resultado);
        assertEquals("Operação inválida!", expressaoFrm.getMensagem());
    }
}
