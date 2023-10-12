package com.residencia.academia.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "codigoInstrutor", scope=Instrutor.class)
@Entity
@Table(name = "instrutor")
public class Instrutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoinstrutor")
	private Integer codigoInstrutor;
	
	@Column(name = "rg", unique = true)
	private Long rg;
	
	@Column(name = "nome")
	private String nome;
	
	@OneToOne(mappedBy = "instrutor")
	private Telefone telefone;
	
	@OneToMany(mappedBy = "instrutor")
	private List<Turma> turmas;
	
	public Integer getCodigoInstrutor() {
		return codigoInstrutor;
	}
	
	public void setCodigoInstrutor(Integer codigoInstrutor) {
		this.codigoInstrutor = codigoInstrutor;
	}
	
	public Long getRg() {
		return rg;
	}
	
	public void setRg(Long rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
	
}
