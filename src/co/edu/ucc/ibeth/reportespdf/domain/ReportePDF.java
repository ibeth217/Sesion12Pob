package co.edu.ucc.ibeth.reportespdf.domain;

public class ReportePDF extends GeneradorReporte {
	
	 @Override
	    protected void generarContenido() {
	        System.out.println("Escribiendo contenido en PDF.");
	    }

	    @Override
	    protected void formatear() {
	        System.out.println("Formateando como documento PDF.");
	    }

}
