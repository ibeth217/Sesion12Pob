package co.edu.ucc.ibeth.reportespdf;

import java.util.Base64;

import co.edu.ucc.ibeth.reportespdf.domain.GeneradorReporte;
import co.edu.ucc.ibeth.reportespdf.domain.ReporteExcel;
import co.edu.ucc.ibeth.reportespdf.domain.ReportePDF;
/**
 * Encabezado Personalizado:
 * Autor: Ibeth Pacheco de la Hostia
 * Curso: Patrones de Diseño Orientado a Objetos 
 * Fecha: 07/05/2025
 * Descripción: Clase principal que utiliza el Patrón Template Method
 */
public class Main {
	public static void main(String[] args) {
        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();

        System.out.println("==== Generando PDF ====");
        pdf.generar();

        System.out.println("\n==== Generando Excel ====");
        excel.generar();
        System.out.println("\n== Identidad codificada ==");
        System.out.println(getIdentidad());
        }
    	
    	 public static String getIdentidad() {
    	        String nombre = "Ibeth Leonor Pacheco de la Hostia";
    	        return Base64.getEncoder().encodeToString(nombre.getBytes());
    	    }

}
