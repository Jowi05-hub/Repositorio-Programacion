package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import Junit.Junit;

class testJUnit {

	@Test
	@DisplayName("test esPar")
	public void testEsPar() {
		assertTrue(Junit.esPar(4));
		assertFalse(Junit.esPar(7));
		assertEquals(true,Junit.esPar(18));
		assertEquals(false,Junit.esPar(21));
	}
	@ParameterizedTest
	@ValueSource(ints= {4,8,12,24,16})
	@DisplayName("test paramétrico esPar")
	public void testEsPar2(int valor) {
		assertTrue(Junit.esPar(valor));
	}
	@ParameterizedTest
	@CsvSource({"3,2,5","15,15,30","9,7,16"})
	@DisplayName("test csv parametrico")
	public void testEsPar3(int a,int b,int resultado) {
		assertEquals(resultado,Junit.suma(a, b));
	}
	@ParameterizedTest
	@CsvFileSource(files="C:\\Users\\EstudianteDAM112\\Documents\\csvJUnit.txt", numLinesToSkip=1)
	@DisplayName("test parametrico con csv externo")
	public void testSuma2(int a,int b,int resultado) {
		assertEquals(resultado,Junit.suma(a, b));
	}
	@ParameterizedTest
	@MethodSource( value="generadorNumeros")
	@DisplayName("test parametrico a partir de metodo")
	public void testCalcularSuma(int[] numeros) {
		assertEquals(numeros[0],Junit.CalcularTotal(Arrays.copyOfRange(numeros, 1, numeros.length)));
	}
	public static int[][] generadorNumeros(){
		int[][] v={{25,12,8,5},{56,22,23,11},{23,10,10,3},{90,45,40,5},{100,20,20,60}};
		return v;
	}
}
