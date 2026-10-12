package ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		try (Socket cliente = new Socket("localhost",6000)) {
			System.out.println("Connexion realizada con el servidor ");
			
			DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
			salida.writeUTF("Hola servidor , soy un cliente");
			
			DataInputStream entrada = new DataInputStream(cliente.getInputStream());
			String mensaje = entrada.readUTF();
			System.out.println(mensaje);
		}
	}
}
