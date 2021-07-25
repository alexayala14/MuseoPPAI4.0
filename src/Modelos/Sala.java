package Modelos;

import java.util.Arrays;

public class Sala {
    private String nombre;
    private float superficie;
    private Pared[] pareds;

    public Sala() {
    }

    public Sala(String nombre, float superficie, Pared[] pareds) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.pareds = pareds;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public Pared[] getPareds() {
        return pareds;
    }

    public void setPareds(Pared[] pareds) {
        this.pareds = pareds;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nombre='" + nombre + '\'' +
                ", superficie=" + superficie +
                ", pareds=" + Arrays.toString(pareds) +
                '}';
    }
}
