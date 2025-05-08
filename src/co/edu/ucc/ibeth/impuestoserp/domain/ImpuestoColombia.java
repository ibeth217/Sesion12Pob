package co.edu.ucc.ibeth.impuestoserp.domain;

public class ImpuestoColombia implements PoliticaImpuesto {
	
	// Clase concreta que implementa la estrategia de calculo de impuestos
	// en Colombia. Esta clase es parte del patrón de diseño Strategy.
	
	@Override
    public double calcular(double monto) {
        return monto * 0.19;
    }

}
