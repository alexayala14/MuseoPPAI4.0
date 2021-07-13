package Modelos;

public class Donador {
    private String nombre;

    public Donador() {
    }

    public Donador(String nombre) {
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
        return "Donador{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
