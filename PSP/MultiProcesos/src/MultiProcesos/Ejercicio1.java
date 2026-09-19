package MultiProcesos;

import java.io.IOException;

public class Ejercicio1 {
	 public static void main(String[] args) {
	        // 1. Configuramos el programa que queremos abrir (El Bloc de Notas)
	        // En Windows, el Bloc de notas se llama "notepad.exe"
	        ProcessBuilder pb = new ProcessBuilder("notepad.exe");

	        try {
	            System.out.println("Intentando abrir el Bloc de Notas...");

	            // 2. Arrancamos el proceso externo
	            Process proceso = pb.start();

	            // 3. Recuperamos y mostramos el ID (PID) asignado por Windows
	            long pid = proceso.pid();
	            System.out.println("¡Proceso abierto con éxito!");
	            System.out.println("El ID (PID) asignado por el sistema es: " + pid);

	        } catch (IOException e) {
	            System.out.println("Error al intentar arrancar el proceso.");
	            e.printStackTrace();
	        }
	    }
}
