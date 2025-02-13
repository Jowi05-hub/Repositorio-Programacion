package LecturaYEscritura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LecturaYEscritura {

	public static void main(String[] args) {
		
		copia();
	}
/*Escribe un programa en Java que lea cualquiera de los archivos de código que has generado a lo largo del curso y muéstralo por consola.
 *  Puedes poner la ruta directamente en el código. Realiza dos versiones de este programa: Una usando sólo la clase FileReader 
 *  y otra usando FileReader en consonancia con BufferedReader. */
	public static void lector() {
		try (FileReader lector=new FileReader("C:\\Users\\EstudianteDAM112\\Desktop\\Curso 24-25 Eclipse\\Ejercicio 1 Programación\\src\\main\\Ejercicio1.java")) {
			int letra=-1;
			while((letra=lector.read())!=-1) {
				System.out.print((char)letra);
			}
		}catch(FileNotFoundException ex){
			System.out.println("El fichero no se ha encontrado");
		}catch (IOException ex) {
			System.out.println("no se ha encontrado nada");
		}
	}
	public static void lector2(){
			try (BufferedReader lector=new BufferedReader(new FileReader("C:\\Users\\EstudianteDAM112\\Desktop\\Curso 24-25 Eclipse\\Ejercicio 1 Programación\\src\\main\\Ejercicio1.java"))) {
				String letra="";
				while((letra=lector.readLine())!=null) {
					System.out.println(letra);
				}
			
			}catch(FileNotFoundException ex){
				System.out.println("El fichero no se ha encontrado");
			}catch (IOException ex) {
				System.out.println("no se ha encontrado nada");
			}
	}
	/*Crea con un editor de texto (Notepad++) un fichero de texto numerosReales.txt y escribe en él una serie de números reales positivos separados 
	 * por espacios simples. Crea un programa que acceda a dicho fichero, lea los números y calcule la suma y la media aritmética, mostrando ambos
	 *  resultados por pantalla.*/
	public static void numerosReales(){
		int suma=0;
		try(BufferedReader lectorNumeros=new BufferedReader(new FileReader("C:\\Users\\EstudianteDAM112\\Documents\\lector1.txt"))) {
			String letras="";
			while((letras=lectorNumeros.readLine())!=null && !letras.equals("")){
				System.out.print(letras);
				String[] numero=letras.split(" ");
				for(String num:numero) {
					suma+=Double.parseDouble(num);	
				}
			}
			System.out.println(suma);
		}catch(FileNotFoundException ex){
			System.out.println("El fichero no se ha encontrado");
		}catch (IOException ex) {
			System.out.println("no se ha encontrado nada");
		}
	}

	
	
	
	
	/*Escribe una función, double calculaMediaImpares(), que lea un
fichero de texto que contiene una serie de números enteros pares e impares, separados por un espacio simple y que puede tener más de una línea. 
Se pide que la función devuelva la media aritmética de todos los números impares (con decimales) y que, además, la muestre por pantalla. 
Asimismo, se pide mostrar por pantalla cuántos números pares e impares contiene el archivo. Un ejemplo de dicho fichero de texto podría ser:

z
La cantidad de líneas y de números por línea son indeterminados. El fichero puede contener números pares e impares, pero solo se calculará la media 
de los impares. No todas las líneas tienen por qué tener la misma cantidad de números. Por simplicidad, puedes poner en el código la ruta del archivo,
 no es necesario pedirla por pantalla. Para probar tu código, crea un fichero de texto vacío y añádele contenido de acuerdo con lo especificado. 
 Puedes, simplemente, copiar los números del ejemplo para probar tu código, pero debe funcionar para una cantidad  indeterminada de líneas y números.
*/
	public static double calculaImpares() {
		int par=0;
		int impar=0;
		double  suma=0;
		double media=0;
		
		try(BufferedReader impares=new BufferedReader(new FileReader("C:\\Users\\EstudianteDAM112\\Documents\\calcularImpares.txt"))){
			String numeros="";
			while((numeros=impares.readLine())!=null) {
			String[] num=numeros.split(" ");
				for(String n:num) {
					if(Double.parseDouble(n)%2!=0) {
						System.out.print(n+" ");
						suma+=Double.parseDouble(n);
						impar++;
					}else {
						par++;
				}	
				}
			}
			System.out.println(" ");
			System.out.println(suma);
			media=suma/impar;
			System.out.println("La media es "+media);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return media;
	}
	/*Crea con un editor el fichero de texto jugadores.txt y escribe en él los nombres, edades y estaturas de los jugadores de un equipo, 
	 * cada uno en una línea, por ejemplo:
		Adrian;22;1.78
		Daniel;15;1.81
		Marco;21;1.83
		Tamara;24;1.68
		Natalia;19;1.75
Los nombres, edades y alturas están separados mediante un punto y coma.Implementa un programa que lea del fichero los datos y los muestre por 
pantalla en formato de tabla. Se pide que, además,  calcule la media de la edad y de las estaturas, mostrando ambas por pantalla. Por otro lado,
 muestra el nombre de la persona más joven, la más mayor, la más alta y la más baja. Crea los objetos y arrays que consideres oportuno para la tarea.
*/
	public static void jugadores() {
		try(BufferedReader jugadores=new BufferedReader(new FileReader("C:\\Users\\EstudianteDAM112\\Documents\\jugadores.txt"))){
			String 	nombreAltura="";
			double edadint=0;
			double media=0;
			double suma=0;
			double mayor=0;
		
			System.out.println("nombre |edad |altura |");
			while((nombreAltura=jugadores.readLine())!=null) {
				String[] nombre=nombreAltura.split(";");
				
					String nombres=nombre[0];
					String edad=nombre[1];
					String altura=nombre[2];
					edadint=Double.parseDouble(edad);
					suma+=edadint;
					media=suma/5;
					System.out.println(nombres.toString()+" | "+edad.toString()+" |  "+altura.toString()+"  |");
					for(int i=0;i<nombres.length();i++) {
						if(edadint>mayor) {
							mayor=edadint;
							edad.indexOf(i);
						}
					}
					
			}
			System.out.println(media);
			System.out.println("el mayor es: "+mayor);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
Escribe un programa que duplique el contenido de un fichero cuyo nombre se pide por pantalla al usuario. El fichero tendrá el mismo nombre,
 añadiendo el sufijo “copiaDe_”. Es decir, el programa deberá abrir  un archivo, leerlo, crear un archivo nuevo y escribir en este segundo
  archivo el contenido del primero.
	 */
	public static void copia(){
		BufferedWriter escritor;
		try( BufferedReader lectorFichero=new BufferedReader(new FileReader ("C:\\Users\\EstudianteDAM112\\Documents\\jugadores.txt"))){
			String linea=null;
			escritor=new BufferedWriter(new FileWriter("C:\\Users\\EstudianteDAM112\\Documents\\copia_jugadores.txt"));
			while((linea=lectorFichero.readLine())!=null) {
				System.out.println(linea);
				escritor.write(linea);
				escritor.newLine();
				escritor.flush();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por un determinado lugar. Crea una aplicación que permita mostrar el
	 *  libro de firmas e insertar un nuevo nombre (con apellidos incluidos), comprobando previamente que no existe. El archivo generado se llamará 
	 *  firmas.txt. Si no se puede añadir el nombre se informará por pantalla al usuario.*/
	public static void nombres() {
		BufferedWriter escritorNombres;
		try (BufferedReader nombres=new BufferedReader(new FileReader("C:\\Users\\EstudianteDAM112\\Documents\\nombres.txt"))){
			String linea=null;
			Scanner teclado=new Scanner(System.in);
			String Lecturanombres;
			BufferedWriter nombresEscritor=new BufferedWriter(new FileWriter("C:\\Users\\EstudianteDAM112\\Documents\\nombres.txt"));
			while((linea=nombres.readLine())!=null) {
				System.out.println(linea);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


