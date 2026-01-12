package com.javanfood.javanfood.api.exeptionhandler;

import lombok.Getter;

@Getter
public enum ProblemType {
	ENTIDADE_NAO_ENCONTRADA("Entidade não encontrada", "/entidade-nao-encontrada"),
	ENTIDADE_EM_USO("Entidade em uso", "/entidade-em-uso"),
	ERRO_NEGOCIO("Violação de regra de negócio", "/erro-negocio"),
	CORPO_INCOMPREENSIVEL("Corpo da menssagem incompreensivel", "/corpo-incompreensivel"),
	PARAMETRO_INVALIDO("Parâmetro inválido", "/parametro-invalido");


	private String title;
	private String uri;


	ProblemType(String title, String path) {
		this.uri = "https://javanfood.com.br" + path;
		this.title = title;
	}
}
