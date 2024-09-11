package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasFutbol;
import estadisticas.Impresora;
import estadisticas.Registro;
import partidos.Partido;
import partidos.PartidoFutbol;

public class FutbolFactory implements DeporteFactory {

    @Override
    public Partido crearPartido() {
        return new PartidoFutbol("Boca", "River", 2, 1, 56, 44);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido, Impresora imp, Registro reg) {
        return new EstadisticasFutbol((PartidoFutbol) partido, imp, reg);
    }

}
