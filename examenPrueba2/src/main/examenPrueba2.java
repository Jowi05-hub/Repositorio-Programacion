package main;

import java.util.Random;
import java.util.Scanner;

public class examenPrueba2 {

	public static void main(String[] args) {
		//double num=ejercicio1(5,6);
		//System.out.println(num);
		ejercicio6();
	}
	/*Crea una función para calcular la hipotenusa en un triángulo rectángulo a partir de sus dos catetos.
	 *  La función recibirá como parámetros de entrada la longitud de estos dos catetos y retornará el valor
		de la hipotenusa. 
	 *  Ésta se calcula a partir de la expresión:
		h=a^2+b^2
		Donde a y b son las longitude de los catetos y h la de la hipotenusa que se pide calcular.
		LLama a esta función desde otra función (por ejemplo, desde main()) e imprime el valor retornado utilizando
		exactamente dos cifras decimales.
*/
	public static double ejercicio1(int cateto1,int cateto2) {
		double hipotenusa=Math.pow(cateto1, 2)+Math.pow(cateto2, 2);
		return hipotenusa;
	}
	/*Crea una función con cuatro parámetros de entrada denominados a,b,c y d, todos de tipo entero. 
	 * La función generará 25 números enteros aleatorios entre a y d y calculará cuántos números de éstos están
	 *  en los siguientes rangos:
			[a,b)
			[b,c)
			[c,d]
		La función mostrará por pantalla los resultados calculados utilizando mensajes adecuados.
		 La función no devolverá ningún valor.
*/
	public static void ejercicio2(int a,int b, int c,int d) {
		int contador=0;
		Random aleatorio=new Random();
		int num=0;
		while(contador<=25) {
			num=aleatorio.nextInt(a,d+1);
			if(num>=a&&num<b) {
				System.out.println("el numero "+num+" esta comprendido entre el rando a-->b");
			}else if (num>=b&&num<c) {
				System.out.println("el numero "+num+" esta comprendido entre el rando b-->c");
			}else if(num>=c&&num<d) {
				System.out.println("el numero "+num+" esta comprendido entre el rando c-->d");
			}
			contador++;
		}
		
	}
	/*Crea un programa que calcule y muestre por pantalla la raíz cúbica de todos los números entre 729 y 100 
	 * (en ese orden). Utiliza exactamente dos cifras decimales. 
*/
	public static void ejercicio3() {
		int num1=729;
		int num2=100;
		double raiz=0;
		for(int i=num1;i>=num2;i--) {
			raiz=Math.cbrt(i);
			System.out.println("la Raiz cubica de "+i+" es: "+raiz);
		}
	}
	/*
Ejercicio 4() Desarrolla un programa para entrenar el cálculo mental de las divisiones. El programa le mostrará 
al usuario operaciones de división de dos números enteros generados de forma aleatoria. El dividendo puede ser un 
número entre 10 y 200 y el divisor será un número entre 2 y 10. El programa pedirá al usuario que introduzca el 
cociente entero y el resto de la división. El programa continuará mostrando operaciones de división al usuario de
 forma ininterrumpida hasta que el usuario cometa un error. Para que una operación se dé por correcta deberá
  introducir de forma exacta tanto el cociente entero como el resto de la división. Por ejemplo, para la división 
  17/3 el usuario deberá introducir cociente=5 y resto=2.
*/
	public static void ejercicio4() {
		Random aleatorio=new Random();
		Scanner teclado=new Scanner(System.in);
		int dividendo=0;
		int divisor=0;
		boolean acierto=true;
		int cociente=0;
		int resto=0;
		int resultado=0;
		int resultado2=0;
		while(acierto==true) {
			dividendo=aleatorio.nextInt(10,201);
			divisor=aleatorio.nextInt(2,10);
			System.out.println(dividendo+"/"+divisor);
			System.out.println("Introduce el cociente de la división");
			cociente=teclado.nextInt();
			resultado=dividendo/divisor;
			resultado2=dividendo%divisor;
			if(resultado==cociente) {
				System.out.println("Introduce el resto de la división");
				resto=teclado.nextInt();
				if(resultado2==resto) {
					acierto=true;
				}else {
					acierto=false;
				}
			}else {
				acierto=false;
			}
			
		}
	}
	/*Crea una calculadora del Indice de Masa Corporal. El programa preguntará al usuario su peso y su altura 
	 * y calculará el IMC según la siguiente fórmula:
	IMC=peso/altura^2
Donde el peso está en kg y la altura en metros. El programa le mostrará al usuario su IMC junto a uno de los
 mensajes mostrados en la tabla en función de su IMC.



IMC
Clasificación de la OMS
0-18,50
Delgado
18,50-24,99
Adecuado
25,00-29,99
Sobrepeso
30,00-34,99
Obesidad grado 1
35,00-39.99
Obesidad grado 2

*/
	public static void ejercicio5() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu peso en KG");
		double peso=teclado.nextDouble();
		System.out.println("Introduce tu altura en M");
		double altura=teclado.nextDouble();
		double imc=peso/Math.pow(altura, 2);
		if(imc<18.51) {
			System.out.println("tu IMC es de "+imc+" y estas en la clasificación Delgado");
		}
		if(imc>=18.51&&imc<25) {
			System.out.println("tu IMC es de "+imc+" y estas en la clasificación Adecuado");
		}else if(imc>=25&&imc<30) {
			System.out.println("tu IMC es de "+imc+" y estas en la clasificación Sobrepeso");
		}else if(imc>=30&&imc<35) {
			System.out.println("tu IMC es de "+imc+" y estas en la clasificación Obesidad Grado 1");
		}else if(imc>=35&&imc<40) {
			System.out.println("tu IMC es de "+imc+" y estas en la clasificación Obesidad Grado 2");
		}
	}
	/* Se desea crear una aplicación que calcule cuántos suspensos, aprobados, bienes, notables, 
	 * sobresalientes y matrículas de honor hay en una clase de Programación del ciclo DAM.
	 *  El programa también deberá calcular la media de todas las notas, la media de las notas cuya 
	 *  calificación sea 5 o más y la media de todas las notas cuya calificación sea suspenso. 
	 *  Para ello, el programa preguntará al usuario notas hasta que introduzca un -1. El -1 se utilizará 
	 *  como método de salida. Una vez el usuario ha introducido un -1, el programa mostrará por pantalla 
	 *  cuántas calificaciones hay en cada rango y las tres medias indicadas previamente. Los rangos de las 
	 *  calificaciones son los siguientes:
Suspenso: [0,5)
Aprobado: [5,6)
Bien: [6,7)
Notable: [7,9)
Sobresaliente: [9,10)
Matrícula de honor: 10
*/
	public static void ejercicio6() {
		Scanner teclado=new Scanner(System.in);
		double nota=0;
		int suspenso=0;
		int aprobado=0;
		int raspado=0;
		int bien=0;
		int notable=0;
		int sobre=0;
		int honor=0;
		double contadorSus=0;
		double contadorA=0;
		double contadorTotal=0;
		double media=0;
		int contadorNotas=0;
		double mediaSus=0;
		double mediaA=0;
		while(nota!=-1) {
			System.out.println("Introduce una nota");
			nota=teclado.nextDouble();
			if(nota>=0&&nota<5) {
				suspenso++;
				raspado++;
				contadorSus+=nota;
			}else if(nota>=5&&nota<6) {
				aprobado++;
				contadorA+=nota;
			}else if(nota>=6&&nota<7) {
				aprobado++;
				bien++;
				contadorA+=nota;
			}else if(nota>=7&&nota<=8) {
				aprobado++;
				notable++;
				contadorA+=nota;
			}else if(nota>=8&&nota<=9) {
				aprobado++;
				sobre++;
				contadorA+=nota;				
			}else {
				aprobado++;
				honor++;
				contadorA+=nota;
				
			}	
		}
		contadorNotas=suspenso+aprobado;
		contadorTotal=contadorSus+contadorA;
		media=contadorTotal/contadorNotas;
		mediaA=contadorA/aprobado;
		mediaSus=contadorSus/suspenso;
		System.out.println("La nota media es: "+media);
		System.out.println("la nota media de suspensos es:"+mediaSus);
		System.out.println("la nota media de aprobados es:"+mediaA);
		System.out.println("hay "+suspenso+" suspensos, aprobados "+raspado+" bien "+bien+" notables "+notable+" sobresalientes "+sobre+" y matriculas de honor "+honor );
	}
}
