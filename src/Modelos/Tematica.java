package Modelos;

public class Tematica {
    private String nombre;

    public Tematica() {
    }

    public Tematica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tematica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
