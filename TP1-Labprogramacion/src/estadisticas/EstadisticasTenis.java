package estadisticas;

import partidos.Partido;
import partidos.PartidoTenis;

public class EstadisticasTenis implements Estadisticas{
    
    private PartidoTenis partido;

    public EstadisticasTenis(PartidoTenis partido) {
        this.partido = partido;
    }
         
    @Override
    public void procesarEstadisticas() {
        
    }

    @Override
    public void run() {
       
    }
    
}
