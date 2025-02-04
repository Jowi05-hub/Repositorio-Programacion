package main;

public class Estudiante extends Persona{
	
	private String ciclo;
	private String curso;
	private int notasProgramacion;
	public Estudiante(String nombre, int edad, SEXO sexo, String ciclo, String curso, int notasProgramacion) {
		super(nombre, edad, sexo);
		this.ciclo = ciclo;
		this.curso = curso;
		this.notasProgramacion = notasProgramacion;
	}
	public Estudiante(String nombre, int edad, SEXO sexo, String ciclo, String curso) {
		super(nombre, edad, sexo);
		this.ciclo = ciclo;
		this.curso = curso;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNotasProgramacion() {
		return notasProgramacion;
	}
	public void setNotasProgramacion(int notasProgramacion) {
		this.notasProgramacion = notasProgramacion;
	}
	@Override
	public void quienSoy() {
		System.out.println("Soy un Estudiante y me llamo "+nombre);
	}
	@Override
	public boolean equals(Object objeto) {
		Estudiante otroEstudiante=(Estudiante)objeto;
		return this.nombre.equals(otroEstudiante.nombre)&&this.edad==otroEstudiante.edad;
	}
}
