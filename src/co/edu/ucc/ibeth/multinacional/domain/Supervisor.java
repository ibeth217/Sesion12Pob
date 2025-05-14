package co.edu.ucc.ibeth.multinacional.domain;

public class Supervisor extends Aprobador {

	 @Override
	    public void procesarSolicitud(double monto) {
	        if (monto <= 500) {
	        	System.out.println("✅ Aprobado por Supervisor de Departamento.");
	        } else if (siguiente != null) {
	            siguiente.procesarSolicitud(monto);
	        }
	    }
	
}
