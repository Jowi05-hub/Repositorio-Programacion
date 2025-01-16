package main;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		array2();
	}
	public static void array1() {
		int[] edades=new int[5];
		edades[0]=34;
		edades[1]=23;
		edades[2]=4;
		edades[3]=3;
		edades[4]=5;
		/*System.out.println("Elemento 0: "+edades[0]);
		System.out.println("Elemento 0: "+edades[1]);
		System.out.println("Elemento 0: "+edades[2]);
		System.out.println("Elemento 0: "+edades[3]);
		System.out.println("Elemento 0: "+edades[4]);*/
		for (int i=0;i<5;i++) {
			System.out.println("Elemento "+i+": "+edades[i]);
		}
	}
	public static void array2() {
		String[] nombres={"María","Laura","Tomas","Alvaro","Ruben","Lucia"};
		int j=0;
		while(j<nombres.length) {
			System.out.println("elemento "+j+": "+nombres[j]);
			j++;
		}
		for(String nombre:nombres){
			System.out.println("nombre alumnos "+nombre); 
		}
	}
	public static void ejemplo2() {
		int[] sueldos=new int[0];
		int sueldo=0;
		
	}
}
