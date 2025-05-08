package co.edu.ucc.ibeth.plantaindustrial.infraestructure;

import co.edu.ucc.ibeth.plantaindustrial.domain.Observador;

public class OrdenTecnica implements Observador{
	
	@Override
	public void actualizar(double temperatura) {
		// TODO Auto-generated method stub
		if (temperatura > 8.0) {
			System.out.println("Orden técnica generada: temperatura alta -> " + temperatura + "°C");
		}
		else if (temperatura < 5.0) {
			System.out.println("Orden técnica generada: temperatura baja -> " + temperatura + "°C");
		} else {
			System.out.println("No se genera orden: temperatura normal -> " + temperatura + "°C");
		}
		
	}

}
