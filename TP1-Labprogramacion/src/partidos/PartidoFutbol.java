package partidos;


public class PartidoFutbol implements Partido{
    
    private String equipoLocal;
    private String equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private int posesionEquipoLocal;
    private int posesionEquipoVisitante;

    public PartidoFutbol(String equipoLocal, String equipoVisitante, int golesEquipoLocal, int golesEquipoVisitante, int posesionEquipoLocal, int posesionEquipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
        this.posesionEquipoLocal = posesionEquipoLocal;
        this.posesionEquipoVisitante = posesionEquipoVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public int getPosesionEquipoLocal() {
        return posesionEquipoLocal;
    }

    public int getPosesionEquipoVisitante() {
        return posesionEquipoVisitante;
    }
    
    
    
}
