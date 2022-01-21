package com.ejemplos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplos.spring.control.EmpleadoController;

@SpringBootApplication
public class Spring03EstructuraApplication implements CommandLineRunner {

	@Autowired
	EmpleadoController emp;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring03EstructuraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 
		emp.saveEmployee();
		
	}

}
