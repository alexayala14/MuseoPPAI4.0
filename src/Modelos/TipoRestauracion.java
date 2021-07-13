package Modelos;

public class TipoRestauracion {
    private String descripcion;
    private String nombre;

    public TipoRestauracion() {
    }

    public TipoRestauracion(String descripcion, String nombre) {
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
        return "TipoRestauracion{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
