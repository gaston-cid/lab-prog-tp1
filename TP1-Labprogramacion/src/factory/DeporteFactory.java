package factory;

import estadisticas.Estadisticas;
import estadisticas.Impresora;
import estadisticas.Registro;
import partidos.Partido;

public interface DeporteFactory {

    public Partido crearPartido();

    public Estadisticas crearEstadistica(Partido partido, Impresora impresora, Registro reg);
}
