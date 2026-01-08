package com.javanfood.javanfood.domain.exeption;

public class NegocioExeption extends RuntimeException {
	public NegocioExeption(String message) {
		super(message);
	}

	public NegocioExeption(String msg, Throwable causa) {
		super(msg, causa);
	}
}
