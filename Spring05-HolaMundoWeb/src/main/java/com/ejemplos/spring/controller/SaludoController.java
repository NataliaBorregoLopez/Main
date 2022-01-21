package com.ejemplos.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/welcome")
public class SaludoController {

	@GetMapping
	public String welcome(
			
		@RequestParam(value="name", required=false, defaultValue="colegui")String name, Model model) {
			
		model.addAttribute("greeting", "¡Cuánto tiempo sin verte!");
		model.addAttribute("name", name);
		model.addAttribute("fecha", new Date());
		
		return "saludo";
		
	}

}
