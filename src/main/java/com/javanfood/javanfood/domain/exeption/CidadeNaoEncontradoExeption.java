package com.javanfood.javanfood.domain.exeption;

public class CidadeNaoEncontradoExeption extends EntidadeNaoEncontradaExeption {
	public CidadeNaoEncontradoExeption(String message) {
		super(message);
	}

	public CidadeNaoEncontradoExeption(Long cidadeId) {
		this(String.format("Não existe cidade com código: %d", cidadeId));
	}
}
