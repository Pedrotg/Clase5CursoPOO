package Banco;

import java.util.Scanner;

import CalculadoraV2.Suma;

public class Banco {

	boolean continuar;
	int opcion, intentos;
	double saldo;
	String usuario, pass;
	
	public Banco() {
		
		continuar = true;
		opcion = 0;
		saldo = 2000;
		usuario = " ";
		pass = " ";
		intentos = 3;
	}
	
	//1 signo de igual es asignación, 2 signos de igual es comparación
	public void login() {
		Scanner leer = new Scanner(System.in);
		
		while(continuar){
			//Preguntamos su usuario y su contraseña
			System.out.println("Ingresa tu usuario: ");
			usuario = leer.next();
		
			System.out.println("Ingresa tu contraseña: ");
			pass = leer.next();
		
			//sí ambos son correctos lo mandamos al menú
			if(usuario.equals("Pedro") && pass.equals("123")) 
				menu();

			//si algún dato es incorrecto debemos restar 1 intento
			//3 intentos
			else {
				intentos--;
				//intentos = intentos - 1;
				//intentos -= 1;
				System.out.println("Incorrecto, le quedan "+intentos+" intentos");
				
				if(intentos == 0)
					continuar = false;
			}
		}
	}

	public void menu() {
		Scanner leer = new Scanner(System.in);
		
		do{
			System.out.println("Bienvenido al menú");
			System.out.println("1.- Depósito");
			System.out.println("2.- Retiro");
			System.out.println("3.- Consulta Saldo");
			System.out.println("4.- Salir");
			opcion = leer.nextInt();
			
			System.out.println("Tu saldo antes de la acción es de: "+saldo);
			
			switch (opcion) {
			
			case 1:
				Deposito instanciaDeposito = new Deposito();
				
				saldo = instanciaDeposito.deposita(saldo);
				
				break;
				
			case 2:
				Retirar instanciaRetirar = new Retirar();
				
				saldo = instanciaRetirar.retira(saldo);
				
				break;
				
			case 3:
				ConsultaSaldo instanciaSaldo = new ConsultaSaldo();
				
				instanciaSaldo.imprimeTicket(saldo);
				break;
				
			case 4:
				continuar = false;
				break;
				
			default:
				break;
			}
			
			System.out.println("Tu saldo después de la acción es de: "+saldo);
			
		}while(continuar);
	}
}
