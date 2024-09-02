package estadisticas;

import partidos.PartidoBasquet;

public class EstadisticasBasquet implements Estadisticas {
    
    private PartidoBasquet partido;

    public EstadisticasBasquet(PartidoBasquet partido) {
        this.partido = partido;
    }
    
    @Override
    public void procesarEstadisticas() {
        System.out.println("Partido: " + partido.getEquipoLocal());
    }

    @Override
    public void run() {
        procesarEstadisticas();
    }
    
}
