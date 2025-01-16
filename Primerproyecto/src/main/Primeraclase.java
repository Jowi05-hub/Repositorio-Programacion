package main;

import java.util.Scanner;

public class Primeraclase {

	public static void main(String[] args) {
		int edad=30;
		double precio=3.15;
		String nombre="Juan";
		byte valor2=3;
		char letra= 'f';
		
		//System.out.println("Hola Mundo");
		//System.out.println("hola me llamo " +nombre+" y tengo "+edad+" años");
		//Lectura de datos
		//System.out.print("Introduce un Número: ");
		//Scanner teclado=new Scanner (System.in);
		//int num=teclado.nextInt();
		
				//System.out.print("El número es "+num);
		Scanner teclado1=new Scanner (System.in);
		System.out.println("Escribe tu nombre: ");
		String palabra=teclado1.nextLine();
		System.out.println("Introduce tu edad: ");
		int edadAlumno=teclado1.nextInt();
		System.out.println("Tu nombre es: "+palabra+" y tienes "+edadAlumno+" años");
		
			}

}
