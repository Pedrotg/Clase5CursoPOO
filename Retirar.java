package Banco;

import java.util.Scanner;

public class Retirar {

	double cantidadARetirar;
	
	public Retirar() {
		double cantidadARetirar = 0;
	}
//								2,500
	public double retira(double saldo) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("¿Cuánto deseas retirar?");
		cantidadARetirar = leer.nextDouble();
		//2300
		//		2,500	2300
		saldo = saldo - cantidadARetirar;
				
		//200
		return saldo;
	}
}
