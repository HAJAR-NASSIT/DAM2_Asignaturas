package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GestionarFicheros {

	public static ArrayList<Mensaje> CargarMensaje() throws IOException {
		ArrayList<Mensaje> mensajes = new ArrayList<>();
		File f = new File("ficheros/Mensajes.txt");
		FileReader fr = new FileReader(f);
		try (BufferedReader bf = new BufferedReader(fr)) {
			String linea;
			while ((linea = bf.readLine()) != null) {
				String datos[] = linea.split(",");
				if(datos.length == 6) {
					
					String fecha=datos[0];
					String hora=datos[1];
					String para=datos[2];
					String de=datos[3];
					String asunto=datos[4];
					String contenido=datos[5];
					
					Mensaje p = new Mensaje(fecha, hora,  para, de, asunto, contenido);
					mensajes.add(p);
				}
			
			}
			int totalMENSAJES=mensajes.size();
			JOptionPane.showMessageDialog(null, "se han cargado en memoria" +totalMENSAJES+ "mensajes");

			bf.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mensajes;
	}

	public static void GuardarMensaje(ArrayList<Mensaje> mensajes) throws IOException {
		File f = new File("ficheros/Mensajes.txt");
		FileWriter fr = new FileWriter(f);
		try (BufferedWriter bw = new BufferedWriter(fr)) {
			for (Mensaje m : mensajes) {
				String lineaEscribir = m.toString();
				bw.write(lineaEscribir);
				bw.write("**************");
			}
			JOptionPane.showMessageDialog(null, "Los mensajes en memoria, han sido guardados en el fichero MENSAJES.TXT.", "Guardado Exitoso", JOptionPane.INFORMATION_MESSAGE);

			bw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
