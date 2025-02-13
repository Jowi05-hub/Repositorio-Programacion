package LecturaYEscritura;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public static void main(String[] args) {
		
	

}
	//LEEN DE CARACTER EN CARACTER
	
	public static void ejemploLectura1() {
		FileReader lector=null;
		try {
			//Abro el flujo de datos con el fichero con un FileReader
			lector=new FileReader("C:\\Users\\EstudianteDAM107\\Desktop\\DocumentoPruebaLectura.txt");
			
			int lectura=-1;
			
			while((lectura=lector.read())!=-1) {
				System.out.print((char)lectura);
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Error al leer el fichero");
		}catch(Exception ex) {
			System.out.println("Excepcion general");
		}finally {
			//En el bloque finally es donde escribimos el codigo que queremos que se ejecute el 100% de las veces.
			try {
				lector.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//ESTA FORMA ES MEJOR
	
	public static void ejemploLectura2() {


		try(FileReader lector=new FileReader("C:\\Users\\EstudianteDAM107\\Desktop\\DocumentoPruebaLectura.txt")) {
			
			int lectura=-1;
			
			while((lectura=lector.read())!=-1) {
				System.out.print((char)lectura);
			}
			
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Error al leer el fichero");
		}catch(Exception ex) {
			System.out.println("Excepcion general");
		}
	}
	
	//LEE DE LINEA EN LINEA
	
	public static void ejemploLectura3() {
		
		try(BufferedReader lector=new BufferedReader(new FileReader("C:\\\\Users\\\\EstudianteDAM107\\\\Desktop\\\\DocumentoPruebaLectura.txt"))){
			String linea="";
			while((linea=lector.readLine())!=null) {
				System.out.println(linea);
			}
		}catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}catch(IOException ex) {
			System.out.println("Error al leer el fichero");
		}
		
	}


}

