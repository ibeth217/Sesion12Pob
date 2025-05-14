package co.edu.ucc.ibeth.editortexto.domain;

public class EditorTexto {

	//clase que representa el editor de texto
	// y utiliza el Patrón Memento para guardar y restaurar su estado
	// Atributo privado que almacena el contenido del editor
	 private String contenido = "";

	    public void escribir(String texto) {
	        contenido += texto;
	    }

	    public String getContenido() {
	        return contenido;
	    }

	    public Memento guardar() {
	        return new Memento(contenido);
	    }

	    public void restaurar(Memento memento) {
	        this.contenido = memento.getEstado();
	    }

	    // Memento interno
	    public static class Memento {
	        private final String estado;

	        private Memento(String estado) {
	            this.estado = estado;
	        }

	        private String getEstado() {
	            return estado;
	        }
	    }
}
