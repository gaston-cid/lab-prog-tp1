package factory;

import estadisticas.Estadisticas;
import estadisticas.EstadisticasTenis;
import estadisticas.Impresora;
import estadisticas.Registro;
import partidos.Partido;
import partidos.PartidoTenis;

public class TenisFactory extends DeporteFactory{

    @Override
    public Partido crearPartido() {
        return new PartidoTenis("Murray","Djokovic",4,5,4,6);
    }

    @Override
    public Estadisticas crearEstadistica(Partido partido, Impresora imp, Registro reg) {
        return new EstadisticasTenis((PartidoTenis)partido, imp, reg); 
    }
    

}
