package Modelos;

public class TipoExposicion {
    private String descripcion;
    private String nombre;

    public TipoExposicion() {
    }

    public TipoExposicion(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "TipoExposicion{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
