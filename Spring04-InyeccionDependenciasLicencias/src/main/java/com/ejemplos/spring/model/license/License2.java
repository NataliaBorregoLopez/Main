package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("License2")
public class License2 implements License{
	
	private String number = "01234567B";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License2 [number=" + number + "]";
	}

}
