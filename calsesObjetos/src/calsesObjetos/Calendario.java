package calsesObjetos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Diseña la clase Calendario, la cual debe disponer de tres atributos: día, mes y año, los cuales no son accesibles directamente desde clases 
 * externas, excepto por aquellas clases que hereden de Calendario. Los tres atributos, día, mes y año son valores de tipo entero. Además, 
 * la clase debe disponer de los siguientes métodos:




Para obtener la fecha actual puedes utilizar la clase LocalDateTime, la cual se encuentra en el paquete java.time. Debes tener en cuenta que
 los meses enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días, abril, junio, septiembre y noviembre tienen 30 días y febrero
  tiene 28 días. No se tendrán en cuenta los años bisiestos.
*/
public class Calendario {
	private int dia;
	private int mes;
	private int año;
	/*Un método constructor con tres parámetros: día, mes y año.*/
	public Calendario(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	/*Otro método constructor, que incluya los parámetros día y mes, pero no el año. El año se cogerá automáticamente del año actual.*/
	public Calendario(int dia, int mes) {
		LocalDate fecha=LocalDate.now();
		this.año = fecha.getYear();
		this.dia = dia;
		this.mes = mes;
	}
	/*Otro constructor, sin parámetros, en el que el objeto Calendario se inicialice con el día, mes y año actual*/
	public Calendario() {
		LocalDate fecha=LocalDate.now();
		this.año = fecha.getYear();
		this.dia = fecha.getDayOfMonth();
		this.mes = fecha.getMonthValue();
	}
	/*void incrementarDia(): incrementa en un día la fecha del calendario.*/
	public void incrementarDia() {
		
		if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12) {
			if(this.dia==31) {
				this.dia=1;
				this.mes++;
			}else {
				this.dia++;
			}
		}else if(this.mes==2) {
			if(this.dia==28) {
				this.dia=1;
				this.mes++;
			}
		}else {
			if(this.dia==30) {
				this.dia=1;
				this.mes++;
			}else {
				this.dia++;
			}
		}
		System.out.println("el dia ahora es: "+this.dia+" del "+this.mes);
	}
	/*void incrementarMes() incrementa en un mes la fecha del calendario*/
	public void incrementarMes() {
		
		if(this.mes==12) {
			this.mes=1;
			this.año++;
		}else {
			this.mes++;
			
			
			
		}
		System.out.println("el mes ahora es: "+this.mes);
	}
	/*void incrementarAño(int cantidad): incrementa en cantidad años la fecha del calendario.*/
	public void incrementarAño(int cantidad) {
		this.año=this.año+cantidad;
		System.out.println("el año ahora es: "+this.año);
	}
	/*void mostrar(): muestra la fecha de la siguiente manera: “Es el 2 de diciembre de 2021”, por lo tanto, a la hora de mostrar la fecha deberás 
traducir el mes de su valor numérico a su nombre.*/
	public void mostrar() {
		DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("'Es el ' d ' de ' MMMM ' de ' yyyy");
		LocalDate fecha=LocalDate.of(this.dia, this.mes, this.año);
		System.out.println(formatoFecha.format(fecha));
	}
	/*boolean equals(Calendario otraFecha): determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.*/
	public boolean equals(Calendario otroCalendario) {
		return this.dia==otroCalendario.dia&&this.mes==otroCalendario.mes&&this.año==otroCalendario.año;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
}
