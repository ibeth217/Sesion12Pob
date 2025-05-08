package co.edu.ucc.ibeth.plantaindustrial.infraestructure;

import co.edu.ucc.ibeth.plantaindustrial.domain.Observador;

public class RegistroEvento implements Observador {

	@Override
	public void actualizar(double temperatura) {
		// TODO Auto-generated method stub
		 if (temperatura > 8.0) {
	            System.out.println("Evento registrado en base de datos -> " + temperatura + "°C");
	        }
		 else if (temperatura < 5.0) {
			 System.out.println("Evento registrado en base de datos -> " + temperatura + "°C");
		 } else {
			 System.out.println("Evento registrado en base de datos -> " + temperatura + "°C");
		 }
	}
	
}
