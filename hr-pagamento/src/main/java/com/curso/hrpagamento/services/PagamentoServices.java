package com.curso.hrpagamento.services;

import org.springframework.stereotype.Service;

import com.curso.hrpagamento.entities.Pagamento;

@Service
public class PagamentoServices {
	
	public Pagamento getPagamento(long workerId, int dias) {
		return new Pagamento("Bobo",200.0, dias);
	}

}
