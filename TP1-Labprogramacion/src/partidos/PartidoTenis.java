package partidos;

public class PartidoTenis implements Partido{
    
    private String jugador1;
    private String jugador2;
    private int acesJugador1;
    private int acesJugador2;
    private int doblesFaltasJugador1;
    private int doblesFaltasJugador2;

    public PartidoTenis(String jugador1, String jugador2, int acesJugador1, int acesJugador2, int doblesFaltasJugador1, int doblesFaltasJugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.acesJugador1 = acesJugador1;
        this.acesJugador2 = acesJugador2;
        this.doblesFaltasJugador1 = doblesFaltasJugador1;
        this.doblesFaltasJugador2 = doblesFaltasJugador2;
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public int getAcesJugador1() {
        return acesJugador1;
    }

    public int getAcesJugador2() {
        return acesJugador2;
    }

    public int getDoblesFaltasJugador1() {
        return doblesFaltasJugador1;
    }

    public int getDoblesFaltasJugador2() {
        return doblesFaltasJugador2;
    }
    
    
    
}
