package com.ejemplos.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.dao.EmpleadoRepository;
import com.ejemplos.spring.model.Empleado;
import com.ejemplos.spring.util.Simulaciones;

@Service("employeeService")
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository employeeDao;
	
	public EmpleadoServiceImpl() {
		
	}
	
	public EmpleadoServiceImpl(EmpleadoRepository employeeDao) {
		super();
		this.employeeDao=employeeDao;
	}
		
	@Override
	public void saveEmployee(Empleado employee) {
		
		employee.setFechaAlta(Simulaciones.fechaAleatoria());
		employeeDao.saveEmployee(employee);
		
	}

}
