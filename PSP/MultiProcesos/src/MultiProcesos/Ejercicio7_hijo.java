package MultiProcesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7_hijo {
	 public static void main(String[] args) {
	        // Conectamos un lector a la entrada estándar (teclado invisible)
	        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	        
	        try {
	            // Se queda esperando a que el programa padre le envíe una línea de texto
	            String textoRecibido = lector.readLine();
	            
	            // Modificamos el texto para demostrar que el hijo lo ha procesado
	            System.out.println("[HIJO] He recibido tu texto. Versión en MAYÚSCULAS: " + textoRecibido.toUpperCase());
	            
	            lector.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
