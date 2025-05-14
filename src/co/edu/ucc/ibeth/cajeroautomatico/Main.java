package co.edu.ucc.ibeth.cajeroautomatico;

import java.util.Base64;

import co.edu.ucc.ibeth.cajeroautomatico.domain.Cajero;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón State
 */
public class Main {
//clase Main que utiliza el Patrón State
	public static void main(String[] args) {
        Cajero cajero = new Cajero();

        cajero.insertarTarjeta();    // cambia a estado ConTarjeta
        cajero.ingresarPin(1111);    // PIN incorrecto
        cajero.ingresarPin(1234);    // cambia a Autenticado
        cajero.retirarDinero(200);   // vuelve a estado SinTarjeta
        System.out.println("\n== Identidad codificada ==");
        System.out.println(getIdentidad());
        }
    	
    	 public static String getIdentidad() {
    	        String nombre = "Ibeth Leonor Pacheco de la Hostia";
    	        return Base64.getEncoder().encodeToString(nombre.getBytes());
    	    }
}
