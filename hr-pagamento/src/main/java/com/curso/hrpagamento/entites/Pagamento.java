package com.curso.hrpagamento.entites;

import java.io.Serializable;

public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double diaria;
	private Integer dias;
	
	public Pagamento() {
		
	}

	public Pagamento(String nome, Double diaria, Integer dias) {
		super();
		this.nome = nome;
		this.diaria = diaria;
		this.dias = dias;
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

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public double getTotal() {
		return dias * diaria;
	}
	
}
