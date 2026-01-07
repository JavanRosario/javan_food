package com.javanfood.javanfood.domain.exeption;

public class CozinhaNaoEncontradoExeption extends EntidadeNaoEncontradaExeption {
	public CozinhaNaoEncontradoExeption(String message) {
		super(message);
	}

	public CozinhaNaoEncontradoExeption(Long cozinhaId) {
		this(String.format("Não existe um cadastro de Cozinha com código: %d", cozinhaId));
	}
}
