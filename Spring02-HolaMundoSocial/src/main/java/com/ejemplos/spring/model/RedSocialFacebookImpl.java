package com.ejemplos.spring.model;

import org.springframework.stereotype.Component;

@Component("FACEBOOK")
public class RedSocialFacebookImpl implements RedSocial {

	@Override
	public void publicar(String msg) {
		System.out.println("-------------------------");
		System.out.println("-Publicación de Facebook-");
		System.out.println("-------------------------");
		System.out.println("Tu muro: " + msg);
		System.out.println("-------------------------");
	}
}
