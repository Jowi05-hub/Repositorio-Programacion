package main;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		
			
			double valorRecuperado=contador(0,0,11,0,0,15);
			System.out.println(+valorRecuperado);

	}
	/*Escribe una función que reciba dos enteros como parámetros y muestre todos los números comprendidos entre ellos.*/	
	 public static void ejercicio1(int num, int num2) {
		 for(int i=num;num2>=num;i++) {
			 System.out.println(i);
			 num++;
		 }
	 }
	 /* Escribe una función que reciba tres enteros como parámetros y muestre todos los números pares comprendidos entre 
	  * el primero y el segundo y todos los múltiplos de tres comprendidos entre el segundo y el tercero*/
	 public static void ejercicio2(int num1, int num2,int num3) {
		 for(int i=num1;i<num2;i++) {
			 if(i%2==0) {
				System.out.println(i);
				 num1++;
			 }
		 }
		 for(int j=num2;j<num3;j++) {
			 if(j%3==0) {
				 System.out.println(j);
				 num2++;
			 }
		 }
	 }
	 /*Realiza una función que calcule y devuelva el volumen de un cilindro. Dicha función tendrá como parámetros de entrada 
	  * el radio y la altura de éste. Debe trabajar con valores decimales*/
	 public static double ejercicio3(double radio,double altura) {
		 double volumen=Math.PI*Math.pow(radio, 2)*altura;
		 //System.out.println(volumen);
		 return volumen;
	 }
	/* Diseña una función que reciba como parámetro dos números enteros y devuelva el máximo de ambos.*/ 
	 public static int ejercicio4(int num1,int num2) {
		 int maximo=Math.max(num1, num2);
		// System.out.println(maximo);
		 return maximo;
	 }
	 /*Crea una función que indique si la letra pasada como parámetro es una vocal (puede ser mayúscula o minúscula). 
	  * Devolverá true en caso afirmativo y false en caso contrario.*/
	 public static boolean ejercicio5(char letra) {
		 boolean vocal;
		 if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U') {
			  vocal=true;
			  //System.out.println("Es una vocal "+vocal);
			 
		 }else {
			 vocal=false;
			 //System.out.println("Es una vocal "+vocal);
		 }
		 return vocal;
	 }
	 /*Diseña una función que reciba un número entero como parámetro y devuelva true si éste es un número primo y false en caso contrario.*/
	 public static boolean ejercicio6(int num) {
			boolean primo=true;
			for(int i=2;i<=num;i++) {
				primo=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						primo=false;
						break;
					}
				}
			}
			return primo;
	 }
	 /*Diseña la función calculadora(), que recibe dos números reales y la operación a realizar y devuelve el resultado.
	  *  La operación a realizar se codificará mediante un entero, siendo 1 la opción de la suma, 2 la opción de la resta,
	  *   3 la opción de la multiplicación y 4 la opción de la división. Recuerda que no está permitido dividir por cero.
*/
	 public static double calculadora(int valor) {
		 double resultado=0;
		 switch (valor){
			 case 1:
				 Scanner teclado=new Scanner(System.in);
				 System.out.println("Introduce el primer valor de la suma");
				 double num1=teclado.nextInt();
				 System.out.println("Introduce el segundo valor de la suma");
				 double num2=teclado.nextInt();
				 resultado=num1+num2;
				// System.out.println("el valor de la suma es "+resultado);
				 break;
			 case 2:
				teclado=new Scanner(System.in);
				 System.out.println("Introduce el primer valor de la resta");
				 num1=teclado.nextInt();
				 System.out.println("Introduce el segundo valor de la resta");
				 num2=teclado.nextInt();
				 resultado=num1-num2;
				 //System.out.println("el valor de la suma es "+resultado);
				 break;
			 case 3:
				 teclado=new Scanner(System.in);
				 System.out.println("Introduce el primer valor de la multiplicación");
				 num1=teclado.nextInt();
				 System.out.println("Introduce el segundo valor de la multiplicación");
				 num2=teclado.nextInt();
				 resultado=num1*num2;
				 //System.out.println("el valor de la suma es "+resultado );
				 break;
			 case 4:
				 teclado=new Scanner(System.in);
				 System.out.println("Introduce el primer valor de la división");
				 num1=teclado.nextInt();
				 System.out.println("Introduce el segundo valor de la división");
				 num2=teclado.nextInt();
				 resultado=num1/num2;
				 if(num1==0||num2==0) {
					 System.out.println("La division no es posible");
				 }else {
					// System.out.println("el valor de la suma es "+resultado);
				 }
				 break;
		 }
		 return resultado;
	 }
	 /*Crea un método que tenga el mismo nombre que el del ejercicio 4 pero que reciba tres enteros como parámetros 
	  * y devuelva el máximo de los tres (método sobrecargado).
*/
	 public static int ejercicio4(int num1, int num2, int num3) {
		 int numMayor=0;
		 if(num1>num2&&num1>num3) {
			 System.out.println("El número mayor es "+num1);
			 numMayor=num1;
		 }else if (num2> num3&&num2>num1) {
			 System.out.println("el numero mayor es "+num2);
			 numMayor=num2;
		 }else {
			 System.out.println("el numero mayor es "+num3);
			 numMayor=num3;
		 }
		 return numMayor;
	 }
	 /*Diseñar una función que calcule a^n donde a es real y n  es un entero no negativo. 
	  * No está permitido utilizar la librería Math de Java. Crea dos versiones de esta función, una iterativa (con bucles) 
	  * y otra recursiva. Ambas funciones deben devolver el valor calculado
*/
	 public static double ejercicio9(int a, int n) {
		 double resultado=1;
		 if(n>=0) {
			 for(int i=0;i<n;i++) {
				 resultado*=a;
			 }
		 }else {
			 System.out.println("Introduce un exponente positivo");
		 }
		 return resultado;
	 }
	 /*Crea una función que calcule y retorne la distancia euclídea entre dos puntos en el plano cartesiano. 
	  * Estos puntos tienen coordenadas (x1,x2) y (y1,y2).
	  *  d = √((x2 - x1)² + (y2 - y1)²)*/
	 	public static double cartesiano(int x1,int x2, int y1,int y2) {
	 		double distancia1=Math.sqrt((Math.pow(x1, 2)+Math.pow(x2, 2))+(Math.pow(y1, 2)+Math.pow(y2, 2)));
	 		return distancia1;
	 	}
	 /*Diseña una función que reciba como parámetros de entrada las horas, minutos y segundos de dos instantes y retorne 
	  * la cantidad de segundos de diferencia que hay entre ellas. Si el primer instante es posterior al segundo, 
	  * dicha diferencia será positiva. Si el primer instante es anterior al segundo, el valor retornado será negativo.
*/
	 	public static int contador(int horas1, int minutos1, int segundos1,int horas2, int minutos2, int segundos2) {
	 		horas1=horas1*3600;
	 		minutos1=minutos1*60;
	 		horas2=horas1*3600;
	 		minutos2=minutos1*60;
	 		int sgT1=horas1+minutos1+segundos1;
	 		int sgT2=horas2+minutos2+segundos2;
	 		int resta=sgT1-sgT2;
	 		return resta;
	 	}
	 
	 
	 
	 
	 //privacidad (private, protected, nada, public)
	 public static int funcionSuma(int a,int b) {
		 
		 return a+b;
	 }
	 public static int funcionX(String cadena) {
		 return cadena.length();
	 }
	 	
}

