package main;

import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		ejercicio2();

	}
	public static void ejercicio1() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("introduce un número");
		int num1=teclado.nextInt();
		int suma=0;
		for(int i=0;i<=num1;i++) {

				suma+=i;
				
			
		}
		System.out.println(suma);
	}
	public static void ejercicio2() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la base y altura que quieras para la forma");
		int n=teclado.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}	
			for(int j=0;j<n-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
	}
	public static void ejercicio3() {
		
	}
}
