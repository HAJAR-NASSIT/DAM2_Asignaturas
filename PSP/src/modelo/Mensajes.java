package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mensajes {

	public static void CargarMensaje() throws IOException {
		File f = new File("ficheros/Mensajes.txt");
		FileReader fr = new FileReader(f);
		try (
			BufferedReader bf = new BufferedReader(fr)) {
			String linea;
			while((linea = bf.readLine()) != null) {
				System.out.println(linea);
			}
			bf.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void GuardarMensaje() throws IOException {
		File f = new File("ficheros/Mensajes.txt");
		FileWriter fr = new FileWriter(f);
		try (
			BufferedWriter br = new BufferedWriter(fr)) {
			
			
			
			br.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
