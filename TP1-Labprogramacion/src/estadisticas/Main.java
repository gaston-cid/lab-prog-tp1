package estadisticas;

import factory.DeporteFactory;
import factory.FutbolFactory;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.util.concurrent.TimeUnit;

public class Main {

   
    public static void main(String[] args) {
        int instruccion;
        
        do {
            instruccion = menu();

            switch (instruccion) {
                case 1:
                    actualizarEstadisticas();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                default:
                    System.out.println("Esta instruccion no es valida");
                    break;
            }
            System.out.println("");
            
        } while (instruccion != 0);
    }
    
    public static int menu(){
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
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        DeporteFactory futbolFactory = new FutbolFactory();       
        
        executor.execute(futbolFactory.crearEstadistica(futbolFactory.crearPartido()));
       
        
        executor.shutdown();
       
    }
    

    public static void mostrarEstadisticas(){
        Desktop dt = Desktop.getDesktop();
        String path = "D:/Usuarios/Desktop/registro.txt";
        
        File archivo = new File(path);
        
        try {
            dt.open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
    /*
    public static void actualizarEstadisticas() {
        
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        leerDatos();
        
        executor.shutdown();
        if(!executor.awaitTermination(2, TimeUnit.SECONDS)){
            executor.shutdownNow();
        }
    }
    
     public static void leerDatos() {
        //Modulo que realiza la lectura de datos desde un archivo de texto y hace el llamado al modulo de carga que corresponde
         
        Scanner sc = new Scanner(System.in);
        String linea, ruta;

        //System.out.println("Ingrese la ruta del archivo .txt");
        //ruta = sc.next();
        ruta = "D:/Usuarios/Escritorio/CargaDeDatos.txt";
   
        try {
            FileReader fileReader = new FileReader(ruta);
            BufferedReader buff = new BufferedReader(fileReader);
            
            while((linea = buff.readLine()) != null){
                switch(linea.charAt(0)){
                    case 'F':
                            
                            break;
                    
                    case 'T':
                            
                            break;
                    
                    case 'B':
                            
                            break;                             
                }
            }           
            buff.close(); 
        } 
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }  
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }       
    }*/
    
   
    

