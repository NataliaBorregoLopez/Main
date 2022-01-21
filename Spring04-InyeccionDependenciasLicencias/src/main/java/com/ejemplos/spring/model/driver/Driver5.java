package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License;

@Component("Driver5")
public class Driver5 implements Driver {

	@Autowired
	@Qualifier("CAMION")
	private License license;

	@Override
	public String toString() {
		return "Driver5 [license=" + license + "]" + " @Qualifier para elegir licencia.";
	}
	
	
	
}
