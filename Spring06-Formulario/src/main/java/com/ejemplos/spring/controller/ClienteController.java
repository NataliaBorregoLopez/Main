package com.ejemplos.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplos.spring.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	 @GetMapping
	 public String initForm(@ModelAttribute("cliente") Cliente cliente) {
		 return "form1";
	 }

	 @PostMapping
	 public String processForm(@ModelAttribute("cliente") Cliente cliente, ModelMap model) {
		 model.addAttribute(cliente);
		 return "form2";
	 }
	 
}
