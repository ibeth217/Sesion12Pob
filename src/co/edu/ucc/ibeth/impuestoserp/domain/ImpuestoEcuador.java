package co.edu.ucc.ibeth.impuestoserp.domain;

public class ImpuestoEcuador implements PoliticaImpuesto {
	
	// Clase concreta que implementa la estrategia de calculo de impuestos
	// en Ecuador. Esta clase es parte del patrón de diseño Strategy.
	
	@Override
    public double calcular(double monto) {
        return 0.0;
    }

}
