package com.ejemplos.spring.model.driver;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License4;

@Component("Driver4")
public class Driver4 implements Driver{

	@Resource(name = "license4")
	private License4 license;

	@Override
	public String toString() {
		return "Driver4 [license=" + license + "]" + " @resource con nombre";
	}
}
