package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("CAMION")
public class License5_camion implements License{

	@Override
	public String toString() {
		return "[Con licencia para camiones]";
	}

}
