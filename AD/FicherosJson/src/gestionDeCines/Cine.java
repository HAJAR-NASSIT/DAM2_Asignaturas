package gestionDeCines;

import java.util.ArrayList;

public class Cine {
	private String nombre ;
	private String ciudad;
	private String direccion;
	private ArrayList<Pelicula> peliculas;
	public Cine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	@Override
	public String toString() {
		return "Cine [nombre=" + nombre + ", ciudad=" + ciudad + ", direccion=" + direccion + ", peliculas=" + peliculas
				+ "]";
	}
	
}
