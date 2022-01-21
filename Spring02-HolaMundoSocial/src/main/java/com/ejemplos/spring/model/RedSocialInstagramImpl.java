package com.ejemplos.spring.model;

import org.springframework.stereotype.Component;

@Component("INSTAGRAM")
public class RedSocialInstagramImpl implements RedSocial{

	@Override
	public void publicar(String msg) {
		
		System.out.println("--------------------------");
		System.out.println("-Publicación de Instagram-");
		System.out.println("--------------------------");
		System.out.println("Tu historia: " + msg);
		System.out.println("--------------------------");
		System.out.println("............(¯`'..");
		System.out.println("..............(¯'.(¯'............._/)/)");
		System.out.println("...............(¯'..(¯'........((.....((");
		System.out.println("................(¯`'.(¯'....((.)..(. ' /)");
		System.out.println(".................(¯`'..(¯'((.)....|\\_/");
		System.out.println(".....,,,~\"¯¯¯`'¯(_¸´(_.)......|");
		System.out.println("...(((./...........................)__");
		System.out.println("..((((.\\......),,...........(...../__`\\");
		System.out.println("..))))..\\ . .//...¯¯¯¯¯¯¯' \\.../... / /");
		System.out.println(".(((...../ .// .............. | ./.....\\/");
		System.out.println(".))).....| ||.................| |...........???");
		System.out.println("((........) \\\\.................) \\...........\\|/");
		System.out.println(".^^^^.\"\"'\"'.^^^^^^^..\"\"\".^^^^.\"\"\"\"");
	}

}
