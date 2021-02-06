package Banco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsultaSaldo {

	public void imprimeTicket(double saldo) {
		
		Date date = new Date();
		
		System.out.println("*********************");
		System.out.println("No. operación 23243");
		System.out.println("No. Caja 34");
		System.out.println("");
		System.out.println("Tu saldo actual es de: "+saldo);
		
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		System.out.println("Hora y fecha: "+hourdateFormat.format(date));
		System.out.println("*********************");
		System.out.println("");
	}
	
}
