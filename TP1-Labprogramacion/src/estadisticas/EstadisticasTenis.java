package estadisticas;

import partidos.PartidoTenis;

public class EstadisticasTenis implements Estadisticas {

    private final PartidoTenis partido;
    private final Impresora impresora;
    private final Registro lugarRegistro;

    public EstadisticasTenis(PartidoTenis partido, Impresora imp, Registro reg) {
        this.partido = partido;
        this.impresora = imp;
        this.lugarRegistro = reg;
    }

    @Override
    public void procesarEstadisticas() {
        String texto;
        texto = "              " + partido.getJugador1() + "  vs  " + partido.getJugador2()
                + "\nAces:         " + partido.getAcesJugador1() + "    -    " + partido.getAcesJugador2()
                + "\nDobles faltas:" + partido.getDoblesFaltasJugador1() + "   -   " + partido.getDoblesFaltasJugador2()
                + "\nPartido de Tenis procesado - " + Thread.currentThread().getName();

        impresora.imprimir("Partido de Tenis procesado - " + Thread.currentThread().getName() + "\n");
        //lugarRegistro.registrar(texto);
    }

    @Override
    public void run() {
        procesarEstadisticas();
    }

}
