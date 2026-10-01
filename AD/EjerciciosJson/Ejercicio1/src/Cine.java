import java.util.Collections;
import java.util.List;

public class Cine {
    private String nombre;
    private String cuidad;
    private String direccion;
    private List<Pelicula> peliculas;

    public Cine(String nombre, String cuidad, String direccion, List<Pelicula> peliculas) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        this.direccion = direccion;
        this.peliculas = peliculas;
    }

    public Cine() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", cuidad='" + cuidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", peliculas=" + peliculas +
                '}';
    }
}
