package co.edu.ucc.ibeth.multinacional;

import java.util.Base64;

import co.edu.ucc.ibeth.multinacional.aplication.ServicioAprobacion;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Chain of Responsibility
 */
public class Main {

	/// Clase principal que utiliza el Patrón Chain of Responsibility
	public static void main(String[] args) {
        ServicioAprobacion servicio = new ServicioAprobacion();

        servicio.procesar(300);    // Supervisor
        servicio.procesar(3000);   // Jefe de Departamento
        servicio.procesar(15000);  // Director Financiero
        System.out.println("\n== Identidad codificada ==");
        System.out.println(getIdentidad());
    }

 public static String getIdentidad() {
        String nombre = "Ibeth Leonor Pacheco de la Hostia";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
