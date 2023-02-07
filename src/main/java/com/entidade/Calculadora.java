package com.entidade;

import org.springframework.stereotype.Component;

/**
 * Objeto modelo do sistema.
 *
 * @author osmar
 */
@Component
public class Calculadora {

    /**
     * Realiza a adição.
     *
     * @param expressao uma expressão matemática.
     * @return Um valor real.
     */
    public double getAdicao(Expressao expressao) {
        return (expressao.getValorA() + expressao.getValorB());
    }

    /**
     * Realiza a subtração
     *
     * @param expressao uma expressão matemática.
     * @return Um valor real.
     */
    public double getSubtracao(Expressao expressao) {
        return (expressao.getValorA() - expressao.getValorB());
    }

    /**
     * Realiza o produto.
     *
     * @param expressao uma expressão matemática.
     * @return Um valor real.
     */
    public double getProduto(Expressao expressao) {
        return (expressao.getValorA() * expressao.getValorB());
    }

    /**
     * Realiza a divisão.
     *
     * @param expressao uma expressão matemática.
     * @return Um valor real.
     */
    public double getDivisao(Expressao expressao) {
        return (expressao.getValorA() / expressao.getValorB());
    }
}