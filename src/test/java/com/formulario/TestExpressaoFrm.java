package com.formulario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestExpressaoFrm {

    /**
     * Teste de valores da mensagem de ExpressaoFrm.
     */
    @Test
    void testExpressaoFrmMensage() {
        ExpressaoFrm instancia = new ExpressaoFrm();
        instancia.setMensagem("mensagem");
        assertEquals("mensagem", instancia.getMensagem());
    }
    
    /**
     * Teste de valores de ExpressaoFrm.
     */
    @Test
    void testExpressaoFrm() {
        ExpressaoFrm instancia = new ExpressaoFrm();
        instancia.setValorA(1);
        instancia.setValorB(2);
        instancia.setOperacao("adicao");
        assertTrue( (instancia.getValorA()==1) && (instancia.getValorB()==2) && ("adicao".equals(instancia.getOperacao())));
    }
}
