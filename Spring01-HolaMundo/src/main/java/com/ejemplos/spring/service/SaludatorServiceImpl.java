package com.ejemplos.spring.service;

import org.springframework.stereotype.Component;

@Component
public class SaludatorServiceImpl implements SaludatorService{

	@Override
	public void saludar(String saludo) {

		System.out.println("Hola coleguis" + saludo);
		
	}

}
