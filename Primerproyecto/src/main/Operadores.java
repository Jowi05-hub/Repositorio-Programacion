package main;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		
	/*System.out.println("Escribe un Número: ");
	Scanner teclado=new Scanner(System.in);
	int num1= teclado.nextInt();
	teclado.nextLine();
	System.out.println("Escribe un Número: ");
	int num2= teclado.nextInt();
	int suma= num1+num2;
	System.out.println("La suma de tus números es: "+suma);
	teclado.nextLine();
	System.out.println("Escribe un Número: ");
	Scanner teclado1=new Scanner(System.in);
	int num12= teclado1.nextInt();
	teclado1.nextLine();
	System.out.println("Escribe un Número: ");
	int num22= teclado1.nextInt();
	int resta= num12-num22;
	System.out.println("La resta de tus números es: "+resta);
	teclado.nextLine();
	System.out.println("Escribe un Número: ");
	Scanner teclado2=new Scanner(System.in);
	int num13= teclado2.nextInt();
	teclado2.nextLine();
	System.out.println("Escribe un Número: ");
	int num23= teclado1.nextInt();
	int multiplicacion= num13*num23;
	System.out.println("La multiplicación de tus números es: "+multiplicacion);
	int a=50;
	int b=10;
	boolean var=a==b;
	
	System.out.println("el valor de a es igual a b: "+var);*/
	/*boolean var1=false;
	boolean var2=true;
	boolean resultado=var1&&var2;
	System.out.println(resultado);
	boolean resultado2=var1||var2;
	System.out.println(resultado2);
	boolean resultado3=!var1&&var2;
	System.out.println(resultado3);
	boolean resultado4=var1||var2;
	System.out.println(resultado4);
	}*/
		System.out.println("Dame un valor para a");
		Scanner teclado1=new Scanner(System.in);
		double a=teclado1.nextDouble();
		System.out.println("Dame un valor para b");
		Scanner teclado2=new Scanner(System.in);
		double b=teclado2.nextDouble();
		double resultado=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(resultado);
}
}
		
		
