package ejercicio2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) throws ClassNotFoundException {
		try (Socket cliente = new Socket("localhost",6000)) {

			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			
			@SuppressWarnings("deprecation")
			Date date = new Date(82, 12, 01);

			Persona p = (Persona) entrada.readObject();
			p.setNombre("Carmen");
			p.setFechaNacimiento(date);
			
			ObjectOutputStream salida = new ObjectOutputStream(cliente.getOutputStream());
			salida.writeObject(p);
			
			cliente.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
