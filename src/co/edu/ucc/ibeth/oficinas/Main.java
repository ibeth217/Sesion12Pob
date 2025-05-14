package co.edu.ucc.ibeth.oficinas;

import java.util.Base64;

import co.edu.ucc.ibeth.oficinas.aplication.Boton;
import co.edu.ucc.ibeth.oficinas.domain.Comando;
import co.edu.ucc.ibeth.oficinas.domain.Cortina;
import co.edu.ucc.ibeth.oficinas.domain.Luz;
import co.edu.ucc.ibeth.oficinas.infraestructure.ComandoEncenderLuz;
import co.edu.ucc.ibeth.oficinas.infraestructure.ComandoSubirCortina;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Comando
 */

public class Main {

	public static void main(String[] args) {
        Luz luz = new Luz();
        Cortina cortina = new Cortina();

        Comando cmdLuz = new ComandoEncenderLuz(luz);
        Comando cmdCortina = new ComandoSubirCortina(cortina);

        Boton boton1 = new Boton(cmdLuz);
        Boton boton2 = new Boton(cmdCortina);

        boton1.presionar(); // Luz encendida
        boton2.presionar(); // Cortina subida
        System.out.println("\n== Identidad codificada ==");
        System.out.println(getIdentidad());
    }

 public static String getIdentidad() {
        String nombre = "Ibeth Leonor Pacheco de la Hostia";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
