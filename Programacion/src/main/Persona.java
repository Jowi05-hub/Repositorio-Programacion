package main;

public class Persona {
	public enum SEXO{masculino,femenino};
	protected String nombre;
	protected int edad;
	protected SEXO sexo;
	public Persona(String nombre, int edad, SEXO sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public SEXO getSexo() {
		return sexo;
	}
	public void setSexo(SEXO sexo) {
		this.sexo = sexo;
	}
	public void quienSoy() {
		System.out.println("Soy una persona y m llamo "+nombre);
	}
}
