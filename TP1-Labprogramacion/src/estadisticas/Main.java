package estadisticas;

import factory.BasquetFactory;
import factory.DeporteFactory;
import factory.FutbolFactory;
import factory.TenisFactory;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        int instruccion;
        do {
            instruccion = menu();

            switch (instruccion) {
                case 1:
                    actualizarEstadisticas();
                    break;
                case 2:
                    /*Una vez se haya configurado bien la direccion del archivo .txt en el metodo
                    * mostrarEstadisticas() de Main y en el metodo registrar() de la clase Registro,             
                    * puede descomentar esta linea, acto seguido debe descomentar tambien las lineas
                    * en el metodo procesarEstadisticas() de cada Estadisticas*/

                    //mostrarEstadisticas(); 
                    break;
                case 0:
                    System.out.println("Se ha finalizado la ejecucion");
                    break;
                default:
                    System.out.println("Esta instruccion no es valida");
                    break;
            }
            System.out.println("");

        } while (instruccion != 0);
    }

    public static int menu() {
        //Modulo que muestra las operaciones del programa disponibles y retorna la eleccion del usuario
        int eleccion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Actualizar estadisticas del dia");
        System.out.println("2. Ver estadisticas");
        System.out.println("0. Salir\n");
        System.out.println("Ingrese el numero de instruccion que desea ejecutar");
        eleccion = sc.nextInt();

        return eleccion;

    }

    public static void actualizarEstadisticas() {
        int cantHilos = 5;
        ExecutorService executor = Executors.newFixedThreadPool(cantHilos);
        Impresora impresora = new Impresora();
        Registro lugarRegistro = new Registro();

        DeporteFactory futbolFactory = new FutbolFactory();
        DeporteFactory basquetFactory = new BasquetFactory();
        DeporteFactory tenisFactory = new TenisFactory();

        for (int i = 0; i < 3; i++) {

            executor.execute(futbolFactory.crearEstadistica(futbolFactory.crearPartido(), impresora, lugarRegistro));
            executor.execute(basquetFactory.crearEstadistica(basquetFactory.crearPartido(), impresora, lugarRegistro));
            executor.execute(tenisFactory.crearEstadistica(tenisFactory.crearPartido(), impresora, lugarRegistro));

        }
        executor.shutdown();

        try {
            //Bloquea main por 'x' tiempo para que finalicen las tareas en ejecucion
            if (!executor.awaitTermination(200, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mostrarEstadisticas() {
        Desktop dt = Desktop.getDesktop();
        String path = "";

        File archivo = new File(path);

        try {
            dt.open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
