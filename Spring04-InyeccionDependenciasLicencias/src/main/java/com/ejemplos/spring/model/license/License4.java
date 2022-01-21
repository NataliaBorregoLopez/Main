package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component
public class License4 implements License{

	private String number = "01234567D";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License4 [number=" + number + "]";
	}
	
}
