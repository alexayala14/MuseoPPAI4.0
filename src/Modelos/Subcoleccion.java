package Modelos;

import java.util.Arrays;

public class Subcoleccion {
    private String descripcion;
    private String nombre;
    private Obra[] obras;

    public Subcoleccion() {
    }

    public Subcoleccion(String descripcion, String nombre, Obra[] obras) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.obras = obras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Obra[] getObras() {
        return obras;
    }

    public void setObras(Obra[] obras) {
        this.obras = obras;
    }

    @Override
    public String toString() {
        return "Subcoleccion{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", obras=" + Arrays.toString(obras) +
                '}';
    }
}
