package calsesObjetos;

public class cuentaCorriente {
	private String DNI;
	private int saldo;
	String nombre;
	public cuentaCorriente(String DNI) {
		this.DNI=DNI;
		this.saldo=0;
		this.nombre=null;
	}
	public cuentaCorriente(String DNI,String nombre) {
		this.DNI=DNI;
		this.saldo=0;
		this.nombre=nombre;
	}
	public cuentaCorriente(String DNI,String nombre,int saldo) {
		this.DNI=DNI;
		this.saldo=saldo;
		this.nombre=nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void crearCuenta(String nombre,String DNI) {
		this.nombre=nombre;
		this.DNI=DNI;
		System.out.println("la cuenta es de "+nombre+" con el DNI "+DNI);
		this.saldo=0;
		System.out.println("El saldo actual es de: "+this.saldo);
	}
	public void ingresar(String Nombre,String DNI,int ingreso) {
		saldo+=ingreso;
		System.out.println("Ahora la cuenta con nombre "+Nombre+" y DNI "+DNI+" tienen un saldo de "+saldo);
		//saldo=saldoT;
	}
	public boolean retirarDinero(int cantidad) {
		boolean salida=false;
		if(saldo>cantidad) {
			this.saldo-=cantidad;
			System.out.println("quedan "+saldo);
			salida=true;
		}else {
			System.out.println("No hay suficiente saldo");
		}
		return salida;
	}
	public void infoBanco() {
		System.out.println("nombre: "+this.nombre+"\nDNI: "+this.DNI+"\nSaldo: "+this.saldo);
	}
}
