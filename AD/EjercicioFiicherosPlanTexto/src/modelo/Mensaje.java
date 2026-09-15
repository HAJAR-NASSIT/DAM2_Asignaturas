package modelo;

public class Mensaje {

	private String fecha;
	private String hora;
	private String para;
	private String de;
	private String asunto;
	private String Contenido;

	public Mensaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mensaje(String fecha, String hora, String para, String de, String asunto, String contenido) {
		this.fecha = fecha;
		this.hora = hora;
		this.para = para;
		this.de = de;
		this.asunto = asunto;
		Contenido = contenido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return para;
	}

	public void setNombre(String nombre) {
		this.para = nombre;
	}

	public String getCiudad() {
		return de;
	}

	public void setCiudad(String ciudad) {
		this.de = ciudad;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return Contenido;
	}

	public void setContenido(String contenido) {
		Contenido = contenido;
	}

	@Override
	public String toString() {
		return "fecha:" + fecha + "\n hora:" + hora + "\n para:" + para + "\n de:" + de + "\n asunto:" + asunto
				+ "\n Contenido:" + Contenido + "]";
	}

}
