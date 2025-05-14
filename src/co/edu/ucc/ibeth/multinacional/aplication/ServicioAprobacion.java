package co.edu.ucc.ibeth.multinacional.aplication;

import co.edu.ucc.ibeth.multinacional.domain.Aprobador;
import co.edu.ucc.ibeth.multinacional.domain.JefeDepartamento;
import co.edu.ucc.ibeth.multinacional.domain.Supervisor;
import co.edu.ucc.ibeth.multinacional.domain.DirectorFinanciero;

public class ServicioAprobacion {

	 private final Aprobador raizCadena;

	    public ServicioAprobacion() {
	        Aprobador supervisor = new Supervisor();
	        Aprobador jefe = new JefeDepartamento();
	        Aprobador director = new DirectorFinanciero();

	        supervisor.setSiguiente(jefe);
	        jefe.setSiguiente(director);

	        this.raizCadena = supervisor;
	    }

	    public void procesar(double monto) {
	        raizCadena.procesarSolicitud(monto);
	    }
}
