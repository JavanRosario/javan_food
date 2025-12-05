package com.javanfood.javanfood.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

//@JsonRootName("gastronomia")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cozinha {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
	private Long id;


//    @JsonIgnore
    @JsonProperty("Título")
    @Column(nullable = false)
	private String nome;
	


}
