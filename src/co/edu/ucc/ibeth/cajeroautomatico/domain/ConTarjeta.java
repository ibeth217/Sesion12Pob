package co.edu.ucc.ibeth.cajeroautomatico.domain;

public class ConTarjeta implements EstadoCajero{
	
	private final Cajero cajero;
	
	public ConTarjeta(Cajero cajero) {
		this.cajero = cajero;
	}

	@Override
	public void insertarTarjeta() {
		// TODO Auto-generated method stub
		 System.out.println("Ya hay una tarjeta insertada.");
	}

	@Override
	public void ingresarPin(int pin) {
		// TODO Auto-generated method stub
		 if (pin == 1234) {
	            System.out.println("PIN correcto.");
	            cajero.setEstado(new Autenticado(cajero));
	        } else {
	            System.out.println("PIN incorrecto.");
	        }
	}

	@Override
	public void retirarDinero(double monto) {
		// TODO Auto-generated method stub
		 System.out.println("Debe ingresar su PIN primero.");
	}

}
