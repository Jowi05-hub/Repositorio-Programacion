package main;
/*Crea un Javadoc de la clase que se adjunta. Deberás dar una descripción de la clase (inventada) y
 *  de lo que hace cada método, y de los parámetros de entrada y salida, quién es el autor de cada método y
 *   de cada clase, desde qué versión del proyecto está disponible cada método, así como la versión del método.
 *    También deberás referencias unos métodos a otros. Concretamente, el método 1 referencia al método 3,el
 *     método 4 referencia al método 2 y el método 5 referencia al método 1. El método 6 lanza una excepción.
 *      Los métodos 5 y 6 está obsoletos. Deberás inventarte tanto el autor como las versiones.*/

/**
 * Esta es la clase para ejecutar nuestros programas
 * @version 1.0
 * @since 1.0
 */
public class Ejercicio {
		public static void main(String[] args) {
			Ejercicio e=new Ejercicio();
			e.metodo5(4,5,-1,"alfombra");
		}
		/**
		 *Este metodo muestra las tres primeras letras de la cadena de carácteres que introduzcas
		 * @author EstudianteDAM112
		 * @version 1.0
		 * @since 1.0
		 * @see #metodo3(String, String, String)
		 * @param f1 Primer parámetro de tipo String
		 * @param f2 Segundo parámetro de tipo String
		 * @return Retorna las tres primeras letras del Primer parámetro y las tres primeras del segundo string
		 */
		public String metodo1(String f1,String f2) {
			return f1.substring(0,3)+f2.substring(0,3);
		}
		/**
		 * Este metodo devuelve si los parametros pasados son simultaneamente pares
		 * @author EstudianteDAM112
		 * @since 1.0
		 * @param a Primer parámetros numérico de tipo INT
		 * @param b Segundo parámetros numérico de tipo INT
		 * @return Te retorna un TRUE o un FALSE dependiendo si los dos parámetros A LA VEZ son pares
		 */
		
		public boolean metodo2(int a,int b) {
			return a%2==0&&b%2==0;
		}
		/**
		 * Este método devuelve la longuitud de las 3 cadenas de texto introducidas por párametros
		 * @author EstudianteDAM112
		 * @since 1.0
		 * @see #metodo4(int)
		 * @param f1 Primer parametro de tipo String
		 * @param f2 Segundo parametro de tipo String
		 * @param f3 Tercer parametro de tipo String
		 * @return Te devuelve en formato de INT la longuitud total de los tres Strings que has introducido 
		 */
		public int metodo3(String f1,String f2,String f3) {
			return f1.length()+f2.length()+f3.length();
		}
		/**
		 * Este metodo suma los valores por debajo del parametro introducido
		 * @see #metodo2(int, int)
		 * @since 1.0
		 * @author EstudianteDAM112
		 * @param a Parámetro que se va a evaluar 
		 * @return Retorna la suma de los valores por debajo del parámetro introduciodo; Ej: a=4 (4+3+2+1=10) 
		 */
		public int metodo4(int a) {
			int total=0; 	
			for(int i=a;i>=0;i--) {
				total+=a;
			}
			return total;
		}
		/**
		 * Este metodo retorna las letras situadas en los valores introducidos 
		 * @see #metodo1(String, String)
		 * @author EstudianteDAM112
		 * @since 1.0
		 * @exception
		 * @deprecated
		 * @param a Primer parámetro numérico de tipo INT
		 * @param b Segundo parámetro numérico de tipo INT
		 * @param c Tercero parámetro numérico de tipo INT
		 * @param f Cuarto parámetro numérico de tipo String
		 * @return Si el parámetro C el mayor que cero retorna las letras situadas en las posiciones que indique el parametro A y el parametro B en el parametro String F
		 * si esl valor C es menor que 0 se mostrara las posiciones que sumen los parametros A yB en el parametro String; Ej a=4,b=5 a+b=9; se muestran 9 caracteres del parametro String
		 */
		public String metodo5(int a,int b,int c,String f) {
			if(c>0) {
				f=f.substring(a,b);
			}else {
				f=f.substring(a+b);
			}
			return f;
		}
		/**
		 * Este metodo divide los parametros introducidos 
		 * @author EstudianteDAM112
		 * @since 1.0
		 * @deprecated
		 * @param numerador
		 * @param denominador
		 * @return Retorna si el valor "Denominador" es multiplo del valor "Numerador"
		 * @throws ArithmeticException
		 */
		public String metodo6(double numerador, double denominador) throws ArithmeticException {
			String res=null;
			double resto=numerador%denominador;
			if(resto==0){
				res=numerador+"es múltiplo de "+denominador;
			}else{
				res=numerador+"no es múltiplo de "+denominador;
			}
			return res;
		}
	}

