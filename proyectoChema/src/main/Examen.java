package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		ejercicio3();

	}
	public static void ejercicio1() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine().toLowerCase();
		String [] palabras=frase.split(" ");
		String vocales="aeiouáéíóú";
		String salida="";
		for(String palabra:palabras) {
			char letra1=palabra.charAt(0);
			char letraU=palabra.charAt(palabra.length()-1);
			
			if(vocales.indexOf(letra1)<0&&vocales.indexOf(letraU)>=0) {
				salida+=palabra.charAt(0)+palabra.substring(1,palabra.length()-1).toUpperCase()+palabra.charAt(palabra.length()-1);
			}else if(vocales.indexOf(letra1)<0&&vocales.indexOf(letraU)<0) {
				salida+=palabra.toUpperCase();
			}else if(vocales.indexOf(letra1)>=0&&vocales.indexOf(letraU)<0) {
				salida+=Character.toUpperCase(letra1)+palabra.substring(1,palabra.length()-1)+Character.toUpperCase(letraU);
			}else {
				salida+=palabra;
			}
			salida+=" ";
		}
		System.out.println(salida);
	}

	public static void ejercicio2() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine();
		String largaOCorta = null;
		int  vocales=0;
		int mayusculas=0;
		int consonante=0;
		int minusculas=0;
		String[] palabras=frase.split(" ");
		for(String palabra:palabras) {
			vocales=0;
			consonante=0;
			mayusculas=0;
			minusculas=0;
			for (int i=0;i<palabra.length();i++) {
				
				if(esVocal(palabra.charAt(i))) {
					vocales++;
				}else {
					consonante++;
				}
				if(Character.isUpperCase(palabra.charAt(i))) {
					mayusculas++;
				}else {
					minusculas++;
				}
				largaOCorta=palabra.length()>4?"LARGA":"CORTA";
			}
			
			System.out.println(palabra+": vocales "+vocales+"; consonantes "+consonante+"; mayusculas "+mayusculas+"; minusculas "+minusculas+"; "+largaOCorta);
		}
	}
	public static boolean esVocal(Character letra) {
		String vocales="aeiouAEIOUÁÉÍÓÚáéíóú";
		return vocales.indexOf(letra)>=0;
	}
	public static void ejercicio3() {
		LocalDateTime fechaHoy=LocalDateTime.now();
		DateTimeFormatter formato1=DateTimeFormatter.ofPattern("dd' de 'MMMM' del 'yyyy ");
		DateTimeFormatter formato2=DateTimeFormatter.ofPattern("dd' de 'MMMM' del 'yy ");
		DateTimeFormatter formato3=DateTimeFormatter.ofPattern("dd-M-yy");
		DateTimeFormatter formato4=DateTimeFormatter.ofPattern("'Dia: 'dd' Mes: 'MM' Año: ' yyyy");
		DateTimeFormatter formato5=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(fechaHoy.format(formato1));
		System.out.println(fechaHoy.format(formato2));
		System.out.println(fechaHoy.format(formato3));
		System.out.println(fechaHoy.format(formato4));
		System.out.println(fechaHoy.format(formato5));
		
	}
}
