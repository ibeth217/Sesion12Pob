package co.edu.ucc.ibeth.impuestoserp.domain;

public class ImpuestoArgentina implements PoliticaImpuesto{
	
	// Clase concreta que implementa la estrategia de calculo de impuestos
	// en Argentina. Esta clase es parte del patrón de diseño Strategy.
	
	@Override
	public double calcular(double monto) {
		return monto * 0.21;
	}

}
