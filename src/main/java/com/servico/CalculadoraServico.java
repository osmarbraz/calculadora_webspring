package com.servico;

import com.entidade.Expressao;

/**
 * Interface que define as operações para a expressão.
 *
 * @author osmar
 */
public interface CalculadoraServico {

    public double soma(Expressao expressao);

    public double diferenca(Expressao expressao);

    public double produto(Expressao expressao);

    public double quociente(Expressao expressao);
}