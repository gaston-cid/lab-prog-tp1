package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasFutbol;
import partidos.Partido;
import partidos.PartidoFutbol;

public class FutbolFactory extends DeporteFactory{

    @Override
    public Partido crearPartido() {
        return new PartidoFutbol("Boca","River",2,1,56,44);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido) {
        return new EstadisticasFutbol((PartidoFutbol)partido);
    }

    
    
}
