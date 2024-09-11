package estadisticas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registro {

    private Semaphore mutex = new Semaphore(1);

    public void registrar(String texto) {

        String path = "";

        try {
            mutex.acquire();

            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter buffW = new BufferedWriter(fileWriter);

            buffW.write(texto);
            buffW.newLine();
            buffW.newLine();
            buffW.close();

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        mutex.release();
    }

}
