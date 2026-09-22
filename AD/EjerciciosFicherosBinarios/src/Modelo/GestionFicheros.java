package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionFicheros {

	@SuppressWarnings("unchecked")
	public ArrayList<Partido> cargarPartidos(){
		File fichero = new File("ficheros/Resultados.dat") ;
				ArrayList<Partido> listaPartidos = new ArrayList<Partido>();
				
		if (fichero.exists()) {
			try {@SuppressWarnings("resource")
			ObjectInputStream entrada = new ObjectInputStream(
					new FileInputStream(fichero));
			listaPartidos = (ArrayList<Partido>) entrada.readObject();
		}
			
		 catch (IOException | ClassNotFoundException e) {
			System.out.println("error al leer " + e.getMessage());
		}
	
		}
		return listaPartidos;
	}

	@SuppressWarnings("resource")
	public void guardarPartidos(ArrayList<Partido> partidos) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("ficheros/Resultados.dat"));
			salida.writeObject(partidos);

		} catch (IOException e) {
			System.out.println("Error al guardar el fichero");
			// TODO: handle exception
		}
	}
}
