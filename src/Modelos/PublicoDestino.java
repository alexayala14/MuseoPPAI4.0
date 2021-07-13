package Modelos;

public class PublicoDestino {
    private String caracteristicas;
    private String nombre;

    public PublicoDestino(String caracteristicas, String nombre) {
        this.caracteristicas = caracteristicas;
        this.nombre = nombre;
    }

    public PublicoDestino() {
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PublicoDestino{" +
                "caracteristicas='" + caracteristicas + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
