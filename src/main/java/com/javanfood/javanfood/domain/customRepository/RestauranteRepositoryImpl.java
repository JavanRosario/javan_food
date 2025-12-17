package com.javanfood.javanfood.domain.customRepository;

import com.javanfood.javanfood.domain.model.Restaurante;
import com.javanfood.javanfood.domain.repository.RestauranteRepositoryQueries;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepositoryQueries {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Restaurante> find(String nome, BigDecimal txFreteInicial, BigDecimal txFreteFinal) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Restaurante> criteriaQuery = builder.createQuery(Restaurante.class);
        Root<Restaurante> root = criteriaQuery.from(Restaurante.class);

        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.hasText(nome)) {
            Predicate nomePredicate = builder.like(root.get("nome"), "%" + nome + "%");
        }
        if (txFreteInicial != null) {
            Predicate taxaMenorOuIgual = builder.greaterThanOrEqualTo(root.get("taxaFrete"), txFreteInicial);
        }

        if (txFreteFinal != null) {
            Predicate taxaMenorOuIgual2 = builder.greaterThanOrEqualTo(root.get("taxaFrete"), txFreteFinal);
        }


        criteriaQuery.where(predicates.toArray(new Predicate[0]));

        TypedQuery<Restaurante> query = entityManager.createQuery(criteriaQuery);

        return query.getResultList();

    }
}
