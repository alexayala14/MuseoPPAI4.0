package Modelos;

public class Museo {
    private String domicilio;
    private String nombre;
    private String telefono;

    public Museo() {
    }

    public Museo(String domicilio, String nombre, String telefono) {
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Museo{" +
                "domicilio='" + domicilio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
