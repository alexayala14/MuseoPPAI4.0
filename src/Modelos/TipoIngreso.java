package Modelos;

public class TipoIngreso {
    private String descripcion;
    private String nombre;

    public TipoIngreso() {
    }

    public TipoIngreso(String descripcion, String nombre) {
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
        return "TipoIngreso{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
