package Modelo;

import java.time.LocalDate;


public class Partido {
    // Atributos de la clase
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    private String lugar;
    private LocalDate fecha;

    // Constructor vacío (necesario para muchos frameworks como Spring o Hibernate)
    public Partido() {
    }

    // Constructor con todos los parámetros
    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante, String lugar, LocalDate fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    // Métodos Getters y Setters
    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Método toString para visualizar el objeto fácilmente
    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                ", golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                ", lugar='" + lugar + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
