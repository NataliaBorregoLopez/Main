package com.ejemplos.spring.dao;

import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Empleado;

@Repository("employeeDao")
public class EmpleadoRepositoryImpl implements EmpleadoRepository{

	@Override
	public void saveEmployee(Empleado employee) {
		
		System.out.println("Empleado " + employee.getName() + " registrado.");
		System.out.println("Dia del registro " + employee.getFechaAlta());
		
	}

}
