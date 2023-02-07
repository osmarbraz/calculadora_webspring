package com.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entidade.Expressao;
import com.formulario.ExpressaoFrm;
import com.servico.CalculadoraServico;
import static com.util.Util.nonNullCopyProperties;

/**
 * Classe de controle de cliente.
 *
 * @author osmar
 */
@Controller
public class CalculadoraControle {

    private static final String EXPRESSAO = "expressaofrm";

    @Autowired
    private final CalculadoraServico calculadoraServico;

    public CalculadoraControle(CalculadoraServico calculadoraServico) {
        this.calculadoraServico = calculadoraServico;
    }

    @GetMapping("/")
    public String frmCalculadora(@ModelAttribute ExpressaoFrm expressaoFrm, Model model) {
        //Objeto adicionado como atributo a página html
        model.addAttribute(EXPRESSAO, expressaoFrm);
        return "FrmCalculadora";
    }

    @PostMapping("/CalculadoraResultado")
    public String CalculadoraResultado(@ModelAttribute ExpressaoFrm expressaoFrm, Model model) {
        //Objeto adicionado como atributo a página html
        model.addAttribute(EXPRESSAO, expressaoFrm);

        //Instância uma calculadora para receber os dados do formulário
        Expressao calculadora = new Expressao();
        //Copia os dados do formulário para a entidade
        nonNullCopyProperties(expressaoFrm, calculadora);

        //Verifica o tipo da operação
        if (expressaoFrm.getOperacao().equals("adicao")) {
            //Calcula o resultado dos valores usando o serviço
            expressaoFrm.setMensagem("A adição de " + calculadora.getValorA() + " + " + calculadora.getValorB() + " = " + calculadoraServico.adicao(calculadora));
        } else {
            if (expressaoFrm.getOperacao().equals("subtracao")) {
                //Calcula o resultado dos valores usando o serviço
                expressaoFrm.setMensagem("A subtração de " + calculadora.getValorA() + " - " + calculadora.getValorB() + " = " + calculadoraServico.subtracao(calculadora));
            } else {
                if (expressaoFrm.getOperacao().equals("produto")) {
                    //Calcula o resultado dos valores usando o serviço
                    expressaoFrm.setMensagem("O produto de " + calculadora.getValorA() + " * " + calculadora.getValorB() + " = " + calculadoraServico.produto(calculadora));
                } else {
                    if (expressaoFrm.getOperacao().equals("divisao")) {
                        //Calcula o resultado dos valores usando o serviço
                        expressaoFrm.setMensagem("A divisão de " + calculadora.getValorA() + " / " + calculadora.getValorB() + " = " + calculadoraServico.divisao(calculadora));
                    }
                }
            }
        }

        return "CalculadoraResultado";
    }
}
