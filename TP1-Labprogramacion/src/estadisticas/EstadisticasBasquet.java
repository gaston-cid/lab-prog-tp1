package estadisticas;

import partidos.PartidoBasquet;

public class EstadisticasBasquet implements Estadisticas {

    private final PartidoBasquet partido;
    private final Impresora impresora;
    private final Registro lugarRegistro;

    public EstadisticasBasquet(PartidoBasquet partido, Impresora imp, Registro reg) {
        this.partido = partido;
        this.impresora = imp;
        this.lugarRegistro = reg;
    }

    @Override
    public void procesarEstadisticas() {
        String texto;
        texto = "              " + partido.getEquipoLocal() + "  vs  " + partido.getEquipoVisitante()
                + "\nResultado:    " + partido.getPuntosEquipoLocal() + "    -    " + partido.getPuntosEquipoVisitante()
                + "\nRebotes:     " + partido.getRebotesEquipoLocal() + "   -   " + partido.getRebotesEquipoVisitante()
                + "\nPartido de Basquet procesado - " + Thread.currentThread().getName();

        impresora.imprimir("Partido de Basquet procesado - " + Thread.currentThread().getName() + "\n");
        //lugarRegistro.registrar(texto);
    }

    @Override
    public void run() {
        procesarEstadisticas();

    }

}
