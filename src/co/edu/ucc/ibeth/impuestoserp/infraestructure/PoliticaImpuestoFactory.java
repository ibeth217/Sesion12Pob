package co.edu.ucc.ibeth.impuestoserp.infraestructure;

import co.edu.ucc.ibeth.impuestoserp.domain.ImpuestoArgentina;
import co.edu.ucc.ibeth.impuestoserp.domain.ImpuestoColombia;
import co.edu.ucc.ibeth.impuestoserp.domain.ImpuestoEcuador;
import co.edu.ucc.ibeth.impuestoserp.domain.PoliticaImpuesto;

public class PoliticaImpuestoFactory {
	
	public static PoliticaImpuesto obtenerPorPais(String pais) {
        return switch (pais.toLowerCase()) {
            case "colombia" -> new ImpuestoColombia();
            case "argentina" -> new ImpuestoArgentina();
            case "ecuador" -> new ImpuestoEcuador();
            default -> throw new IllegalArgumentException("País no soportado: " + pais);
        };
    }
}
