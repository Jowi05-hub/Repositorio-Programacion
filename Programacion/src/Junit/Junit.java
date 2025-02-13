package Junit;

public class Junit {

	public static boolean esPar(int a) {
		//devuelve si el numero es par o no
		return a%2==0;
	}
	public static int suma(int a , int b) {
		
		return a+b;
	}
	public static int CalcularTotal(int[] valores) {
		int total=0;
		for(int a:valores) {
			total+=a;
		}
		return total;
	}
}
