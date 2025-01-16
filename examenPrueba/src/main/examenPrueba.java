package main;

import java.util.Random;
import java.util.Scanner;

public class examenPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double volumen=ejercicio3(2.5,4.8);
		//System.out.println("el volumen es "+volumen);
		//boolean par=ejercicio1(2,10,20);
		//System.out.println(par);
		ejercicio2();
	}
	/*Crea una función que reci
	 * 
	 * ba tres parámetros de entrada denominados min, max y cantidad. 
	 * Esta función deberá imprimir por pantalla cantidad, números enteros generados aleatoriamente entre min y max (incluidos).
	 *  La función deberá calcular cuántos números pares e impares hay y devolver true si el
	 *   número de pares es mayor o igual que el número de impares y false en caso contrario.
*/
	public static boolean ejercicio1(int min, int max,int cantidad) {
		Random aleatorio=new Random();
		boolean par=false;
		int random=0;
		int contadorPares=0;
		int contadorImpares=0;
		while(cantidad>0) {
			random=aleatorio.nextInt(min, max+1);
			if(random%2==0) {
				par=true;
				System.out.println("el "+random+" es par? "+par);
				contadorPares++;
			}else {
				par=false;
				System.out.println("el "+random+" es par? "+par);
				contadorImpares++;
			}
			cantidad--;
		}
		boolean paresOImpares=contadorPares>contadorImpares;
		return paresOImpares;
	}
	/*Desarrolla un programa para mejorar el cálculo mental de las potencias. El programa generará dos números aleatorios: 
	 * base, que puede ser un número entre 2 y 10 y exponente que podrá ser:
		Un número entre 2 y 10 si base es 2.
		Un número entre 2 y 5 si base es 3
		Un número entre 2 y 4 si base es 4
		Un número entre 2 y 3 si base es 5
		Un 2 si base está entre 6 y 10.
*/
	public static void ejercicio2() {
		Random aleatorio=new Random();
		Scanner teclado=new Scanner(System.in);
		int base=aleatorio.nextInt(2,11);
		int exponente=aleatorio.nextInt();
		int contador=0;
		boolean acierto=true;
		while(acierto=true) {
			if(base==2) {
				base=aleatorio.nextInt(2,11);
				exponente=aleatorio.nextInt(2,11);
				int resultado=1;
					 for(int i=0;i<exponente;i++) {
						 resultado*=base;
					 }
				System.out.println("introduce el resultado de la potencia "+base+"^"+exponente);
				int valorIntroducido=teclado.nextInt();
				if(resultado==valorIntroducido) {
					acierto=true;
					contador++;
				}else {
					acierto=false;
					System.out.println("has respondido bien a "+contador);
					System.out.println("el resultado es "+resultado);
					break;
				}
			}else if(base==3) {
				base=aleatorio.nextInt(2,11);
				exponente=aleatorio.nextInt(2,6);
				int resultado=1;
				for(int i=0;i<exponente;i++) {
					 resultado*=base;
				 }
				System.out.println("introduce el resultado de la potencia "+base+"^"+exponente);
				int valorIntroducido=teclado.nextInt();
				if(resultado==valorIntroducido) {
					acierto=true;
					contador++;
				}else {
					acierto=false;
					System.out.println("has respondido bien a "+contador);
					System.out.println("el resultado es "+resultado);
					break;
				}
			}else if(base==4) {
				base=aleatorio.nextInt(2,11);
				exponente=aleatorio.nextInt(2,4);
				int resultado=1;
				for(int i=0;i<exponente;i++) {
					 resultado*=base;
				 }
				System.out.println("introduce el resultado de la potencia "+base+"^"+exponente);
				int valorIntroducido=teclado.nextInt();
				if(resultado==valorIntroducido) {
					acierto=true;
					contador++;
				}else {
					acierto=false;
					System.out.println("has respondido bien a "+contador);
					System.out.println("el resultado es "+resultado);
					break;
				}
			}else if(base==5){
				base=aleatorio.nextInt(2,11);
				exponente=aleatorio.nextInt(2,3);
				int resultado=1;
				for(int i=0;i<exponente;i++) {
					 resultado*=base;
				 }
				System.out.println("introduce el resultado de la potencia "+base+"^"+exponente);
				int valorIntroducido=teclado.nextInt();
				if(resultado==valorIntroducido) {
					acierto=true;
					contador++;
				}else {
					acierto=false;
					System.out.println("has respondido bien a "+contador);
					System.out.println("el resultado es "+resultado);
					break;
				}
			}else {
				base=aleatorio.nextInt(2,11);
				exponente=2;
				int resultado=1;
				for(int i=0;i<exponente;i++) {
					 resultado*=base;
				 }
				System.out.println("introduce el resultado de la potencia "+base+"^"+exponente);
				int valorIntroducido=teclado.nextInt();
				if(resultado==valorIntroducido) {
					acierto=true;
					contador++;
				}else {
					acierto=false;
					System.out.println("has respondido bien a "+contador);
					System.out.println("el resultado es "+resultado);
					break;
				}
			}
		}
	}
	/*Crea una función que calcule y devuelva el volumen de un cono. La función recibirá como parámetros de entrada dos 
	 * números decimales, el radio y la altura y devolverá el volumen, que se calcula mediante la siguiente expresión:*/
	public static double ejercicio3(double radio, double altura) {
		double volumen=(Math.PI*Math.pow(radio, 2)*altura)/3;
		return volumen;
	}
	/* Crea una aplicación para calcular cuántos salarios brutos anuales hay en cada uno de estos tramos:
	 * 	
	Tramo 1
	Menos de 15.000
	Tramo 2
	Entre 15.000 y 19.999
	Tramo 3
	Entre 20.000 y 24.999
	Tramo 4
	Entre 25.000 y 34.999
	Tramo 5
	35000 o más


La aplicación pedirá salarios hasta que el usuario introduzca un salario negativo (que se usará como método de escape). 
Los salarios serán números enteros. Cada vez que se le pida un salario al usuario se le mostrará un mensaje adecuado y,
 en cada uno de estos mensajes se mostrará cuántos salarios ha introducido hasta ahora. Cuando el usuario termine de introducir los
  salarios se le mostrará cuántos salarios hay en cada uno de los tramos antes mencionados.
*/
	public static void ejercicio4() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un salario");
		int salario=teclado.nextInt();
		int tramo1=0;
		int tramo2=0;
		int tramo3=0;
		int tramo4=0;
		int tramo5=0;
		int totalSalarios=0;
		while(salario>0) {
			if(salario<15000) {
				tramo1++;
				totalSalarios++;
			}else if(salario>=15000&&salario<20000) {
				tramo2++;
				totalSalarios++;
			}else if(salario>19999&&salario<25000){
				tramo3++;
				totalSalarios++;
			}else if(salario>24999&&salario<35000) {
				tramo4++;
				totalSalarios++;
			}else {
				tramo5++;
				totalSalarios++;
			}
			System.out.println("Has introducido "+totalSalarios+" de tramo1 hay: "+tramo1+" de tramo2 hay: "+tramo2+" de tramo3 hay "+tramo3+" de tramo4 hay: "+tramo4+" de tramo5 hay: "+tramo5);
			salario=teclado.nextInt();
		}
		/*Crea una aplicación que reciba como parámetro un número entero de tipo short. Este valor representa 
		 * el número de días que han transcurrido desde el inicio de año. Se pide que la función muestre por
		 *  pantalla el día y mes del año en el que estamos, teniendo en cuenta que:
Enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días.
Febrero tiene 28 días
El resto de meses tienen 30 días.
*/
	
	}
	public static void ejercicio5(short dia) {
		int dia1=0;
		if(dia<32) {
			
			
			
			
			
			
			
			for(int i=1;i<=dia;i++) {
				dia1++;
				
			}
			System.out.println(dia1+" de Enero");
		}
		if(dia>31&&dia<60) {
			for(int i=31;i<=dia;i++) {
				dia1++;
			}
			System.out.println(dia1+" de febrero");
		}
		if(dia>59&&dia<91) {
			for(int i=59;i<=dia;i++) {
				dia1++;
			}
			System.out.println(dia1+" de Marzo");
		}
		if(dia>91&&dia<121) {
			for(int i=91;i<=dia;i++) {
				dia1++;
			}
			System.out.println(dia1+" de Abril");
		}
		if(dia>120&&dia<152) {
			for(int i=120;i<=dia;i++) {
				dia1++;
			}
			System.out.println(dia1+" de Mayo");
		}
		if(dia>151&&dia<182) {
			for(int i=151;i<=dia;i++) {
				dia1++;
				
			
			}
			System.out.println(dia1+" de Junio");
		}
		if(dia>181&&dia<214) {
			for(int i=181;i<=dia;i++) {
				System.out.println(dia1+" de Julio");
				dia1++;
			}
			System.out.println(dia1+" de Julio");
		}
		if(dia>213&&dia<245) {
			for(int i=1;213<=dia;i++) {
				dia1++;
			}
			System.out.println(dia1+" de Agosto");
		}
		if(dia>244&&dia<275) {
			for(int i=244;i<=dia;i++) {
				dia1++;				
			}
			System.out.println(dia1+" de septiembre");
		}
		if(dia>274&&dia<306) {
			for(int i=274;i<=dia;i++) {
				dia1++;	
			}
			System.out.println(dia1+" de Octubre");
		}
		if(dia>305&&dia<336) {
			for(int i=305;i<=dia;i++) {
				dia1++;				
			}
			System.out.println(dia1+" de Noviembre");
		}
		if(dia>335&&dia<366) {
			for(int i=335;i<=dia;i++) {
				dia1++;			
			}
			System.out.println(dia1+" de Diciembre");
		}
	
	}
	/*Crea una función que, utilizando un doble bucle for, imprima las tablas de multiplicar del 1 al 10. Por ejemplo, 
	 * para la tabla del dos imprimiría:
Tabla del 2
2x1=2
2x2=4
2x3=6
2x4=8
2x5=10
2x6=12
2x7=14
2x8=16
2x9=18
2x10=20
------------------

Debes respetar el formato de salida mostrado.
*/
	public static void ejercicio6() {
		for(int i=1;i<=10;i++) {
			System.out.println("-------------");
			for(int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+j*i);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
