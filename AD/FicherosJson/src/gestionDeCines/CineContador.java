package gestionDeCines;

import java.util.ArrayList;

public class CineContador {
	ArrayList<Cine> cines ;

	public CineContador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Cine> getCines() {
		return cines;
	}

	public void setCines(ArrayList<Cine> cines) {
		this.cines = cines;
	}

	@Override
	public String toString() {
		return "CineContador [cines=" + cines + "]";
	}
	
	
}
