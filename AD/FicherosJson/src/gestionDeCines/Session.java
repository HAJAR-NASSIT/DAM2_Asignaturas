package gestionDeCines;

public class Session {
	private String hora;
	private int sala;
	private double precio;
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "hora=" + hora + "| sala=" + sala + "| precio=" + precio + "";
	}
	
	
}
