package co.edu.ucc.ibeth.cajeroautomatico.domain;

public class Autenticado implements EstadoCajero{
	// Este método se utiliza para insertar una tarjeta y pin  en el cajero automático.
	 private final Cajero cajero;
	 
	 public Autenticado(Cajero cajero) {
	 
		 this.cajero = cajero;
	  }

	@Override
	public void insertarTarjeta() {
		// TODO Auto-generated method stub
		System.out.println("Ya autenticado. No necesita reiniciar.");
	}

	@Override
	public void ingresarPin(int pin) {
		// TODO Auto-generated method stub
		System.out.println("Ya autenticado.");
	}

	@Override
	public void retirarDinero(double monto) {
		// TODO Auto-generated method stub
		 System.out.println("Retirando $" + monto);
	        cajero.setEstado(new SinTarjeta(cajero));
	}
	
	

}
