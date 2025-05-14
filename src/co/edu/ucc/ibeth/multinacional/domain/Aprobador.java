package co.edu.ucc.ibeth.multinacional.domain;

public abstract  class Aprobador {
	
	protected Aprobador siguiente;

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesarSolicitud(double monto);

}
