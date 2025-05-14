package co.edu.ucc.ibeth.mensajeria.domain;

public class Pista extends Participante {

	  public Pista(String nombre, TorreControl torre) {
	        super(nombre, torre);
	    }

	    @Override
	    public void recibir(String mensaje) {
	        System.out.println("Pista " + nombre + " recibe: " + mensaje);
	    }
}
