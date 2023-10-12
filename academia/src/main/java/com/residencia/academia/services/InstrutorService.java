package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entities.Instrutor;
import com.residencia.academia.repositories.InstrutorRepository;

@Service
public class InstrutorService {
	// CRUD
	// recuperar todos os instrutores *
	// recuperar um instrutor pela sua chave primaria *
	// salvar um novo instrutor *
	// atualizar um determinado instrutor *
	// deletar um determinado instrutor *

	@Autowired
	InstrutorRepository instrutorRepo;

	public List<Instrutor> listarInstrutors() {
		return instrutorRepo.findAll();
	}

	public Instrutor getInstrutorById(Integer id) {
		/*
		 * Optional<Instrutor> instrutorBanco = instrutorRepo.findById(id);
		 * if(instrutorBanco.isPresent()) return instrutorBanco.get(); else return null;
		 */

		return instrutorRepo.findById(id).orElse(null);
	}

	public Instrutor salvarInstrutor(Instrutor instrutor) {
		return instrutorRepo.save(instrutor);
	}

	public Instrutor atualizarInstrutor(Instrutor instrutor) {
		return instrutorRepo.save(instrutor);

	}

	public Boolean deletarInstrutor(Instrutor instrutor) {
		
		// verifica se instrutor é valido
		if(instrutor == null)
			return false;
		
		// verifica se existe no banco
		Instrutor instrutorExistente = getInstrutorById(instrutor.getCodigoInstrutor());
		if (instrutorExistente == null)
			return false;
		
		// deleta instrutor
		instrutorRepo.delete(instrutor);
		
		//verifica se foi deletado de fato
		Instrutor instrutorContinuaExistindo = getInstrutorById(instrutor.getCodigoInstrutor());
		if (instrutorContinuaExistindo == null)
			return true;
		return false;
	}

}
