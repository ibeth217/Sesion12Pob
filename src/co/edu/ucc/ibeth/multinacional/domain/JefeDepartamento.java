package co.edu.ucc.ibeth.multinacional.domain;

public class JefeDepartamento extends Aprobador{

	 @Override
	    public void procesarSolicitud(double monto) {
	        if (monto <= 5000) {
	            System.out.println("✅ Aprobado por Jefe de Departamento.");
	        } else if (siguiente != null) {
	            siguiente.procesarSolicitud(monto);
	        }
	    }

}
