package com.ejemplos.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejemplos.spring.model.User;
import com.ejemplos.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/")
	public String listUsers(Model m) {
		log.info("----Dentro del método listUsers()----");
		m.addAttribute("userList", service.findAll());
		log.info("----En medio del método listUsers()----");
		return "UserList";
	}
	
	@GetMapping("/edit")
	public String editUser(@RequestParam("id") int id, Model m) {
		m.addAttribute("user", service.findById(id));
		return "UserForm";
	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") int id) {
		service.deleteById(id);
		return "redirect:/";
	}
	
	@GetMapping("/new")
	public String newUser(User user, Model m) {
		m.addAttribute("user", user);
		return "UserForm";
	}
	
	@PostMapping("/save")
	public String saveUser(User user) {
		service.save(user);
		return "redirect:/";
	}
	
}
