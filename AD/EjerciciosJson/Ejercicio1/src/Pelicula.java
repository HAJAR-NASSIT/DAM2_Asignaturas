import java.util.List;

public class Pelicula {
    private String titulo = "";
    private String genero = "";
    private int duracion = 0;
    private List<Session> sessiones;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int duracion, List<Session> sessiones) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.sessiones = sessiones;
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

    public List<Session> getSessiones() {
        return sessiones;
    }

    public void setSessiones(List<Session> sessiones) {
        this.sessiones = sessiones;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}

