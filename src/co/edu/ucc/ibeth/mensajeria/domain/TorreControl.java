package co.edu.ucc.ibeth.mensajeria.domain;

public interface TorreControl {
// Envia un mensaje a todos los participantes
	 void enviarMensaje(String mensaje, Participante emisor);
	 void registrarParticipante(Participante p);
}
