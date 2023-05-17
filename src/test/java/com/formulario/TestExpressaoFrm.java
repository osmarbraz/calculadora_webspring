package com.formulario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestExpressaoFrm {

    @Test
    void testExpressaoFrmMensage() {
        ExpressaoFrm instancia = new ExpressaoFrm();
        instancia.setMensagem("mensagem");
        assertEquals("mensagem", instancia.getMensagem());
    }
    
    @Test
    void testExpressaoFrm() {
        ExpressaoFrm instancia = new ExpressaoFrm();
        instancia.setValorA(1);
        instancia.setValorB(2);
        instancia.setOperacao("adicao");
        assertTrue( (instancia.getValorA()==1) && (instancia.getValorB()==2) && ("adicao".equals(instancia.getOperacao())));
    }
    
//    @Test
//    void testExpressaoFrmToString() {
//        ExpressaoFrm instancia = new ExpressaoFrm();
//        instancia.setValorA(1);
//        instancia.setValorB(2);
//        instancia.setOperacao("adicao");
//        assertEquals("valorA: 1.0 - valorB: 2.0 - Operação: adicao", instancia);
//    }
}
