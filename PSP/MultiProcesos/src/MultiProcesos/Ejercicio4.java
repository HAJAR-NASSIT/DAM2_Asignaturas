package MultiProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
	 public static void main(String[] args) {
	        // 1. Configuramos el comando de Windows 'tasklist' para listar los procesos activos
	        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "tasklist");

	        try {
	            System.out.println("Obteniendo la lista de procesos activos en Windows...");
	            
	            // 🚀 2. Arrancamos el proceso
	            Process proceso = pb.start();

	            // 📥 3. Conectamos la tubería de lectura para capturar el texto del comando
	            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
	            
	            String linea;
	            System.out.println("\n==================== LISTA DE PROCESOS ====================");
	            
	            // 🔄 4. Leemos y mostramos línea por línea todos los procesos del sistema
	            while ((linea = lector.readLine()) != null) {
	                System.out.println(linea);
	            }
	            System.out.println("===========================================================\n");
	            
	            // Cerramos el flujo
	            lector.close();

	        } catch (IOException e) {
	            System.out.println("Error al intentar ejecutar el comando tasklist.");
	            e.printStackTrace();
	        }
	    }
}
