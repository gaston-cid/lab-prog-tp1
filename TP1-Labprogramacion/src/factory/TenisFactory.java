package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasTenis;
import partidos.Partido;
import partidos.PartidoTenis;

public class TenisFactory extends DeporteFactory{

    @Override
    public Partido crearPartido() {
        return new PartidoTenis("","",1,1,1,1);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido) {
        return new EstadisticasTenis((PartidoTenis)partido); 
    }
    

}
