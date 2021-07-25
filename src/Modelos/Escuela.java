package Modelos;

public class Escuela{
    private String domicilio;
    private String email;
    private String nombre;
    private String telefCelular;
    private String teleFijo;

    public Escuela() {
    }

    public Escuela(String domicilio, String email, String nombre, String telefCelular, String teleFijo) {
        this.domicilio = domicilio;
        this.email = email;
        this.nombre = nombre;
        this.telefCelular = telefCelular;
        this.teleFijo = teleFijo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefCelular() {
        return telefCelular;
    }

    public void setTelefCelular(String telefCelular) {
        this.telefCelular = telefCelular;
    }

    public String getTeleFijo() {
        return teleFijo;
    }

    public void setTeleFijo(String teleFijo) {
        this.teleFijo = teleFijo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Escuela{" +
                "domicilio='" + domicilio + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefCelular='" + telefCelular + '\'' +
                ", teleFijo='" + teleFijo + '\'' +
                '}';
    }
}