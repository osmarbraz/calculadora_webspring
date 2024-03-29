package com.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.entidade.Expressao;
import com.formulario.ExpressaoFrm;
import com.servico.CalculadoraServico;
import static com.util.Util.nonNullCopyProperties;

/**
 * Classe de controle da calculadora.
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

    /**
     * Abre o formulário da calculadora.
     * 
     * @param expressaoFrm
     * @param model
     * @return 
     */
    @GetMapping("/")
    public String frmCalculadora(ExpressaoFrm expressaoFrm, Model model) {
        //Objeto adicionado como atributo a página html
        model.addAttribute(EXPRESSAO, expressaoFrm);
        return "FrmCalculadora";
    }

    /**
     * Calcula o resultado de uma expressão na calculadora.
     * 
     * @param expressaoFrm Dados do formulário da calculadora.
     * @param model Modelo da calculadora.
     * @return 
     */
    @PostMapping("/CalculadoraResultado")
    public String calculadoraResultado(ExpressaoFrm expressaoFrm, Model model) {
        //Objeto adicionado como atributo a página html
        model.addAttribute(EXPRESSAO, expressaoFrm);

        //Instância uma calculadora para receber os dados do formulário
        Expressao calculadora = new Expressao();
        //Copia os dados do formulário para a entidade
        nonNullCopyProperties(expressaoFrm, calculadora);
        
        //Verifica o tipo da operação
        if (expressaoFrm.getOperacao().equals("adicao")) {
            //Calcula o resultado dos valores usando o serviço
            expressaoFrm.setMensagem("A soma de " + calculadora.getValorA() + " + " + calculadora.getValorB() + " = " + calculadoraServico.soma(calculadora));
        } else {
            if (expressaoFrm.getOperacao().equals("subtracao")) {
                //Calcula o resultado dos valores usando o serviço
                expressaoFrm.setMensagem("A diferença de " + calculadora.getValorA() + " - " + calculadora.getValorB() + " = " + calculadoraServico.diferenca(calculadora));
            } else {
                if (expressaoFrm.getOperacao().equals("multiplicacao")) {
                    //Calcula o resultado dos valores usando o serviço
                    expressaoFrm.setMensagem("O produto de " + calculadora.getValorA() + " * " + calculadora.getValorB() + " = " + calculadoraServico.produto(calculadora));
                } else {
                    if (expressaoFrm.getOperacao().equals("divisao")) {
                        //Calcula o resultado dos valores usando o serviço
                        expressaoFrm.setMensagem("O quociente de " + calculadora.getValorA() + " / " + calculadora.getValorB() + " = " + calculadoraServico.quociente(calculadora));
                    } else {
                        expressaoFrm.setMensagem("Operação inválida!");
                    }
                }
            }
        }

        return "CalculadoraResultado";
    }
}
