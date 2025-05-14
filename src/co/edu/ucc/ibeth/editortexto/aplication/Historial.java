package co.edu.ucc.ibeth.editortexto.aplication;

import java.util.Stack;

import co.edu.ucc.ibeth.editortexto.domain.EditorTexto;

public class Historial {

	// Clase Historial que utiliza el Patrón Memento
	 private final Stack<EditorTexto.Memento> pila = new Stack<>();

	    public void guardar(EditorTexto.Memento m) {
	        pila.push(m);
	    }

	    public EditorTexto.Memento deshacer() {
	        if (!pila.isEmpty()) {
	            return pila.pop();
	        }
	        return null;
	    }
}
