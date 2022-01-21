package com.ejemplos.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ejemplos.spring.model.Empleado;
import com.ejemplos.spring.service.EmpleadoService;

@Controller("EmployeeControl")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empService;
	
	public void saveEmployee() {
		
		Empleado employee = new Empleado ("Natalia Borrego");
		empService.saveEmployee(employee);
		
	}

}
