package co.edu.ucc.ibeth.mensajeria.domain;

public class Avion extends Participante {
	

	public Avion(String nombre, TorreControl torre) {
        super(nombre, torre);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Avión " + nombre + " recibe: " + mensaje);
    }
}
