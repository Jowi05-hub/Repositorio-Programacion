package calsesObjetos;

import calsesObjetos.pelicula.Genero;

public class Ejercicio2Pelicula {

	public static void main(String[] args) {
		pelicula p1=new pelicula();
		p1.parametros("naviad", "broncano", 180, Genero.Comedia);
		p1.infoPelicula();
	}

}
