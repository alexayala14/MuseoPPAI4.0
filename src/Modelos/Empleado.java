package Modelos;

import java.time.LocalDate;

public class Empleado {
    private String apellido;
    private String codigoValidacion;
    private String cuil;
    private String dni;
    private String domicilio;
    private LocalDate fechaIngreso;
    private LocalDate fechaNacimiento;
    private String mail;
    private String nombre;
    private String sexo;
    private String telefono;
    private Cargo cargo;
    private HorarioEmpleado horarioEmpleado;

    public Empleado() {
    }

    public Empleado(String apellido, String codigoValidacion, String cuil, String dni, String domicilio, LocalDate fechaIngreso, LocalDate fechaNacimiento, String mail, String nombre, String sexo, String telefono, Cargo cargo, HorarioEmpleado horarioEmpleado) {
        this.apellido = apellido;
        this.codigoValidacion = codigoValidacion;
        this.cuil = cuil;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.cargo = cargo;
        this.horarioEmpleado = horarioEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(String codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public HorarioEmpleado getHorarioEmpleado() {
        return horarioEmpleado;
    }

    public void setHorarioEmpleado(HorarioEmpleado horarioEmpleado) {
        this.horarioEmpleado = horarioEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "apellido='" + apellido + '\'' +
                ", codigoValidacion='" + codigoValidacion + '\'' +
                ", cuil='" + cuil + '\'' +
                ", dni='" + dni + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaNacimiento=" + fechaNacimiento +
                ", mail='" + mail + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cargo=" + cargo +
                ", horarioEmpleado=" + horarioEmpleado +
                '}';
    }

    //conocerCargo();
    //conocerHorario();

}
