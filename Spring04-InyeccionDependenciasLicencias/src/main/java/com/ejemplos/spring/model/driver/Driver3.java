package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License;
import com.ejemplos.spring.model.license.License3;

@Component("Driver3")
public class Driver3 implements Driver{
	
	
	private License license;
	
	//@Autowired
	//@Qualifier("License3")
	public Driver3 (License license) {
		this.license=license;
	}

	@Override
	public String toString() {
		return "Driver3 [license=" + license + "]" + " @Autowired por constructores";
	}
	
	
}
