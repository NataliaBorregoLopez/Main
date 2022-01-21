package com.ejemplos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ejemplos.spring.model.driver.Driver1;
import com.ejemplos.spring.model.driver.Driver2;
import com.ejemplos.spring.model.driver.Driver3;
import com.ejemplos.spring.model.driver.Driver4;
import com.ejemplos.spring.model.driver.Driver5;

@SpringBootApplication
public class Spring04InyeccionDependenciasLicenciasApplication implements CommandLineRunner{

	@Autowired
	Driver1 driver1;
	@Autowired
	Driver2 driver2;
	@Autowired
	Driver3 driver3;
	@Autowired
	Driver4 driver4;
	@Autowired
	Driver5 driver5;
	
	public static void main(String[] args) {
		SpringApplication.run(Spring04InyeccionDependenciasLicenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Driver1 Details: " + driver1);
		System.out.println("Driver2 Details: " + driver2);
		System.out.println("Driver3 Details: " + driver3);
		System.out.println("Driver4 Details: " + driver4);
		System.out.println("Driver5 Details: " + driver5);
	}

}
