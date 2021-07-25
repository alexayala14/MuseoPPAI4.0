package Modelos;

public class TipoVisita{
    String nombre;

    public TipoVisita() {
    }

    public TipoVisita(String nombre) {
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
        return "TipoVisita{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}