package co.edu.ucc.ibeth.mensajeria.domain;

public class Controlador extends Participante {

	public Controlador(String nombre, TorreControl torre) {
        super(nombre, torre);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println("Controlador " + nombre + " recibe: " + mensaje);
    }
}
