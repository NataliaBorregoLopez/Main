package com.ejemplos.spring.model;

import org.springframework.stereotype.Component;

@Component("TWITTER")
public class RedSocialTwitterImpl implements RedSocial{

	@Override
	public void publicar(String msg) {

		System.out.println("------------------------");
		System.out.println("-Publicación de Twitter-");
		System.out.println("------------------------");
		System.out.println("Tu tweet: " + msg);
		System.out.println("------------------------");
		
	}
	

}
