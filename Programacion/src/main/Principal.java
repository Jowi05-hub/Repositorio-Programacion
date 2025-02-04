package main;

import main.Persona.SEXO;

public class Principal {

	public static void main(String[] args) {
		Estudiante joel=new Estudiante("Joel",19,SEXO.masculino,"DAM","1º",6);
		Estudiante Laura=new Estudiante("Laura",23,SEXO.femenino,"DAM","2º",5);
		Estudiante David=new Estudiante("David",19,SEXO.masculino,"DAM","1º",8);
		Estudiante[] arrayEstudiante= {joel,Laura,David};
		for(Estudiante e:arrayEstudiante) {
			System.out.println("soy: "+e.nombre+" y estudio "+e.getCurso());
		}
		joel.quienSoy();
	}

}
