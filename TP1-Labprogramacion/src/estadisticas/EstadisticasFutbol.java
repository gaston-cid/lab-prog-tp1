package estadisticas;

import partidos.PartidoFutbol;

public class EstadisticasFutbol implements Estadisticas {

    private final PartidoFutbol partido;
    private final Impresora impresora;
    private final Registro lugarRegistro;

    public EstadisticasFutbol(PartidoFutbol partido, Impresora imp, Registro reg) {
        this.partido = partido;
        this.impresora = imp;
        this.lugarRegistro = reg;
    }

    @Override
    public void procesarEstadisticas() {
        String texto;
        texto = "              " + partido.getEquipoLocal() + "  vs  " + partido.getEquipoVisitante()
                + "\nResultado:    " + partido.getGolesEquipoLocal() + "    -    " + partido.getGolesEquipoVisitante()
                + "\nPosesion:     " + partido.getPosesionEquipoLocal() + "   -   " + partido.getPosesionEquipoVisitante()
                + "\nPartido de futbol procesado - " + Thread.currentThread().getName();

        impresora.imprimir("Partido de futbol procesado - " + Thread.currentThread().getName() + "\n");
        //lugarRegistro.registrar(texto);
    }

    @Override
    public void run() {
        procesarEstadisticas();
    }

}
