package com.javanfood.javanfood.jpa;

import com.javanfood.javanfood.JavanfoodApplication;
import com.javanfood.javanfood.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional
    public Cozinha adicionar(Cozinha cozinha) {
        return entityManager.merge(cozinha);

    }

    @Transactional
    public Cozinha findById(Long id){
        return entityManager.find(Cozinha.class,  id);
    }
//    @Transactional
//    public Cozinha delete(Long id) {
//    }
}
