package com.ejemplos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplos.spring.service.SaludatorService;

@SpringBootApplication

//Se pone este implements para ejecutar un ejercicio NO-web (con su método RUN)
public class Spring01HolaMundoApplication implements CommandLineRunner{

	//Forma clásica:
	//SaludatorService s = new SaludatorServiceImpl();
	
	@Autowired
	SaludatorService pub;
	
	public static void main(String[] args) {
		
		SpringApplication.run(Spring01HolaMundoApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		pub.saludar(" :3 ");
		
	}

}
