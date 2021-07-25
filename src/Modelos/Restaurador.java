package Modelos;

import java.util.List;

public class Restaurador {

    private String apellido;
    private String nombre;
    private String domicilio;
    private String email;
    private String telefono;
    private Especialidad[] especialidadList;

    public Restaurador() {
    }

    public Restaurador(String apellido, String nombre, String domicilio, String email, String telefono, Especialidad[] especialidadList) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
        this.especialidadList = especialidadList;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad[] getEspecialidadList() {
        return especialidadList;
    }

    public void setEspecialidadList(Especialidad[] especialidadList) {
        this.especialidadList = especialidadList;
    }
}
