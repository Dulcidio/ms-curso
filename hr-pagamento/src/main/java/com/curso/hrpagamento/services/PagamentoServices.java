package com.curso.hrpagamento.services;

import org.springframework.stereotype.Service;

import com.curso.hrpagamento.entites.Pagamento;

@Service
public class PagamentoServices {

	public Pagamento getPagamento(long workerId, int dias) {
		return new Pagamento("Bob",200.00,dias);
	}
}
