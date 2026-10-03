package gestionDeCines;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class GestionDeCines {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//cargarCines();
		//peliculasDisponibles();

		/**System.out.print("Introduce el titulo de la pelicula :");
		String titulo = teclado.nextLine();
		
		buscarPelicula(titulo);**/
		
		buscarPeliculaPorGenero();
	}
	
	
	public static void cargarCines() {
		Gson g = new Gson();
		
		try {
			FileReader reader = new FileReader("Ficheros/cines.json");
			CineContador cinecontador = g.fromJson(reader, CineContador.class);
			ArrayList<Cine> cines = cinecontador.cines;
			System.out.println("Cines disponibles");
			System.out.println("----------------------");
			for (Cine entrada : cines) {
				String nombre = entrada.getNombre();
				System.out.println(nombre);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void peliculasDisponibles() {
		Gson g = new Gson();
		try {
			FileReader reader = new FileReader("Ficheros/cines.json");
			CineContador cinecontador = g.fromJson(reader, CineContador.class);
			ArrayList<Cine> cines = cinecontador.cines;
			System.out.println("Peliculas Disponibles");
			System.out.println("--------------------------");
			for (Cine entrada : cines) {
			ArrayList<Pelicula> peliculas =	entrada.getPeliculas();
				for (Pelicula pelicula : peliculas) {
					String nombre = pelicula.getTitulo();
					System.out.println(nombre);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void buscarPelicula(String titulo) {
		
		Gson g = new Gson();
		try {
			FileReader reader = new FileReader("Ficheros/cines.json");
			CineContador cinecontador = g.fromJson(reader, CineContador.class);
			ArrayList<Cine> cines = cinecontador.cines;
			for (Cine entrada : cines) {
			ArrayList<Pelicula> peliculas =	entrada.getPeliculas();
				for (Pelicula pelicula : peliculas) {
					if(titulo.equals(pelicula.getTitulo())) {
						System.out.println("Pelicula : " +pelicula.getTitulo());
						ArrayList<Session> sessiones = pelicula.getSesiones();
							for (Session session : sessiones) {
								System.out.println(session.toString());
							}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void buscarPeliculaPorGenero() {
		Gson g = new Gson();
		try {
			FileReader reader = new FileReader("Ficheros/cines.json");
			CineContador cinecontador = g.fromJson(reader, CineContador.class);
			ArrayList<Cine> cines = cinecontador.cines;
			System.out.println("Peliculas de ciencia de ficcion");
			System.out.println("-----------------------------");
			for (Cine entrada : cines) {
			ArrayList<Pelicula> peliculas =	entrada.getPeliculas();
				for (Pelicula pelicula : peliculas) {
					if(pelicula.getGenero().equals("Ciencia ficción")) {
						System.out.println(entrada.getNombre() + "->" + pelicula.getTitulo());
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
