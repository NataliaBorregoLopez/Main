package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("License1")
public class License1 implements License {
	
	private String number = "01234567A";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License1 [number=" + number + "]";
	}

}
