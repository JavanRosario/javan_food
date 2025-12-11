package com.javanfood.javanfood.api.controler;

import com.javanfood.javanfood.api.repository.EnderecoRespository;
import com.javanfood.javanfood.api.service.CadastroEnderecoService;
import com.javanfood.javanfood.domain.exeption.EntidadeEmUsoExeption;
import com.javanfood.javanfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.javanfood.javanfood.domain.model.Endereco;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoControler {

    @Autowired
    private EnderecoRespository enderecoRespository;

    @Autowired
    private CadastroEnderecoService cadastroEnderecoService;

    @GetMapping
    public List<Endereco> listar() {
        return enderecoRespository.listar();
    }

    @GetMapping("/{enderecoId}")
    public ResponseEntity<Endereco> listarid(@PathVariable Long enderecoId) {
        Endereco endereco = enderecoRespository.findById(enderecoId);

        if (endereco != null) {
            return ResponseEntity.ok(endereco);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> adicionar(@RequestBody Endereco endereco) {
        try {
            endereco = cadastroEnderecoService.salvar(endereco);
            return ResponseEntity.status(HttpStatus.CREATED).body(endereco);
        } catch (EntidadeNaoEncontradaExeption e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping("/{enderecoId}")
    public ResponseEntity<?> atualizar(@PathVariable Long enderecoId, @RequestBody Endereco endereco) {
        try {
            Endereco enderecoAtual = enderecoRespository.findById(enderecoId);

            if (enderecoAtual != null) {
                BeanUtils.copyProperties(endereco, enderecoAtual, "id");
                enderecoAtual = cadastroEnderecoService.salvar(enderecoAtual);

                return ResponseEntity.ok(enderecoAtual);
            }

            return ResponseEntity.notFound().build();
        } catch (EntidadeNaoEncontradaExeption e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{enderecoId}")
    public ResponseEntity<?> delete(@PathVariable Long enderecoId) {

        try {
            cadastroEnderecoService.excluir(enderecoId);
            return ResponseEntity.noContent().build();
        } catch (EntidadeNaoEncontradaExeption e) {
            return ResponseEntity.notFound().build();
        } catch (EntidadeEmUsoExeption e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }

    }

}
