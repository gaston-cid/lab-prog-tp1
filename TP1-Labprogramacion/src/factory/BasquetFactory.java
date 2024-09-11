package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasBasquet;
import estadisticas.Impresora;
import estadisticas.Registro;
import partidos.Partido;
import partidos.PartidoBasquet;

public class BasquetFactory implements DeporteFactory {

    @Override
    public Partido crearPartido() {
        return new PartidoBasquet("Lakers", "Spurs", 88, 98, 8, 18);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido, Impresora imp, Registro reg) {
        return new EstadisticasBasquet((PartidoBasquet) partido, imp, reg);
    }

}
