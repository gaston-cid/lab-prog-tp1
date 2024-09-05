package estadisticas;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Impresora {
    
    Semaphore sem = new Semaphore(1);
    
    public void imprimir(String text){
        try {
            sem.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(text);
        sem.release();
    }
    
}
