package com.javanfood.javanfood.api.controler;

import com.javanfood.javanfood.api.repository.CozinhaRepository;
import com.javanfood.javanfood.domain.model.Cozinha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/teste")
//public class TesteControler {
//    @Autowired
////    public CozinhaRepository cozinhaRepository;
//
////    @GetMapping("/cozinhas/por-nome")
////    public List<Cozinha> cozinhasPorNome(@RequestParam("nome") String nome) {
////        return cozinhaRepository.consultaNome(nome);
////    }
////}
