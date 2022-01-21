package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License;
import com.ejemplos.spring.model.license.License2;

@Component("Driver2")
public class Driver2 implements Driver{
	
	@Autowired
	@Qualifier("License2")
	private License license;

	public License getLicense() {
		return license;
	}

	public void setLicense(License2 license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Driver2 [license=" + license + "]" + " @autowired por atributos";
	}
	
	

}
