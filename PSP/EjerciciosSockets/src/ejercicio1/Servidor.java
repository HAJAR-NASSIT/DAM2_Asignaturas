package ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class Servidor {
	public static void main(String[] args) throws IOException {
		try (ServerSocket servidor = new ServerSocket(6000)) {
			System.out.println("Esperando la connexion..");
			
			for (int i = 1; i<=3;i++) {
				Socket cliente = servidor.accept();
				
				DataInputStream entrada = new DataInputStream(cliente.getInputStream());
				String mensaje = entrada.readUTF();
				System.out.println("Recibido : " +mensaje);
				
				DataOutputStream salida = new DataOutputStream(cliente.getOutputStream());
				salida.writeUTF("Saludos desde el servidor al cliente " + i);
			}
		}
		System.out.println("Demadiados clientes para hoy ");
		
	}
	
}
