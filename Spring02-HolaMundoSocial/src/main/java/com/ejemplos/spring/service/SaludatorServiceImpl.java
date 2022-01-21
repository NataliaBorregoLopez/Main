package com.ejemplos.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.RedSocial;

@Component("MENSAJE")
public class SaludatorServiceImpl implements SaludatorService{

	@Autowired
	@Qualifier("INSTAGRAM")
	private RedSocial redSocial;
	
	public SaludatorServiceImpl() {
		super();
	}
	
	public SaludatorServiceImpl(RedSocial redSocial) {
		super();
		this.redSocial = redSocial;
	}

	public RedSocial getRedSocial() {
		return redSocial;
	}

	public void setRedSocial(RedSocial redSocial) {
		this.redSocial = redSocial;
	}

	@Override
	public void saludar(String saludo) {

		redSocial.publicar(saludo);
		
	}

}
