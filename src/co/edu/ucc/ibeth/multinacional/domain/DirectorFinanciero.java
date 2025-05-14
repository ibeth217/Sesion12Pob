package co.edu.ucc.ibeth.multinacional.domain;

public class DirectorFinanciero extends Aprobador{

	 @Override
	    public void procesarSolicitud(double monto) {
	        if (monto > 5000) {
	            System.out.println("✅ Aprobado por Director Financiero.");
	        } else if (siguiente != null) {
	            siguiente.procesarSolicitud(monto);
	        }
	    }
}
