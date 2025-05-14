package co.edu.ucc.ibeth.mensajeria;

import java.util.Base64;

import co.edu.ucc.ibeth.mensajeria.aplication.TorreDeControl;
import co.edu.ucc.ibeth.mensajeria.domain.Avion;
import co.edu.ucc.ibeth.mensajeria.domain.Controlador;
import co.edu.ucc.ibeth.mensajeria.domain.Participante;
import co.edu.ucc.ibeth.mensajeria.domain.Pista;
import co.edu.ucc.ibeth.mensajeria.domain.TorreControl;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Mediator
 */
public class Main {

	public static void main(String[] args) {
        TorreControl torre = new TorreDeControl();

        Participante avion1 = new Avion("LATAM 123", torre);
        Participante controlador = new Controlador("ATC Norte", torre);
        Participante pista = new Pista("Pista A", torre);

        avion1.enviar("Solicito autorización para aterrizar");
        controlador.enviar("Autorizado a aterrizar");
        System.out.println("\n== Identidad codificada ==");
        System.out.println(getIdentidad());
        }
    	
    	 public static String getIdentidad() {
    	        String nombre = "Ibeth Leonor Pacheco de la Hostia";
    	        return Base64.getEncoder().encodeToString(nombre.getBytes());
    	    }
}
