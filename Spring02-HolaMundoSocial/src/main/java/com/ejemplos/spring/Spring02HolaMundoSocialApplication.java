package com.ejemplos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplos.spring.service.SaludatorService;

@SpringBootApplication
public class Spring02HolaMundoSocialApplication implements CommandLineRunner {
	
	@Autowired
	SaludatorService serv;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring02HolaMundoSocialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
				serv.saludar("Hola coleguis :)");
		
	}

}
