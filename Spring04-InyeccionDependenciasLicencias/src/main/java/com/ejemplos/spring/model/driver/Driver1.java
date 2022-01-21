package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License;
import com.ejemplos.spring.model.license.License1;

@Component("Driver1")
public class Driver1 {

	private License license;
	
	@Autowired
	@Qualifier("License1")
	public void setLicense (License license) {
		this.license = license;
	}
	
	public License getLicense() {
		return license;
	}

	@Override
	public String toString() {
		return "Driver1 [license=" + license + "]" + " @autowired por setter";
	}

}
