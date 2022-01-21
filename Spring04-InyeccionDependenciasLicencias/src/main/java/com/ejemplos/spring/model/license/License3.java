package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("License3")
public class License3 implements License{
	
	private String number = "01234567C";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License3 [number=" + number + "]";
	}

}
