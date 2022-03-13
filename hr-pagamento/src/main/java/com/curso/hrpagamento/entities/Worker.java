package com.curso.hrpagamento.entities;

import java.io.Serializable;

import javax.annotation.Generated;
 
 
public class Worker implements Serializable{ 
	private static final long serialVersionUID = 1L;
	
	 
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
