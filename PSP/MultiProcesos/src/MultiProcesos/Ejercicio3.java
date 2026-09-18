package MultiProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
	 public static void main(String[] args) {
	        // 1. Configuramos el comando de Windows 'getmac' para obtener las direcciones físicas
	        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "getmac");

	        try {
	            System.out.println("Obteniendo la dirección MAC del equipo...");
	            
	            // Arrancamos el proceso
	            Process proceso = pb.start();

	            // Conectamos la tubería para leer el texto que escupe el comando
	            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
	            
	            String linea;
	            System.out.println("\n--- RESULTADO DE GETMAC ---");
	            
	            //Leemos y mostramos línea por línea el resultado de la tarjeta de red
	            while ((linea = lector.readLine()) != null) {
	                System.out.println(linea);
	            }
	            System.out.println("---------------------------\n");
	            
	            // Cerramos el flujo del lector
	            lector.close();

	        } catch (IOException e) {
	            System.out.println("Error al intentar ejecutar el comando getmac.");
	            e.printStackTrace();
	        }
	    }
}
