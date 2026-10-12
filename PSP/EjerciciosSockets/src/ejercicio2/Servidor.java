package ejercicio2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Servidor {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try (ServerSocket servidor = new ServerSocket(6000)) {
			System.out.println("Esperando connexion ...");
			Socket cliente = servidor.accept();
			System.out.println("Existe una connexion");

			ObjectOutputStream salida = new ObjectOutputStream(cliente.getOutputStream());

			Persona p = new Persona("16078123X", "Pepito", "Grillo", new Date(1990, 12, 12), 'M');
			salida.writeObject(p);

			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			Persona persona = (Persona) entrada.readObject();
			System.out.println(persona.toString());
			servidor.close();
			cliente.close();
		}
	}

}
