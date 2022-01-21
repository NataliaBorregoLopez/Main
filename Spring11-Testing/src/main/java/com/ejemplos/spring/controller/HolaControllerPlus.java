package com.ejemplos.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ejemplos.spring.service.HolaService;

@Controller
public class HolaControllerPlus {

	@Autowired
	private HolaService serv;
	
	@RequestMapping("/plus")
	public @ResponseBody String greeting() {
		return serv.saludar();
	}
	
}
