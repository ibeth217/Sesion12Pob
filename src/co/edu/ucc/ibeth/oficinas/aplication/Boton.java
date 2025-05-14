package co.edu.ucc.ibeth.oficinas.aplication;

import co.edu.ucc.ibeth.oficinas.domain.Comando;

public class Boton {

	 private final Comando comando;

	    public Boton(Comando comando) {
	        this.comando = comando;
	    }

	    public void presionar() {
	        comando.ejecutar();
	    }
}
