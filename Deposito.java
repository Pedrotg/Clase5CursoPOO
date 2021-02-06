package Banco;

import java.util.Scanner;

public class Deposito {

	double cantidadADepositar;
	
	public Deposito() {
		cantidadADepositar = 0;
	}
									//2,000
	public double deposita(double saldo) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("¿Cuánto deseas depositar?");
		cantidadADepositar = leer.nextDouble();
		//500
		//		2,000	500	
		saldo = saldo + cantidadADepositar;
		
		System.out.println("Tu nuevo saldo es de: "+saldo);
				//2,500
		return saldo;
	}
}
