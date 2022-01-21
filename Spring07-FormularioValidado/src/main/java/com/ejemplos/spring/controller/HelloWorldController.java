package com.ejemplos.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import com.ejemplos.spring.model.Student;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@GetMapping
	public String newRegistration(ModelMap model) {
		model.addAttribute("student", new Student());
		System.out.println("--Dentro del controller--");
		return "registro";
	}

	@PostMapping
	public String saveRegistration(@Valid Student student, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			System.out.println("--Hay algunos errores--");
			return "registro";
		}
		model.addAttribute("success",
				"Estimado " + student.getFirstName() + ", su regitro se ha completado correctamente");
		return "resumen";
	}
	
	@ModelAttribute("sections")
	public List<String> initializaSections() {
		List<String> sections = new ArrayList<String>();
		sections.add("Graduado");
		sections.add("Licenciado");
		sections.add("Ingeniero");
		sections.add("Doctorado");
		return sections;
	}
	
	@ModelAttribute("countries")
	public List<String> initializaCountries() {
		List<String> countries = new ArrayList<String>();
		countries.add("ESPAÑA");
		countries.add("USA");
		countries.add("CANADA");
		countries.add("FRANCIA");
		countries.add("ALEMANIA");
		countries.add("ITALIA");
		countries.add("Otros sitios");
		return countries;
	}
	
	@ModelAttribute("subjects")
	public List<String> initializaSubjects() {
		List<String> subjects = new ArrayList<String>();
		subjects.add("Fisica");
		subjects.add("Quimica");
		subjects.add("Matematicas");
		subjects.add("Politica");
		subjects.add("Chanfle");
		subjects.add("Informatica");
		return subjects;
	}
	
}
