package Banco;

//clase hijo de la clase "usuarios"
public class Login extends usuarios{

	boolean acceso;
	double saldo;
	
	public Login() {
		saldo = 0;
	}

	public boolean acceso(String usuarioEscrito, String passEscrito) {

		if(usuarioEscrito.equals(cliente1) && passEscrito.equals(pass1)||usuarioEscrito.equals(cliente2) && passEscrito.equals(pass2) ||usuarioEscrito.equals(cliente3) && passEscrito.equals(pass3)) {
			acceso = true;
		}else {
			acceso = false;
		}
		
		return acceso;
			
	}
	
	public double saldo(String usuario) {
		
		if(usuario.equals(cliente1)) {
			saldo = saldo1;
		}
		if(usuario.equals(cliente2)) {
			saldo = saldo2;
		}
		if(usuario.equals(cliente3)) {
			saldo = saldo3;
		}
		
		return saldo;
	}
}
