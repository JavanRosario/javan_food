package com.javanfood.javanfood.domain.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontradaExeption extends RuntimeException {
    public EntidadeNaoEncontradaExeption(String message) {
        super(message);
    }
}
