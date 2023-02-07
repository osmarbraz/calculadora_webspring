package com.servico;

import com.entidade.Expressao;

/**
 * Interface que define as operações para a persistência de cliente.
 *
 * @author osmar
 */
public interface CalculadoraServico {

    public double adicao(Expressao expressao);

    public double subtracao(Expressao expressao);

    public double produto(Expressao expressao);

    public double divisao(Expressao expressao);
}