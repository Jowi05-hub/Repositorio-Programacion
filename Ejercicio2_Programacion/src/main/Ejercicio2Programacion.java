package main;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2Programacion {

	public static void main(String[] args) {
		ejercicio12();

	}
	/*Pide dos números por teclado e indica con un mensaje en pantalla si ambos son iguales o no.*/
	public static void ejercicio1() {
		System.out.println("Dime un número");
		Scanner teclado=new Scanner(System.in);
		int num1=teclado.nextInt();
		System.out.println("Dime un número");
		Scanner teclado1=new Scanner(System.in);
		int num2=teclado1.nextInt();
		if(num1==num2){
		System.out.println("El numero es igual");	
		
		}else{
			System.out.println("El numero no es igual");
		}
		
	}
	/*Solicita dos números distintos y muestra cuál es el mayor.*/
	public static void ejercicio2() {
		System.out.println("Dime un número");
		Scanner teclado=new Scanner(System.in);
		int num1=teclado.nextInt();
		System.out.println("Dime un número");
		Scanner teclado1=new Scanner(System.in);
		int num2=teclado1.nextInt();
		if(num1>num2) {
			System.out.println("El número "+num1+" es más grande que "+num2);
		}
		else {
			System.out.println("El número "+num2+" es más grande que "+num1);
		}
	}
	/*Pide tres números y muéstralos de mayor a menor.*/
	public static void ejercicio3() {
		System.out.println("Dime un número");
		Scanner teclado=new Scanner(System.in);
		int num1=teclado.nextInt();
		System.out.println("Dime un número");
		Scanner teclado1=new Scanner(System.in);
		int num2=teclado1.nextInt();
		System.out.println("Dime un número");
		Scanner teclado2=new Scanner(System.in);
		int num3=teclado2.nextInt();
		if(num1>num2&&num2>num3) {
			System.out.println("Los números ordenados van así: "+num1+","+num2+","+num3);
		}
		else if(num2>num1&&num1>num3){
			System.out.println("Los números ordenados van así: "+num2+","+num1+","+num3);
		}
		else if(num1<num3&&num1>num2){
			System.out.println("Los números ordenados van así: "+num3+","+num1+","+num2);
		}
		else if(num2>num3&&num3>num1) {
			System.out.println("Los números ordenados van así: "+num2+","+num3+","+num1);
		}
		else if(num1>num3&&num3>num2) {
			System.out.println("Los números ordenados van así: "+num1+","+num3+","+num2);
		}
		else if(num3>num2&&num2>num1){
			System.out.println("Los números ordenados van así: "+num3+","+num2+","+num1);
		}
	}
	/*Pide los coeficientes de una ecuación de segundo grado de la forma ax2+bx+c=0
	 * e indica cuántas soluciones tiene y calcúlalas en los casos en los que existan.*/
	public static void ejercicio4() {
		System.out.println("Dime el coeficiente de la letra A");
		Scanner teclado=new Scanner(System.in);
		int a=teclado.nextInt();
		System.out.println("Dime el coeficiente de la letra B");
		Scanner teclado1=new Scanner(System.in);
		int b=teclado1.nextInt();
		System.out.println("Dime el coeficiente de la letra C");
		Scanner teclado2=new Scanner(System.in);
		int c=teclado2.nextInt();
		double raiz=Math.sqrt(Math.pow(b, 2)- 4*(a+c));
		double resultadoP=(b+raiz)/(2*a);
		double resultadoN=(b-raiz)/(2*a);
		if(raiz>0) {
			System.out.println("las soluciones son "+resultadoP+","+resultadoN);
		}
			
		else if(raiz==0){
			System.out.println("las soluciones son "+resultadoP);
		}
		else {
			System.out.println("No tiene ninguna solución");
		}
	}
	/*Escribe una aplicación que indique cuántas cifras tiene un número entre 0 y 99.999
	 *  introducido por teclado.
*/
	public static void ejercicio5() {
		System.out.println("Introduce un numero comprendido entre 0 y 99.999");
		Scanner teclado=new Scanner(System.in);
		int num=teclado.nextInt();
		if(num<10) {
			System.out.println("El número "+num+" tiene una cifra");
		}
		else if(num>10&&num<100) {
			System.out.println("El número "+num+" tiene dos cifras");
			
		}
		else if(num>100&&num<1000) {
			System.out.println("El número "+num+" tiene tres cifras");
			
		}
		else if(num>1000&&num<10000) {
			System.out.println("El número "+num+" tiene catro cifras");
			
		}
		else if(num>10000&&num<100000) {
			System.out.println("El número "+num+" tiene cinco cifras");
			
		}
	}
	/*Pide una nota decimal entre 0 y 10 e indica al usuario su calificación: 
	 * suspenso (de 0 a 4,99), suficiente (5.0 a 5.99), bien (6.0 a 6.99), 
	 * notable(7.0 a  8.99) y sobresaliente (entre 9 y 10).*/
	public static void ejercicio6() {
		System.out.println("Introduce un numero decimal comprendido entre 0 y 10");
		Scanner teclado=new Scanner(System.in);
		double nota=teclado.nextDouble();
		if(nota<5.0) {
			System.out.println("Estas suspenso");
		}
		else if(nota>4.99&&nota<6.0) {
		System.out.println("Tienes un Suficiente");
		}
		else if(nota>5.99&&nota<7.0) {
			System.out.println("Tienes un Bien");
		}
		else if(nota>6.99&&nota<9.0) {
			System.out.println("Tienes un Notable");
		}
		else {
			System.out.println("Tienes un Sobresaliente");
		}
	}
	/*Diseña un programa que solicite al usuario un número entre 1 y 7 y le indique
	 *  el día de la semana que corresponde, siendo 1 el lunes y 7 el domingo*/
	public static void ejercicio7() {
		System.out.println("Indica un Número entre 1 y 7 e indicaré a que día de la semana corresponde");
		Scanner teclado=new Scanner(System.in);
		int dia=teclado.nextInt();
		switch(dia) {
		case 1:
			System.out.println("Es Lunes");
			break;
		case 2:
			System.out.println("Es Martes");
			break;
		case 3:
			System.out.println("Es Miércoles");
			break;
		case 4:
			System.out.println("Es Jueves");
			break;
		case 5:
			System.out.println("Es Viernes");
			break;
		case 6:
			System.out.println("Es Sábado");
			break;
		case 7:
			System.out.println("Es Domingo");
			break;
		default:
			System.out.println("No esta entre los valores");
		}
	}
	/*Crea un programa que solicite una fecha al usuario, incluyendo día mes y año y le muestre
	 *la fecha del día siguiente, teniendo en cuenta la duración de los distintos meses.*/
	public static void ejercicio8() {
		System.out.println("Introduce un Día");
		Scanner teclado=new Scanner(System.in);
		int dia= teclado.nextInt();
		System.out.println("Introduce un Mes");
		Scanner teclado1=new Scanner(System.in);
		String Mes= teclado1.nextLine();
		System.out.println("Introduce un Año");
		Scanner teclado2=new Scanner(System.in);
		int Año= teclado.nextInt();
		switch (Mes) {
		case "Enero", "enero", "ENERO":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Febrero");
			}
			break;
		case "Febrero", "febrero", "FEBRERO":
			 if(dia<28){
				dia++;
				System.out.println(dia);
			}
			else if(Año==1980||Año==1984||Año==1988||Año==1992||Año==1996||Año==2000||Año==2004
					||Año==2008||Año==2012||Año==2016||Año==2020||Año==2024) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Marzo");
			}
			break;
		case "Marzo", "marzo", "MARZO":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Abril");
			}
			break;
		case "Abril", "abril", "ABRIL":
			if(dia<30) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Mayo");
			}
			break;
		case "Mayo", "mayo", "MAYO":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Junio");
			}
			break;
		case "Junio", "junio", "JUNIO":
			if(dia<30) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Julio");
			}
			break;
		case "Julio", "julio", "JULIO":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Agosto");
			}
			break;
		case "Agosto", "agosto", "AGOSTO":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Sepiembre");
			}
			break;
		case "Septiembre", "septiembre", "SEPTIEMBRE":
			if(dia<30) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Octubre");
			}
			break;
		case "Octubre", "octubre", "OCTUBRE":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Noviembre");
			}
			break;
		case "Noviembre", "noviembre", "NOVIEMBRE":
			if(dia<30) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Diciembre");
			}
			break;
		case "Diciembre", "diciembre", "DICIEMBRE":
			if(dia<31) {
				dia++;
				System.out.println(dia);
			}
			else {
				System.out.println("El siguiente día es 1 de Enero");
			}
			break;
		}
	}
	/*Escribe un programa que pida la hora, minuto y segundo actual e indique la hora, minutos y segundos después de 5 segundos. */
	public static void ejercicio9() {
		System.out.println("Indica la hora");
		Scanner teclado=new Scanner(System.in);
		int hora=teclado.nextInt();
		System.out.println("Indica los minutos");
		Scanner teclado1=new Scanner(System.in);
		int minutos=teclado1.nextInt();
		System.out.println("Indica los segundos");
		Scanner teclado2=new Scanner(System.in);
		int segundos=teclado2.nextInt();
		int segundosF=segundos+5;
		if(segundosF>=60) {
			minutos++;
			int segundosFinales=0;
			if(minutos>=60) {
				hora++;
				int mins=0;
				int segundosFinales2=0;
				System.out.println("la hora dentro de 5 segundos es: "+hora+":"+mins+":"+segundosFinales2);
			}
			else {
				System.out.println("la hora dentro de 5 segundos es: "+hora+":"+minutos+":"+segundosFinales);
			}
		}
	
	}
	/*El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene con el resto de dividir dicho número entre 23.
	 *  La letra se asigna usando la siguiente tabla:
	 *  
T
R
W
A
G
M
Y
F
P
D
X
B
N
J
Z
S
Q
V
H
L
C
K
E

*/
	public static void ejercicio10() {
		System.out.println("Dame un número de un DNI");
		Scanner teclado=new Scanner(System.in);
		int dni=teclado.nextInt();
		switch(dni%23) {
		case 0:
			System.out.println("La letra del DNI de este número es: T");
			break;
		case 1:
			System.out.println("La letra del DNI de este número es: R");
			break;
		case 2:
			System.out.println("La letra del DNI de este número es: W");
			break;
		case 3:
			System.out.println("La letra del DNI de este número es: A");
			break;
		case 4:
			System.out.println("La letra del DNI de este número es: G");
			break;
		case 5:
			System.out.println("La letra del DNI de este número es: M");
			break;
		case 6:
			System.out.println("La letra del DNI de este número es: Y");
			break;
		case 7:
			System.out.println("La letra del DNI de este número es: F");
			break;
		case 8:
			System.out.println("La letra del DNI de este número es: P");
			break;
		case 9:
			System.out.println("La letra del DNI de este número es: D");
			break;
		case 10:
			System.out.println("La letra del DNI de este número es: X");
			break;
		case 11:
			System.out.println("La letra del DNI de este número es: B");
			break;
		case 12:
			System.out.println("La letra del DNI de este número es: N");
			break;
		case 13:
			System.out.println("La letra del DNI de este número es: J");
			break;
		case 14:
			System.out.println("La letra del DNI de este número es: Z");
			break;
		case 15:
			System.out.println("La letra del DNI de este número es: S");
			break;
		case 16:
			System.out.println("La letra del DNI de este número es: Q");
			break;
		case 17:
			System.out.println("La letra del DNI de este número es: V");
			break;
		case 18:
			System.out.println("La letra del DNI de este número es: H");
			break;
		case 19:
			System.out.println("La letra del DNI de este número es: L");
			break;
		case 20:
			System.out.println("La letra del DNI de este número es: C");
			break;
		case 21:
			System.out.println("La letra del DNI de este número es: K");
			break;
		case 22:
			System.out.println("La letra del DNI de este número es: E");
			break;
		}
		
	}
	/*Realiza el juego de la suma, que consiste en que aparezcan dos números aleatorios entre 1 y 99 
	 *que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o no. */
	public static void ejercicio11() {
		Random aleatorio=new Random();
		int num1=aleatorio.nextInt(100);
		int num2=aleatorio.nextInt(100);
		int suma=num1+num2;
		System.out.println("los numeros son: "+num1+" y "+num2+" cual es el resultado de la suma?");
		Scanner teclado=new Scanner(System.in);
		int resultadoU=teclado.nextInt();
		if(resultadoU==suma){
			System.out.println("Bien sabes sumar");
			System.out.println("el resulado es: "+suma);
		}
		else {
			System.out.println("Vuelve a primaria ");
			System.out.println("el resulado es: "+suma);
		}
		}
	/*Modifica el ejercicio 11 para que, además de los dos números aleatorios, la operación a realizar
	 *(sumar, resta, multiplicación o división) sea también aleatoria. Ten en cuenta que no se puede dividir por 0.
	 *Al usuario se le presentará una operación, por ejemplo, 14*3, y éste deberá introducir el resultado. 
	 *El programa le indicará si el valor introducido es correcto*/
	public static void ejercicio12() {
		Random aleatorio=new Random();
		Random aleatorio1=new Random();
		int num1=aleatorio.nextInt(100);
		int num2=aleatorio.nextInt(100);
		int operacion=aleatorio1.nextInt(5);
		if(operacion==1) {
			System.out.println("Cual es la suma de estos dos números"+num1+"+"+num2);
			int suma=num1+num2;
			Scanner teclado=new Scanner(System.in);
			int resultadoU=teclado.nextInt();
			if(resultadoU==suma){
				System.out.println("Bien sabes sumar");
				System.out.println("el resulado es: "+suma);
			}
			else {
				System.out.println("Vuelve a primaria ");
				System.out.println("el resulado es: "+suma);
			}
		}
		else if(operacion==2) {
			System.out.println("Cual es la resta de estos dos números"+num1+"-"+num2);
			int resta=num1-num2;
			Scanner teclado=new Scanner(System.in);
			int resultadoU=teclado.nextInt();
			if(resultadoU==resta){
				System.out.println("Bien sabes restar");
				System.out.println("el resulado es: "+resta);
			}
			else {
				System.out.println("Vuelve a primaria ");
				System.out.println("el resulado es: "+resta);
			}
		}
		else if(operacion==3) {
			System.out.println("Cual es la multipliación de estos dos números"+num1+"x"+num2);
			int multi=num1*num2;
			Scanner teclado=new Scanner(System.in);
			int resultadoU=teclado.nextInt();
			if(resultadoU==multi){
				System.out.println("Bien sabes multipilcar");
				System.out.println("el resulado es: "+multi);
			}
			else {
				System.out.println("Vuelve a primaria ");
				System.out.println("el resulado es: "+multi);
			}
		}
		else if(operacion==4) {
			System.out.println("Cual es la división de estos dos números"+num1+":"+num2);
			int division=num1/num2;
			Scanner teclado=new Scanner(System.in);
			int resultadoU=teclado.nextInt();
			if(resultadoU==division){
				System.out.println("Bien sabes dividir");
				System.out.println("el resulado es: "+division);
			}
			else {
				System.out.println("Vuelve a primaria ");
				System.out.println("el resulado es: "+division);
			}
		}
	}
}

