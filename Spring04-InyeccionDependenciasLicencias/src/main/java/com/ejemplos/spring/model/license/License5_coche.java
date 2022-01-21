package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("COCHE")
public class License5_coche implements License{

	@Override
	public String toString() {
		return "[Con licencia para coches]";
	}

}
