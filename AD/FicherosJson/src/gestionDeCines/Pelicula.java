package gestionDeCines;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private ArrayList<Session> sesiones;
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public ArrayList<Session> getSesiones() {
		return sesiones;
	}
	public void setSesiones(ArrayList<Session> sesiones) {
		this.sesiones = sesiones;
	}
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", sessiones="
				+ sesiones + "]";
	}

	
	
}
