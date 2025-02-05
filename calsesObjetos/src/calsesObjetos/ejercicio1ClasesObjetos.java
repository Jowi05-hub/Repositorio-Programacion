package calsesObjetos;

public class ejercicio1ClasesObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuentaCorriente cuenta1=new cuentaCorriente("12431812J","Joel Costas",0);
		cuenta1.ingresar("Joel", "12431812J", 100);
		cuenta1.ingresar("Joel", "12431812J", 1000);
		cuenta1.retirarDinero(100);
		cuenta1.infoBanco();
	}

}
