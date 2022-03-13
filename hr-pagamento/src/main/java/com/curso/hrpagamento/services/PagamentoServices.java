package com.curso.hrpagamento.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.hrpagamento.entities.Pagamento;
import com.curso.hrpagamento.entities.Worker;

@Service
public class PagamentoServices {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
		
	public Pagamento getPagamento(long workerId, int dias) {
		Map<String, String>uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		
		Worker worker =restTemplate.getForObject(workerHost+"/workers/{id}",Worker.class,uriVariables);
		return new Pagamento(worker.getNome(),worker.getDiaria(),dias);
	}

}
