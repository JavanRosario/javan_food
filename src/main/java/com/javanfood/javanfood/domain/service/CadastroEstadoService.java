package com.javanfood.javanfood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.javanfood.javanfood.domain.exeption.EntidadeEmUsoExeption;
import com.javanfood.javanfood.domain.exeption.EntidadeNaoEncontradaExeption;
import com.javanfood.javanfood.domain.model.Estado;
import com.javanfood.javanfood.domain.repository.EstadoRespository;

@Service
public class CadastroEstadoService {

	private static final String MSG_ENTIDADE_EM_USO = "Estado de código: %d não pode ser removida, pois está em uso";

	private static final String MSG_NAO_ENCONTRADO = "Não existe cadastro de Estado com código: %d";

	@Autowired
	EstadoRespository estadoRespository;

	public Estado buscaOuFalha(Long estadoId) {
		return estadoRespository.findById(estadoId)
				.orElseThrow(() -> new EntidadeNaoEncontradaExeption(String.format(MSG_NAO_ENCONTRADO, estadoId)));
	}

	public Estado salvar(Estado estado) {
		return estadoRespository.save(estado);
	}

	public void excluir(Long estadoId) {

		if (!estadoRespository.existsById(estadoId)) {
			throw new EntidadeNaoEncontradaExeption(String.format(MSG_NAO_ENCONTRADO, estadoId));
		}

		try {
			estadoRespository.deleteById(estadoId);
			estadoRespository.flush();
		} catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoExeption(String.format(MSG_ENTIDADE_EM_USO, estadoId));
		}
	}
}
