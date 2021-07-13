package Modelos;

public class Especialidad {
    private String descripcion;
    private String nombre;
    private Estilo estilo;
    private Tecnica tecnica;

    public Especialidad() {
    }

    public Especialidad(String descripcion, String nombre, Estilo estilo, Tecnica tecnica) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
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

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estilo=" + estilo +
                ", tecnica=" + tecnica +
                '}';
    }

    //conocerEstilo();
    //conocerTecnica();
}
