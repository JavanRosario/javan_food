package com.javanfood.javanfood.jpa;

import java.util.List;

import org.springframework.stereotype.Component;

import com.javanfood.javanfood.JavanfoodApplication;
import com.javanfood.javanfood.domain.model.Cozinha;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Component
public class CadastroCozinha {

	private final JavanfoodApplication javanfoodApplication;
	@PersistenceContext
	private EntityManager entityManager;

	CadastroCozinha(JavanfoodApplication javanfoodApplication) {
		this.javanfoodApplication = javanfoodApplication;
	}

	public List<Cozinha> listar() {
		TypedQuery<Cozinha> query = entityManager.createQuery("from Cozinha", Cozinha.class);
		return query.getResultList();
	}
}
