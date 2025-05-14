package co.edu.ucc.ibeth.cajeroautomatico.domain;

public class Cajero {

	// Este método se utiliza para insertar una tarjeta en el cajero automático.
	private EstadoCajero estado;

    public Cajero() {
        this.estado = new SinTarjeta(this);
    }

    public void setEstado(EstadoCajero estado) {
        this.estado = estado;
    }

    public void insertarTarjeta() {
        estado.insertarTarjeta();
    }

    public void ingresarPin(int pin) {
        estado.ingresarPin(pin);
    }

    public void retirarDinero(double monto) {
        estado.retirarDinero(monto);
    }
}
