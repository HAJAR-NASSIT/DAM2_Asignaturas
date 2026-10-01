public class Session {

    private String hora;
    private int sala ;
    private double precio;

    public Session(String hora, int sala, double precio) {
        this.hora = hora;
        this.sala = sala;
        this.precio = precio;
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
        return "Session{" +
                "hora='" + hora + '\'' +
                ", sala=" + sala +
                ", precio=" + precio +
                '}';
    }
}
