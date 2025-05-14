package co.edu.ucc.ibeth.oficinas.infraestructure;

import co.edu.ucc.ibeth.oficinas.domain.Comando;
import co.edu.ucc.ibeth.oficinas.domain.Luz;

public class ComandoEncenderLuz  implements Comando{
// Definición de la clase ComandoEncenderLuz
	    // Implementación de la interfaz Comando
	    // Definición del método ejecutar
	    // Definición del atributo luz
	  private final Luz luz;

	    public ComandoEncenderLuz(Luz luz) {
	        this.luz = luz;
	    }

		@Override
		public void ejecutar() {
			// TODO Auto-generated method stub
			 luz.encender();
		}

	    
	

}
