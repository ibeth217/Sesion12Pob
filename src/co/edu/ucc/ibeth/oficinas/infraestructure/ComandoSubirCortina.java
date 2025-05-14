package co.edu.ucc.ibeth.oficinas.infraestructure;

import co.edu.ucc.ibeth.oficinas.domain.Comando;
import co.edu.ucc.ibeth.oficinas.domain.Cortina;

public class ComandoSubirCortina implements Comando{
	// Definición de la clase ComandoSubirCortina
	    // Implementación de la interfaz Comando
	    // Definición del método ejecutar
	    // Definición del atributo cortina
	 private final Cortina cortina;

	    public ComandoSubirCortina(Cortina cortina) {
	        this.cortina = cortina;
	    }
	    
	    @Override
	    public void ejecutar() {
	        cortina.subir();
	    }

}
