package com.curso.hrpagamento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.hrpagamento.entities.Pagamento;
import com.curso.hrpagamento.services.PagamentoServices;

@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoResources {

	@Autowired
	private PagamentoServices services; 
	
	@GetMapping(value = "/{workerId}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable  long workerId, @PathVariable Integer dias){
		Pagamento pagamento =services.getPagamento(workerId, dias);
		return ResponseEntity.ok(pagamento);
	}

}
