package co.edu.ucc.ibeth.plantaindustrial.infraestructure;

import co.edu.ucc.ibeth.plantaindustrial.domain.Observador;

public class NotificadorEmail implements Observador{

	@Override
	public void actualizar(double temperatura) {
		// TODO Auto-generated method stub
		if (temperatura > 8.0) {
            System.out.println("Email enviado: temperatura alta -> " + temperatura + "°C");
        }
		else if (temperatura < 5.0) {
			System.out.println("Email enviado: temperatura baja -> " + temperatura + "°C");
		} else {
			System.out.println("Email enviado: temperatura normal -> " + temperatura + "°C");
		}
	}
	
	
}
