package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entities.Telefone;

import com.residencia.academia.repositories.TelefoneRepository;

@Service
public class TelefoneService {
	// CRUD
	// recuperar todos os instrutores *
	// recuperar um instrutor pela sua chave primaria *
	// salvar um novo instrutor *
	// atualizar um determinado instrutor *
	// deletar um determinado instrutor *

	@Autowired
	private TelefoneRepository telefoneRepo;

	public List<Telefone> listarTelefone() {
		return telefoneRepo.findAll();
	}

	public Telefone getTelefoneById(Integer id) {
		/*
		 * Optional<Instrutor> instrutorBanco = instrutorRepo.findById(id);
		 * if(instrutorBanco.isPresent()) return instrutorBanco.get(); else return null;
		 */

		return telefoneRepo.findById(id).orElse(null);
	}

	public Telefone salvarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);
	}

	public Telefone atualizarTelefone(Telefone telefone) {
		return telefoneRepo.save(telefone);

	}

	public Boolean deletarTelefone(Telefone telefone) {

		if (telefone == null)
			return false;

		Telefone telefoneExistente = getTelefoneById(telefone.getCodigoTelefone());
		if (telefoneExistente == null)
			return false;

		// deleta instrutor
		telefoneRepo.delete(telefone);

		// verifica se foi deletado de fato
		Telefone telefoneContinuaExistindo = getTelefoneById(telefone.getCodigoTelefone());
		if (telefoneContinuaExistindo == null)
			return true;
		return false;
	}

}
