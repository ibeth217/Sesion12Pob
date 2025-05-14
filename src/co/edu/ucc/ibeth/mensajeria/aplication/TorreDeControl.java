package co.edu.ucc.ibeth.mensajeria.aplication;

import java.util.ArrayList;
import java.util.List;

import co.edu.ucc.ibeth.mensajeria.domain.Participante;
import co.edu.ucc.ibeth.mensajeria.domain.TorreControl;

public class TorreDeControl implements TorreControl {
	
	private final List<Participante> participantes = new ArrayList<>();

    @Override
    public void registrarParticipante(Participante p) {
        participantes.add(p);
    }

    @Override
    public void enviarMensaje(String mensaje, Participante emisor) {
        for (Participante p : participantes) {
            if (p != emisor) {
                p.recibir(mensaje + " (de " + emisor.getNombre() + ")");
            }
        }
    }

}
