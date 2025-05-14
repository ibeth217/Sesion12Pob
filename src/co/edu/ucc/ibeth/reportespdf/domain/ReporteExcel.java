package co.edu.ucc.ibeth.reportespdf.domain;

public class ReporteExcel extends GeneradorReporte {

    @Override
    protected void generarContenido() {
        System.out.println("Escribiendo contenido en celdas Excel.");
    }

    @Override
    protected void formatear() {
        System.out.println("Formateando como hoja Excel.");
    }
}
