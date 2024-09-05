package factory;

import estadisticas.Estadisticas;
import estadisticas.Impresora;
import estadisticas.Registro;
import partidos.Partido;

public abstract class DeporteFactory {
    
    public abstract Partido crearPartido();
    public abstract Estadisticas crearEstadistica(Partido partido, Impresora impresora,Registro reg);
}
