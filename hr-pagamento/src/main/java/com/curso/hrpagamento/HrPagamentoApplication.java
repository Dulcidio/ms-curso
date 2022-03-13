package com.curso.hrpagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPagamentoApplication.class, args);
	}

}
