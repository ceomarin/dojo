package com.ceomarin.proyectoclass.clases;

public class Project {

	private String nombre;
	private String descripcion;
	private double initialCost;

	public Project() {

	}

	public Project(String name) {
		this.nombre = name;
	}

	public Project(String name, String description) {
		this.nombre = name;
		this.descripcion = description;
	}

	public String elevatorPitch() {
		return this.nombre + "(" + this.initialCost + ") : " + this.descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String description) {
		this.descripcion = description;
	}

	public double getInitialCost() {
		return this.initialCost;
	}

	public void setInitialCost(double cost) {
		this.initialCost = cost;
	}
}
