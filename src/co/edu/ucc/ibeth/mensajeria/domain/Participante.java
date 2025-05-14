package co.edu.ucc.ibeth.mensajeria.domain;

public abstract  class Participante {
	
	 protected TorreControl torre;
	    protected String nombre;

	    public Participante(String nombre, TorreControl torre) {
	        this.nombre = nombre;
	        this.torre = torre;
	        torre.registrarParticipante(this);
	    }

	    public abstract void recibir(String mensaje);

	    public void enviar(String mensaje) {
	        torre.enviarMensaje(mensaje, this);
	    }

	    public String getNombre() {
	        return nombre;
	    }

}
