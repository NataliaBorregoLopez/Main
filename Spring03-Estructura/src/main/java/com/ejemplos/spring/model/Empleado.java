package com.ejemplos.spring.model;

import java.util.Date;

public class Empleado {
	
	private int id;
	private String name;
	private Date fechaAlta;
	
	public Empleado() {
		super();
	}

	public Empleado(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", name=" + name + ", fechaAlta=" + fechaAlta + "]";
	}

}
