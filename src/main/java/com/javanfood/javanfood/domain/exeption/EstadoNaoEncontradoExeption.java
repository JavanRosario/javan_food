package com.javanfood.javanfood.domain.exeption;

public class EstadoNaoEncontradoExeption extends EntidadeNaoEncontradaExeption {
	public EstadoNaoEncontradoExeption(String message) {
		super(message);
	}

	public EstadoNaoEncontradoExeption(Long estadoId) {
		this(String.format("Não existe Estado com código: %d", estadoId));
	}
}
