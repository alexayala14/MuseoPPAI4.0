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

    @java.lang.Override
    public java.lang.String toString() {
        return "TipoDeEntrada{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}