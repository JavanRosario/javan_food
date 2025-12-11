package com.javanfood.javanfood.tests.endereco;

import com.javanfood.javanfood.JavanfoodApplication;
import com.javanfood.javanfood.domain.model.Estado;
import com.javanfood.javanfood.infraistructure.repository.EstadoRepositoryJpa;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaEndecoMain {
	public static void main(String[] args) {
		ApplicationContext app = new SpringApplicationBuilder(JavanfoodApplication.class).web(WebApplicationType.NONE)
				.run(args);

		EstadoRepositoryJpa bean = app.getBean(EstadoRepositoryJpa.class);

		Estado estado = bean.findById(1L);

        System.out.println("====================================");
        System.out.println(estado.getNome());
	}
}
