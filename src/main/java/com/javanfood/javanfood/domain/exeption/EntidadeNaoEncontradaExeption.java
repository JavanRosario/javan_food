package com.javanfood.javanfood.domain.exeption;

public abstract class EntidadeNaoEncontradaExeption extends NegocioExeption {
    public EntidadeNaoEncontradaExeption(String message) {
        super(message);
    }
}
