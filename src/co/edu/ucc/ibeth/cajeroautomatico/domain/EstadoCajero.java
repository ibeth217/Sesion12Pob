package co.edu.ucc.ibeth.cajeroautomatico.domain;

public interface EstadoCajero {
	// Este método se utiliza para insertar una tarjeta en el cajero automático.
	 void insertarTarjeta();
	 void ingresarPin(int pin);
	 void retirarDinero(double monto);

}
