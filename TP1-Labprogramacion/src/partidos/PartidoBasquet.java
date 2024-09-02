package partidos;


public class PartidoBasquet implements Partido{
    
    private String equipoLocal;
    private String equipoVisitante;
    private int puntosEquipoLocal;
    private int puntosEquipoVisitante;
    private int rebotesEquipoLocal;
    private int rebotesEquipoVisitante;

    public PartidoBasquet(String equipoLocal, String equipoVisitante, int puntosEquipoLocal, int puntosEquipoVisitante, int rebotesEquipoLocal, int rebotesEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosEquipoLocal = puntosEquipoLocal;
        this.puntosEquipoVisitante = puntosEquipoVisitante;
        this.rebotesEquipoLocal = rebotesEquipoLocal;
        this.rebotesEquipoVisitante = rebotesEquipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getPuntosEquipoLocal() {
        return puntosEquipoLocal;
    }

    public int getPuntosEquipoVisitante() {
        return puntosEquipoVisitante;
    }

    public int getRebotesEquipoLocal() {
        return rebotesEquipoLocal;
    }

    public int getRebotesEquipoVisitante() {
        return rebotesEquipoVisitante;
    }
    
    
    
}
