package com.javanfood.javanfood.domain.repository;

import com.javanfood.javanfood.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {
    List<Cozinha> listar();

    Cozinha findById(Long id);

    Cozinha adicionar(Cozinha cozinha);

    void delete(Cozinha cozinha);
}
