package com.curso.hrworker.entities;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_WORKER")
public class Worker implements Serializable{ 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double diaria;
	
	
	public Worker() {
		
	}


	public Worker(Long id, String nome, Double diaria) {
		super();
		this.id = id;
		this.nome = nome;
		this.diaria = diaria;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getDiaria() {
		return diaria;
	}


	public void setDiaria(Double diaria) {
		this.diaria = diaria;
	}
	
	
}
