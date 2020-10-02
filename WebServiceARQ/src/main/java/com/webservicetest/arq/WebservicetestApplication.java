package com.webservicetest.arq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebservicetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicetestApplication.class, args);
	}
	
	@GetMapping
	public String olaWebService() {
		return "Teste principal";
	}
	private List<Usuario> clientes = new ArrayList<Usuario>();
	@PostMapping("/usuario")
	public String cadastrar(@RequestBody Usuario pessoa) {
		clientes.add(pessoa);
		
		return "Usuario cadastrado com sucesso";
	}
	

}
