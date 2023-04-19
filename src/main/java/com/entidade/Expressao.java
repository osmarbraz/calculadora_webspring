package com.entidade;

/**
 * Objeto modelo do sistema.
 *
 * @author osmar
 */
public class Expressao {

    private double valorA;
    private double valorB;
        
    /**
     * Construtor sem argumentos da classe.
     */
    public Expressao() {
        this(0.0, 0.0);
    }

    /**
     * Construtor com argumentos da classe.
     *
     * @param valorA
     * @param valorB
     */
    public Expressao(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    /**
     * @return o valor A
     */
    public double getValorA() {
        return valorA;
    }

    /**
     * @return o valor B
     */
    public double getValorB() {
        return valorB;
    }

    /**
     * @param valorA O valorA ser setado.
     */
    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    /**
     * @param valorB O valorA ser setado.
     */
    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    @Override
    public String toString() {
        return ("valorA:" + getValorA() + " - valorB:" + getValorB());
    }
}