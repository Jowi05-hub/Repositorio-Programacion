package calsesObjetos;

import java.util.Scanner;

public class pelicula {
	public enum Genero {Acción,Aventura,Terror,Comedia}

	
	/*• Título
• Director
• Duración en minutos
• Género. Es un dato de tipo enumerado, con los valores “Acción”, “Aventura”, “Terror” o 
“Comedia”.
*/
	private String titulo;
	private String director;
	private int  duracion;
	private Genero genero;
	//private String genero={"Acción",Aventura,Terror,Comedia};
	/*Un constructor con los parámetros título, director, duración en minutos y
	género*/
	public void parametros(String titulo,String director,int duracion,Genero genero) {
		this.titulo=titulo;
		this.director=director;
		this.duracion=duracion;
		this.genero=genero;
	}
	/* Un método para devolver cada uno de los atributos (cuatro métodos en total).*/
	public void titulo() {
		System.out.println(this.titulo);
	}
	public void director() {
		System.out.println(this.director);
	}
	public void duracion() {
		System.out.println(this.duracion);
	}
	public void genero() {
		//System.out.println(this.genero);
	}
	/*Un método para cambiar el valor de cada uno de los atributos (cuatro métodos en total).
*/
	public void tituloCambiar(String titulo1) {
		//Scanner teclado=new Scanner (System.in);
		//System.out.println("Que titulo nuevo quieres poner para esta pelicula");
		this.titulo=titulo1;
		System.out.println("El titulo de la pelicula es: "+this.titulo);
	}
	public void directorCambiar(String director1) {
		//Scanner teclado=new Scanner (System.in);
		//System.out.println("Que director nuevo quieres poner para esta pelicula");
		this.director=director1;
		System.out.println("el director es: "+this.director);
	}
	public void duracionCambiar(int duracion1) {
		//Scanner teclado=new Scanner (System.in);
		//System.out.println("Que duracion nueva quieres poner para esta pelicula");
		this.duracion= duracion1;
		System.out.println("el director es: "+this.duracion);
	}
	public void generoCambiar(Genero genero1) {
		this.genero=genero1;
	}
	/*Un método que muestre la información por pantalla formateada de una
manera adecuada. La duración de la película se mostrará en horas y minutos.
Por ejemplo, para 95 minutos mostraría 1h 5min. (método toString())
*/
	public void infoPelicula() {
		int horas=0;
		int minutos=this.duracion;
		while(minutos>60) {
			horas=minutos/60;
			minutos=minutos-60*horas;
			
		}
		
		System.out.println("El titulo de la pelicula es:"+this.titulo+"\nEl director de la pelicula es:"+this.director+"\nLa pelicula dura:"+horas+" horas "+minutos+" minutos \nEl genero de la Pelicula es:"+this.genero);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
