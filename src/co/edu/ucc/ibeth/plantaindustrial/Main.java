package co.edu.ucc.ibeth.plantaindustrial;

import java.util.Base64;

import co.edu.ucc.ibeth.plantaindustrial.domain.Sensor;
import co.edu.ucc.ibeth.plantaindustrial.infraestructure.NotificadorEmail;
import co.edu.ucc.ibeth.plantaindustrial.infraestructure.OrdenTecnica;
import co.edu.ucc.ibeth.plantaindustrial.infraestructure.RegistroEvento;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Observer
 */
public class Main {

	 public static void main(String[] args) {
	        Sensor sensor = new Sensor();
	        sensor.agregarObservador(new NotificadorEmail());
	        sensor.agregarObservador(new RegistroEvento());
	        sensor.agregarObservador(new OrdenTecnica());

	        sensor.setTemperatura(6.5); // no se notifica
	        sensor.setTemperatura(8.5); // se notifican todos
	        System.out.println("\n== Identidad codificada ==");
	        System.out.println(getIdentidad());
	    }

	 public static String getIdentidad() {
	        String nombre = "Ibeth Leonor Pacheco de la Hostia";
	        return Base64.getEncoder().encodeToString(nombre.getBytes());
	    }
}
