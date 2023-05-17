package com.formulario;

/**
 * Classe base(bean) para o formulário da calculadora.
 *
 * @author osmar
 */
public class ExpressaoFrm {

    private double valorA;
    private double valorB;
    private String operacao;
    private String mensagem;

    /**
     * Construtor sem parâmetros.
     */
    public ExpressaoFrm(){
        this(0.0,0.0,"","");
    }
    
    /**
     * Construtor do formulário de cliente.
     * @param valorA
     * @param valorB
     * @param operacao
     * @param mensagem
     */
    public ExpressaoFrm(double valorA, double valorB, String operacao, String mensagem) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operacao = operacao;
        this.mensagem = mensagem;
    }

    /**
     * @return o valor A
     */
    public double getValorA() {
        return valorA;
    }

    /**
     * @param valorA O valorA a ser setado.
     */
    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    /**
     * @return o valor B
     */
    public double getValorB() {
        return valorB;
    }

    /**
     * @param valorB O valorA a ser setado.
     */
    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    /**
     * @return a operacao
     */
    public String getOperacao() {
        return operacao;
    }

    /**
     * @param operacao A operacao a ser setado.
     */
    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    /**
     * @return A mensagem de um formulário da calculadora.
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem Uma mensagem a ser setada.
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}