package main;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio8();

	}
	public static void Ejercicio1() {
		System.out.println("Escribe un Número");
		Scanner Teclado=new Scanner(System.in);
		int num=Teclado.nextInt();
		System.out.println("Su número es: "+num);
	}
	public static void Ejercicio2() {
		System.out.println("Escribe tu Edad");
		Scanner Teclado=new Scanner(System.in);
		int num=Teclado.nextInt();
		int edad3=num+3;
		System.out.println("Su edad dentro de 3 años es de: "+edad3);
	}
	public static void Ejercicio3() {
		System.out.println("Escribe el año actual");
		Scanner Teclado=new Scanner(System.in);
		int ano=Teclado.nextInt();
		Teclado.nextLine();
		System.out.println("Escribe tu año de nacimieto ");
		Scanner Teclado1=new Scanner(System.in);
		int nacimiento=Teclado1.nextInt();
		int edad=ano-nacimiento;
		System.out.println("Tu edad es de:"+edad);
	}
	public static void Ejercicio4() {
		System.out.println("Escribe una nota");
		Scanner Teclado=new Scanner(System.in);
		double nota1=Teclado.nextDouble();
		System.out.println("Escribe una nota");
		Scanner Teclado2=new Scanner(System.in);
		double nota2=Teclado.nextDouble();
		System.out.println("Escribe una nota");
		Scanner Teclado3=new Scanner(System.in);
		double nota3=Teclado.nextDouble();
		double media=(nota1+nota2+nota3)/3;
		System.out.println("Su media aritmetica es de: "+media);
	}
	public static void Ejercicio5() {
		System.out.println("Escribe el valor del radio de tu circunferencia");
		Scanner Teclado=new Scanner(System.in);
		double radio=Teclado.nextDouble();
		double longuitud=(radio*2)*3.14;
		double area=(3.1416*(radio*radio));
		System.out.println("El valor del Aréa de tu circunferencia es:"+area+". Y la Longuitud es de: "+longuitud);
		
	}
	public static void Ejercicio6() {
		System.out.println("Escribe tu Edad");
		Scanner Teclado=new Scanner(System.in);
		int num=Teclado.nextInt();
		boolean edad= num>=18;
		System.out.println("Eres mayor de edad? "+edad);
	}
	public static void Ejercicio7() {
		System.out.println("Escribe un Número");
		Scanner Teclado=new Scanner(System.in);
		int num=Teclado.nextInt();
		int modulo=num%2;
		boolean parImpar=modulo==0;
		System.out.println("es par? "+parImpar);
	}
	public static void Ejercicio8() {
		System.out.println("Esta Lloviendo?(true-false)");
		Scanner Teclado=new Scanner(System.in);
		boolean llueve=Teclado.nextBoolean();
		System.out.println("Has terminado las tareas?(true-false)");
		Scanner Teclado2=new Scanner(System.in);
		boolean tareas=Teclado2.nextBoolean();
		System.out.println("Vas a la biblioteca?(true-false)");
		Scanner Teclado3=new Scanner(System.in);
		boolean biblioteca=Teclado2.nextBoolean();
		boolean salir=(!llueve&&tareas)||biblioteca;
		System.out.println("Puedes salir a la calle? "+salir);
		
	}
	public static void Ejercicio9() {
		System.out.println("¿Cuantos KG has vendido de MANZANAS?");
		Scanner teclado=new Scanner(System.in);
		double manzanas=teclado.nextDouble();
		double ganadoM=manzanas*2.35;
		teclado.nextLine();
		System.out.println("¿Cuantos KG has vendido de PERAS?");
		Scanner teclado1=new Scanner(System.in);
		double peras=teclado1.nextDouble();
		double ganadoP=peras*1.95;
		double manzanasA=ganadoM*2;
		double perasA=ganadoP*2;
		System.out.println("Con las manzanas has ganado: "+manzanasA+"€. y con las peras has ganado: "+perasA+"€");
		
	}
	public static void Ejercicio10() {
		System.out.println("Escribe un Número");
		Scanner teclado=new Scanner(System.in);
		int num=teclado.nextInt();
		boolean positivo=num>=0;
		int absoluto=num>=0? num:-num;
		System.out.println("el valor absoluto de tu número es "+absoluto);
	}
	public static void Ejercicio11() {
		System.out.println("Escribe el valor de A");
		Scanner teclado=new Scanner(System.in);
		double a=teclado.nextDouble();
		System.out.println("Escribe el valor de B");
		Scanner teclado1=new Scanner(System.in);
		double b=teclado.nextDouble();
		System.out.println("Escribe el valor de C");
		Scanner teclado2=new Scanner(System.in);
		double c=teclado.nextDouble();
		double raiz=Math.sqrt(Math.pow(b, 2)-4*(a+c));
		double resultado=(b+raiz)/(2*a);
		double resultado1=(b-raiz)/(2*a);
		System.out.println("el valor de x positiva es: "+resultado1+" El valor de x negativa es: "+resultado);
		
	}
	public static void Ejercicio12() {
		System.out.println("Escribe una Cantidad de Segundos");
		Scanner teclado=new Scanner(System.in);
		int num=teclado.nextInt();
		int minutos=num/60;
		int horas=minutos/60;
		System.out.println("Los segundos tienen "+minutos+"minutos y "+horas+"horas");
	}
	public static void Ejercicio13() {
		System.out.println("Cual es la base del triángulo?");
		Scanner teclado=new Scanner(System.in);
		int base=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Cual es la altura del triángulo?");
		Scanner teclado1=new Scanner(System.in);
		int altura=teclado1.nextInt();
		int area=(base*altura)/2;
		System.out.println("El area de tu triangulo es de: "+area+"cm2");
		
	}
	public static void Ejercicio14() {
		System.out.println("Cuantas entradas de adulto quieres");
		Scanner teclado=new Scanner(System.in);
		int adulto= teclado.nextInt();
		System.out.println("Cuantas entradas infantiles quieres");
		Scanner teclado1=new Scanner(System.in);
		int infantil= teclado1.nextInt();
		int precioA=adulto*20;
		double precioI=adulto*15.50;
		double precioF=precioA+precioI;
		double precioFinal=precioF>=100? precioF-(precioF*0.05):precioF;
		System.out.println("El precio final es de: "+precioFinal+"€");
		
	}
	}

