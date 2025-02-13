package calsesObjetos;

public class Punto {
/*Escribe la clase Punto, que representa un punto en el plano con sus coordenadas x e y. Estos atributos no serán accesibles desde
 *  clases externas, pero sí a través de métodos getter. Una vez creado el objeto de la clase Punto, sus coordenadas solo podrán 
 *  modificarse a partir de los métodos desplazaX(), desplazaY() y desplaza().
Esta clase tendrá los métodos:
Punto(double x, double y): Construye el objeto con los datos pasados como parámetros,
*/
	private double puntoX;
	private double puntoY;
	public Punto(double puntoX, double puntoY) {
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}
	/*void desplazaX(double dx): Incrementa la coordenada x en la cantidad especificad*/
	public void desplazaX(double dx) {
		this.puntoX=this.puntoX+dx;
		System.out.println("ahora el punto esta en la posicion X "+this.puntoX);
	}
	/*void desplazaY(double dy): Incremente la coordenada y en la cantidad especificada.*/
	public void desplazaY(double dy) {
		this.puntoY=this.puntoY+dy;
		System.out.println("ahora el punto esta en la posicion Y "+this.puntoY);
	}
	/*void desplaza(double dx,double dy): Desplaza ambas coordenadas en las cantidades especificadas*/
	public void desplaza(double dx,double dy) {
		this.puntoX=this.puntoX+dx;
		this.puntoY=this.puntoY+dy;
	}
	/*double distancia(Punto otro): Calcula la distancia entre el punto que invoca al método y el pasado como parámetro.*/
	public double distancia(Punto otropunto) {
		double otropuntoX = 0;
		double otropuntoY = 0;
		double distancia=Math.sqrt(Math.pow(puntoX-otropuntoX, 2)+Math.pow(puntoY-otropuntoY, 2));
		return distancia;
	}
	/*void muestra(): Muestra la información del punto por pantalla.*/
	public void muestra() {
		System.out.println("El punto esta situado en la cordenada X "+this.puntoX+" y en el punto Y "+this.puntoY);
		
	}
}
