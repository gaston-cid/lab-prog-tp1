package factory;

import estadisticas.Estadisticas;
import partidos.Partido;

public abstract class DeporteFactory {
    
    public abstract Partido crearPartido();
    public abstract Estadisticas crearEstadistica(Partido partido);
}
