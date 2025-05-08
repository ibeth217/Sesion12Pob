package co.edu.ucc.ibeth.impuestoserp.aplication;

import co.edu.ucc.ibeth.impuestoserp.domain.PoliticaImpuesto;

public class CalculadoraDeImpuesto {
	
	private PoliticaImpuesto politica;

    public CalculadoraDeImpuesto(PoliticaImpuesto politica) {
        this.politica = politica;
    }

    public double calcular(double monto) {
        return politica.calcular(monto);
    }

}
