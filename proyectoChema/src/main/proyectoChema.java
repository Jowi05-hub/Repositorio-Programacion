package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class proyectoChema {

	public static void main(String[] args) {
		ejercicio9();
		
	}
	/*Diseña una aplicación en la que el usuario introduzca una frase y el programa le indique cuántos
	 *  espacios tiene*/
	public static void ejercicio1() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		int contadorBlanco=0;
		String texto=teclado.nextLine();
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)==32) {
				contadorBlanco++;
			}
		}
		System.out.println("hay :"+contadorBlanco+" espacios en blanco");
	}
	/*Diseña una función en la que el usuario introduzca una frase y ésta devuelva e imprima por pantalla 
	 * la misma frase pero invertida. Ejemplo: Para “hola buenos dias” devolvería “said soneub aloh”*/
	public static void ejercicio2() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		for(int i=texto.length()-1;i>=0;i--) {
			System.out.print(texto.charAt(i));
		}
	}
	/*Escribe una función que pida el nombre completo al usuario y lo  muestre sin vocales. 
	 * Ejemplo: Para “Jose” mostraría “Js”.
*/
	public static void ejercicio3() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)!='a'&&texto.charAt(i)!='e'&&texto.charAt(i)!='i'&&texto.charAt(i)!='o'&&texto.charAt(i)!='u'){
				System.out.print(texto.charAt(i));
			}
		}
		//String vocales="aeiou";
				//if(vocales.indexOf(texto.length(i))<0) {
					
				//}
	}
	/*Diseñar una función que solicite al usuario una frase y una palabra. El programa le dirá al usuario cuántas veces
	 *  aparece la palabra en la frase. Ten en cuenta que dos palabras pueden estar separados por más caracteres que el 
	 *  espacio simple, como, por ejemplo, la coma y el punto.
	 *  cuantas veces aparece en este texto cuantas
*/
	public static void ejercicio4() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce una palabra");
		String palabra=teclado.nextLine();
		int contador=0;
		int posicion=posicion=-palabra.length();
		//el gato juego al futbol con otro gato
		do{
			
			posicion=texto.indexOf(palabra,posicion+palabra.length());
			if(posicion>0) {
				contador++;
				System.out.println("Palabra "+palabra+" encontrada en indice "+posicion);
			}
			
		}while(posicion>=0);
			
		System.out.println("La palabra aparece en el texto "+contador+" veces");
	}
	/*Escribe un programa que solicite al usuario dos palabras y le diga si dos palabras son anagramas una de otra.
	 *  Recordatorio: una palabra es un anagrama de otra si una se puede construir con las mismas letras que la otra, 
	 *  pero cambiadas de orden. Ejemplo: amor, roma y ramo son anagramas.*/
	public static void ejercicio5() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce un texto");
		String texto1=teclado.nextLine();
		String[] letras= texto.split(texto);
		String[] letras1= texto.split(texto1);
		boolean iguales=letras1.equals(letras1);
		if(true) {
			System.out.println("las palabras son anagramas");
		}
	}
	/*Diseña un programa que para un texto que introducirá el usuario por teclado, le indique cuántas veces se repite 
	 * cada letra.
*/
	public static void ejercicio6() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce una letra");
		short [] letras=new short [28];
		for(int i=0;i<texto.length();i++) {
			if(Character.isLetter(texto.charAt(i))) {
				
				if(texto.charAt(i)==241) {
					letras[27]++;
				}else {
					letras[(int)texto.charAt(i)-97]++;   
				}
			}
			
		}
		System.out.println(Arrays.toString(letras));
	}
	//teatro
	//me gusta mucho el teatro y voy todos los dias al teatro
	/*Implementa una aplicación que, una vez introducido un texto, permita reemplazar todas las ocurrencias de
	 *una palabra por otra distinta.*/
	public static void ejercicio7() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce una palabra");
		String palabra=teclado.nextLine();
		System.out.println("¿Por qué palabra deseas sustituir la palabra "+palabra+"?");
		String sustituta=teclado.nextLine();
		texto=texto.replaceAll(" ("+palabra+") ", " "+sustituta+" ");
		
		System.out.println(texto);
	}
	/*Crea un programa que lea una frase  del usuario por teclado y muestre una frase que contenga las mismas
	 *  palabras pero en la que éstas estén ordenadas de manera alfabética. Ejemplo: Para “El despertador es rojo”
	 *   mostraría “despertador el es rojo”*/
	public static void ejercicio8() {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		String[] palabras=texto.split("[ ,.]");
		Arrays.sort(palabras);
		for(int i=0;i<palabras.length;i++) {
			System.out.print(palabras[i]+" ");
		}
	}
	/*Diseña una aplicación que implemente una pequeña agenda. Mediante un menú, el usuario podrá:
1-Añadir un nuevo contacto (con nombre y teléfono)
2-Buscar un teléfono de un contacto a partir de un nombre.
3-Mostrar la información de todos los contactos ordenados alfabéticamente por nombre.
Puedes codificar el nombre y el teléfono en una única cadena mediante “nombre:teléfono”.
*/
	public static void ejercicio9() {
		Scanner teclado=new Scanner (System.in);
		int numero=0;
		String contactos = null;
		String quien;
		String[] numeroContacto=new String[0];
		do {
			System.out.println("1-Añadir un nuevo contacto (con nombre y teléfono)");
			System.out.println("2-Buscar un teléfono de un contacto a partir de un nombre.");
			System.out.println("3-Mostrar la información de todos los contactos ordenados alfabéticamente por nombre.");
			System.out.println("Introduce un numero dentro del menu");
			numero=teclado.nextInt();
			teclado.nextLine();
			switch(numero) {
				case 1:
					numeroContacto=Arrays.copyOf(numeroContacto, numeroContacto.length+1);
					System.out.println("Añade un número de contacto con el Nombre y el Teléfono separado por :");
					contactos=teclado.nextLine();
					for(int i=0;i<numeroContacto.length;i++) {
						numeroContacto[i]=contactos;
						System.out.println(numeroContacto[i]);
					}
					break;
				case 2:
					String[] nombre=contactos.split(":");
					System.out.println("a quien quieres buscar");
					quien=teclado.nextLine();
					teclado.nextLine();
					boolean comparacion=nombre.equals(quien);
					if(comparacion==true) {
						//ñcontactos.indexOf(nombre);
					}
					break;
				case 3:
					Arrays.sort(numeroContacto);
					System.out.println(numeroContacto.toString());
					break;
				default:
					System.out.println("no esta dentro de las opciones del menu");
					break;					
			}

		}while(numero!=-1);
	}
}
