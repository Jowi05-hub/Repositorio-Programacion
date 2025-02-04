package main;

import java.time.LocalDate;

public class Profesor extends Persona {
	private String[] modulos;
	private LocalDate fechaInicio;
	public Profesor(String nombre, int edad, SEXO sexo, String[] modulos, LocalDate fechaInicio) {
		super(nombre, edad, sexo);
		this.modulos = modulos;
		this.fechaInicio = fechaInicio;
	}
	public String[] getModulos() {
		return modulos;
	}
	public void setModulos(String[] modulos) {
		this.modulos = modulos;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
}
