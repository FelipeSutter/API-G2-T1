package com.residencia.academia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.academia.entities.Turma;
import com.residencia.academia.repositories.TurmaRepository;

@Service
public class TurmaService {
	// CRUD
	// recuperar todos os turmaes *
	// recuperar um turma pela sua chave primaria *
	// salvar um novo turma *
	// atualizar um determinado turma *
	// deletar um determinado turma *

	@Autowired
	TurmaRepository turmaRepo;

	public List<Turma> listarTurmas() {
		return turmaRepo.findAll();
	}

	public Turma getTurmaById(Integer id) {
		/*
		 * Optional<Turma> turmaBanco = turmaRepo.findById(id);
		 * if(turmaBanco.isPresent()) return turmaBanco.get(); else return null;
		 */

		return turmaRepo.findById(id).orElse(null);
	}

	public Turma salvarTurma(Turma turma) {
		return turmaRepo.save(turma);
	}

	public Turma atualizarTurma(Turma turma) {
		return turmaRepo.save(turma);

	}

	public Boolean deletarTurma(Turma turma) {
		
		// verifica se turma é valido
		if(turma == null)
			return false;
		
		// verifica se existe no banco
		Turma turmaExistente = getTurmaById(turma.getCodigoTurma());
		if (turmaExistente == null)
			return false;
		
		// deleta turma
		turmaRepo.delete(turma);
		
		//verifica se foi deletado de fato
		Turma turmaContinuaExistindo = getTurmaById(turma.getCodigoTurma());
		if (turmaContinuaExistindo == null)
			return true;
		return false;
	}

}
