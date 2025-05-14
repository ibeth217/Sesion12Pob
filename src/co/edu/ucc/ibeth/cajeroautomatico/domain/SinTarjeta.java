package co.edu.ucc.ibeth.cajeroautomatico.domain;

public class SinTarjeta implements EstadoCajero  {

	// Esta clase representa el estado del cajero automático cuando no hay tarjeta insertada.
	private final Cajero cajero;
	
	 public SinTarjeta(Cajero cajero) {
	        this.cajero = cajero;
	    }
	
	 @Override
	    public void insertarTarjeta() {
	        System.out.println("Tarjeta insertada.");
	        cajero.setEstado(new ConTarjeta(cajero));
	    }

	    @Override
	    public void ingresarPin(int pin) {
	        System.out.println("Primero inserte una tarjeta.");
	    }

	    @Override
	    public void retirarDinero(double monto) {
	        System.out.println("Primero inserte una tarjeta.");
	    }
	
	
	
}
