package co.edu.ucc.ibeth.plantaindustrial.domain;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

	// Clase que representa un sensor de temperatura
	// Implementa el patrón de diseño Observer
	// Permite a los observadores recibir actualizaciones de temperatura
	private final List<Observador> observadores = new ArrayList<>();
    private double temperatura;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }
}
