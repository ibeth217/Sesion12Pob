package co.edu.ucc.ibeth.editortexto;

import co.edu.ucc.ibeth.editortexto.aplication.Historial;
import co.edu.ucc.ibeth.editortexto.domain.EditorTexto;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Memento
 */
public class Main {

	// Clase Main que utiliza el Patrón Memento
	public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.escribir("Hola");
        historial.guardar(editor.guardar());

        editor.escribir(" mundo");
        historial.guardar(editor.guardar());

        editor.escribir(" cruel");

        System.out.println("Actual: " + editor.getContenido()); // Hola mundo cruel

        editor.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + editor.getContenido()); // Hola mundo

        editor.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + editor.getContenido()); // Hola
    }
}
