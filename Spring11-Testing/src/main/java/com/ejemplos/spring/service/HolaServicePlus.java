package com.ejemplos.spring.service;

import org.springframework.stereotype.Service;

@Service
public class HolaServicePlus implements HolaService{

	public String saludar() {
		return "Plus";
	}
	
}
