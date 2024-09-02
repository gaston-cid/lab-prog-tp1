package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasBasquet;
import partidos.Partido;
import partidos.PartidoBasquet;

public class BasquetFactory extends DeporteFactory{

    @Override
    public Partido crearPartido() {
        return new PartidoBasquet(" "," ",1,1,1,1);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido) {
         return new EstadisticasBasquet((PartidoBasquet)partido);
    }
    
    
}
