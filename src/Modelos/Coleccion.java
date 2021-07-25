package Modelos;

import java.time.LocalDate;
import java.util.Arrays;

public class Coleccion {
    private String descripcion;
    private LocalDate fechaFinVigencia;
    private LocalDate fechaInicioVigencia;
    private String nombre;
    private Subcoleccion[] subcoleccions;

    public Coleccion() {
    }

    public Coleccion(String descripcion, LocalDate fechaFinVigencia, LocalDate fechaInicioVigencia, String nombre, Subcoleccion[] subcoleccions) {
        this.descripcion = descripcion;
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.nombre = nombre;
        this.subcoleccions = subcoleccions;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public LocalDate getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDate fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Subcoleccion[] getSubcoleccions() {
        return subcoleccions;
    }

    public void setSubcoleccions(Subcoleccion[] subcoleccions) {
        this.subcoleccions = subcoleccions;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "descripcion='" + descripcion + '\'' +
                ", fechaFinVigencia=" + fechaFinVigencia +
                ", fechaInicioVigencia=" + fechaInicioVigencia +
                ", nombre='" + nombre + '\'' +
                ", subcoleccions=" + Arrays.toString(subcoleccions) +
                '}';
    }
}
