package com.javanfood.javanfood.api.controler;


import com.javanfood.javanfood.api.repository.RestauranteRepository;
import com.javanfood.javanfood.domain.model.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteControler {

    @Autowired
    RestauranteRepository restauranteRepository;

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteRepository.listar();
    }

    @GetMapping("/restauranteId")
    public ResponseEntity<Restaurante> listarId(@PathVariable Long restauranteId) {
        Restaurante restaurante = restauranteRepository.findById(restauranteId);

        if (restaurante != null) {
            return ResponseEntity.ok(restaurante);
        }

        return ResponseEntity.notFound().build();
    }
}
