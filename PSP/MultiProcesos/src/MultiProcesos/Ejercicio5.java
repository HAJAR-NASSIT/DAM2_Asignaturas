package MultiProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
	  public static void main(String[] args) {
	        // 1. Comando para buscar si 'notepad.exe' está corriendo en el sistema
	        ProcessBuilder pbBuscar = new ProcessBuilder("cmd.exe", "/c", "tasklist /FI \"IMAGENAME eq notepad.exe\"");

	        try {
	            System.out.println("Comprobando si el Bloc de notas está abierto...");
	            Process procesoBuscar = pbBuscar.start();

	            // Leemos la respuesta del comando tasklist
	            BufferedReader lector = new BufferedReader(new InputStreamReader(procesoBuscar.getInputStream()));
	            String linea;
	            boolean estaEjecutandose = false;

	            while ((linea = lector.readLine()) != null) {
	                // Si en la respuesta aparece "notepad.exe", significa que está activo
	                if (linea.contains("notepad.exe")) {
	                    estaEjecutandose = true;
	                }
	            }
	            lector.close();

	            // 2. Si está abierto, creamos el proceso para eliminarlo
	            if (estaEjecutandose) {
	                System.out.println("¡Detectado! El Bloc de notas se está ejecutando.");
	                System.out.println("Procediendo a matar el proceso...");

	                // Comando taskkill para cerrar el Bloc de notas a la fuerza (/F)
	                ProcessBuilder pbMatar = new ProcessBuilder("cmd.exe", "/c", "taskkill /F /IM notepad.exe");
	                Process procesoMatar = pbMatar.start();

	                // Esperamos un momento a que el comando termine su trabajo
	                procesoMatar.waitFor();
	                System.out.println("El proceso del Bloc de notas ha sido eliminado con éxito.");
	            } else {
	                System.out.println("El Bloc de notas NO se está ejecutando en este momento.");
	            }

	        } catch (IOException | InterruptedException e) {
	            System.out.println("Ocurrió un error al gestionar los procesos.");
	            e.printStackTrace();
	        }
	    }
}
