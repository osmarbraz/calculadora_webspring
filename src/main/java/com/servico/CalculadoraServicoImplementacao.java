package com.servico;

import org.springframework.stereotype.Service;

import com.entidade.Expressao;
import com.entidade.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Implementação dos serviços da calculadora.
 *
 * @author osmar
 */
@Service
public class CalculadoraServicoImplementacao implements CalculadoraServico {

    @Autowired
    private final Calculadora calculadora;

    public CalculadoraServicoImplementacao(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public double soma(Expressao expressao) {
        //Utiliza a calculadora
        return calculadora.getSoma(expressao);
    }

    @Override
    public double diferenca(Expressao expressao) {
        //Utiliza a calculadora
        return calculadora.getDiferenca(expressao);
    }

    @Override
    public double produto(Expressao expressao) {
        //Utiliza a calculadora
        return calculadora.getProduto(expressao);
    }

    @Override
    public double quociente(Expressao expressao) {
        //Utiliza a calculadora
        return calculadora.getQuociente(expressao);
    }
}