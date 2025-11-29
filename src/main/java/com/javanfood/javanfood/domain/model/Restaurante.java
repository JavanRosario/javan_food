package com.javanfood.javanfood.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;


	private BigDecimal taxaFrete;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setTaxaFrete(BigDecimal taxa) {
		this.taxaFrete = taxa;
	}

	public BigDecimal getTaxaFrete() {
		return this.taxaFrete;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, taxaFrete);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Restaurante other = (Restaurante) obj;

		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

}
