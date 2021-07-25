package Modelos;

public class TipoDeEntrada{
    String nombre;

    public TipoDeEntrada() {
    }

    public TipoDeEntrada(String nombre) {
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
        return "TipoDeEntrada{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}