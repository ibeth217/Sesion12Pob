package co.edu.ucc.ibeth.impuestoserp;

import java.util.Base64;

import co.edu.ucc.ibeth.impuestoserp.aplication.CalculadoraDeImpuesto;
import co.edu.ucc.ibeth.impuestoserp.domain.PoliticaImpuesto;
import co.edu.ucc.ibeth.impuestoserp.infraestructure.PoliticaImpuestoFactory;

/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Estrategia y factory
 */

public class Main {

	// Clase principal que ejecuta el programa. En este caso, se utiliza
	public static void main(String[] args) {
        String[] paises = {"Colombia", "Argentina", "Ecuador"};
        double monto = 2_149_450;

        for (String pais : paises) {
            PoliticaImpuesto estrategia = PoliticaImpuestoFactory.obtenerPorPais(pais);
            CalculadoraDeImpuesto calculadora = new CalculadoraDeImpuesto(estrategia);
            System.out.println(pais + ": $" + calculadora.calcular(monto));
        }
        System.out.println(getIdentidad());
    }
	
	 public static String getIdentidad() {
	        String nombre = "Ibeth Leonor Pacheco de la Hostia";
	        return Base64.getEncoder().encodeToString(nombre.getBytes());
	    }
}
