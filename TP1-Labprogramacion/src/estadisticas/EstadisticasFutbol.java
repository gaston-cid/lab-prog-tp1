package estadisticas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import partidos.PartidoFutbol;

public class EstadisticasFutbol implements Estadisticas{

    private PartidoFutbol partido;

    public EstadisticasFutbol(PartidoFutbol partido) {
        this.partido = partido;
    }
    
    
    @Override
    public void procesarEstadisticas() {
        
        String ruta, texto;
        ruta = "D:/Usuarios/Desktop/registro.txt";
        
        /*System.out.println("              " +partido.getEquipoLocal()+ "  vs  " + partido.getEquipoVisitante()
                       + "\n Resultado:    " + partido.getGolesEquipoLocal() + "    -    " + partido.getGolesEquipoVisitante()
                       + "\n Posesion:     "  + partido.getPosesionEquipoLocal() + "   -   " + partido.getPosesionEquipoVisitante()
        );*/
        
        texto = "              " +partido.getEquipoLocal()+ "  vs  " + partido.getEquipoVisitante()
                       + "\n Resultado:    " + partido.getGolesEquipoLocal() + "    -    " + partido.getGolesEquipoVisitante()
                       + "\n Posesion:     "  + partido.getPosesionEquipoLocal() + "   -   " + partido.getPosesionEquipoVisitante();
                  
        //'texto' se copiará en el archivo .txt ubicado en 'ruta'.
        try{
            FileWriter fileWriter = new FileWriter(ruta, true);
            BufferedWriter buffW = new BufferedWriter (fileWriter);
            
            buffW.write(texto);
            buffW.newLine();
            buffW.newLine();
            buffW.close();
            
        }catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }  
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }    
        
    }
    @Override
    public void run() {
        procesarEstadisticas();
        
        System.out.println("Partido de futbol procesado");
    }
    
}
