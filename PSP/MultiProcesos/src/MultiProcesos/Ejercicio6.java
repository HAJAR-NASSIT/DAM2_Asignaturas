package MultiProcesos;

import java.io.File;
import java.io.IOException;

public class Ejercicio6 {
	public static void main(String[] args) {
        // 1. Configuramos el ProcessBuilder para ejecutar nuestro archivo .bat
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "mi_script.bat");

        // 2. Definimos los archivos físicos donde se guardará cada flujo
        File archivoSalida = new File("salida.txt");
        File archivoErrores = new File("errores.txt");

        // 🎯 3. REDIRECCIÓN DE FLUJOS: Redirigimos la salida normal y los errores
        pb.redirectOutput(archivoSalida);
        pb.redirectError(archivoErrores);

        try {
            System.out.println("Ejecutando mi_script.bat...");
            
            // 🚀 4. Arrancamos el proceso
            Process proceso = pb.start();

            // ⏳ 5. Esperamos a que el .bat termine por completo su ejecución
            int codigoSalida = proceso.waitFor();
            
            System.out.println("Script finalizado.");
            System.out.println("Código de salida del proceso: " + codigoSalida);
            System.out.println("Revisa los archivos 'salida.txt' y 'errores.txt' creados en tu proyecto.");

        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al ejecutar el archivo .bat.");
            e.printStackTrace();
        }
    }
}
