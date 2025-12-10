package com.javanfood.javanfood.api.controler;

import com.javanfood.javanfood.api.repository.CidadeRepository;
import com.javanfood.javanfood.domain.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeControler {

    @Autowired
    CidadeRepository cidadeRepository;

    @GetMapping
    public List<Cidade> listar(Cidade cidade) {
        return cidadeRepository.listar();
    }
}
