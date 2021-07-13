package Modelos;

import java.time.LocalDate;

public class Usuario {
    private String nombre;
    private LocalDate caducidad;
    private String contraseña;
    private Empleado empleado;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate caducidad, String contraseña, Empleado empleado) {
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.contraseña = contraseña;
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


}
