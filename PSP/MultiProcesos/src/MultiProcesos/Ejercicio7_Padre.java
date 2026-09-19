package MultiProcesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ejercicio7_Padre {
	  public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        
	        // 1. Pedimos el texto al usuario real por la consola del IDE
	        System.out.print("[PADRE] Introduce una cadena de caracteres: ");
	        String cadenaUsuario = teclado.nextLine();

	        // 2. Configuramos el ProcessBuilder para ejecutar la clase EjemploLectura
	        // Usamos el comando java -cp (classpath) apuntando a la carpeta de binarios 'bin' de tu proyecto
	        ProcessBuilder pb = new ProcessBuilder("java", "-cp", "bin", "ejercicio1.Ejercicio7_hijo");

	        try {
	            // 🚀 3. Arrancamos el programa hijo
	            Process hijo = pb.start();

	            // ✍️ 4. TUBERÍA DE ESCRITURA: Le enviamos la cadena de texto al hijo
	            BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(hijo.getOutputStream()));
	            escritor.write(cadenaUsuario);
	            escritor.newLine(); // Es vital enviar el salto de línea para que su 'readLine()' avance
	            escritor.flush();   // Forzamos el envío inmediato de los datos
	            escritor.close();   // Cerramos el flujo para avisar al hijo que ya no enviaremos más

	            // 📥 5. TUBERÍA DE LECTURA: Leemos lo que el hijo responde y escribe en su consola
	            BufferedReader lector = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
	            String respuestaHijo = lector.readLine();
	            
	            // 🖥️ 6. Mostramos el resultado final por pantalla
	            System.out.println("[PADRE] El programa hijo responde lo siguiente:");
	            System.out.println(respuestaHijo);

	            lector.close();
	            teclado.close();

	        } catch (Exception e) {
	            System.out.println("Error en la comunicación entre procesos.");
	            e.printStackTrace();
	        }
	    }
}
