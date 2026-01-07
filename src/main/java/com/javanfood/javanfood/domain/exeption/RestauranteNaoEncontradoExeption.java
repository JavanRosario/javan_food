package com.javanfood.javanfood.domain.exeption;

public class RestauranteNaoEncontradoExeption extends EntidadeNaoEncontradaExeption {
	public RestauranteNaoEncontradoExeption(String message) {
		super(message);
	}

	public RestauranteNaoEncontradoExeption(Long restautanteId) {
		this(String.format("Não existe Cozinha com código: %d", restautanteId));
	}
}
