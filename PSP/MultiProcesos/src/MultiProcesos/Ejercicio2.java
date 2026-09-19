package MultiProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
	 public static void main(String[] args) {
	        // 1. Configuramos el comando para que se ejecute a través de CMD
	        // "cmd.exe", "/c" le dice a Windows que ejecute el comando 'dir' y luego cierre
	        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir");

	        try {
	            // Arrancamos el proceso
	            Process proceso = pb.start();

	            // Conectamos un lector a la tubería de salida del proceso externo
	            // InputStreamReader lee los bytes que saca el proceso y BufferedReader los agrupa por líneas
	            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
	            
	            String linea;
	            System.out.println("--- RESULTADO DEL COMANDO DIR ---");
	            
	            //  Leemos línea por línea hasta que el comando termine y devuelva null
	            while ((linea = lector.readLine()) != null) {
	                System.out.println(linea);
	            }
	            System.out.println("---------------------------------");
	            
	            // Cerramos el flujo del lector para liberar memoria
	            lector.close();

	        } catch (IOException e) {
	            System.out.println("Error al intentar ejecutar el comando.");
	            e.printStackTrace();
	        }
	    }
}
