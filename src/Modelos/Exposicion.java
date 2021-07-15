package Modelos;

import java.time.LocalDate;
import java.util.Arrays;

public class Exposicion {
    private LocalDate fechaFin;
    private LocalDate FinReplanificada;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioReplanificada;
    private LocalDate horaApertura;
    private LocalDate horaCierra;
    private String nombre;
    private TipoExposicion tipoExposicion;
    private DetalleExposicion1[] detalleExposicions;
    private PublicoDestino[] publicoDestinos;
    private Empleado[] empleados;

    public Exposicion() {
    }

    public Exposicion(LocalDate fechaFin, LocalDate finReplanificada, LocalDate fechaInicio, LocalDate fechaInicioReplanificada, LocalDate horaApertura, LocalDate horaCierra, String nombre, TipoExposicion tipoExposicion, DetalleExposicion1[] detalleExposicions, PublicoDestino[] publicoDestinos, Empleado[] empleados) {
        this.fechaFin = fechaFin;
        FinReplanificada = finReplanificada;
        this.fechaInicio = fechaInicio;
        this.fechaInicioReplanificada = fechaInicioReplanificada;
        this.horaApertura = horaApertura;
        this.horaCierra = horaCierra;
        this.nombre = nombre;
        this.tipoExposicion = tipoExposicion;
        this.detalleExposicions = detalleExposicions;
        this.publicoDestinos = publicoDestinos;
        this.empleados = empleados;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFinReplanificada() {
        return FinReplanificada;
    }

    public void setFinReplanificada(LocalDate finReplanificada) {
        FinReplanificada = finReplanificada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicioReplanificada() {
        return fechaInicioReplanificada;
    }

    public void setFechaInicioReplanificada(LocalDate fechaInicioReplanificada) {
        this.fechaInicioReplanificada = fechaInicioReplanificada;
    }

    public LocalDate getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalDate horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalDate getHoraCierra() {
        return horaCierra;
    }

    public void setHoraCierra(LocalDate horaCierra) {
        this.horaCierra = horaCierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoExposicion getTipoExposicion() {
        return tipoExposicion;
    }

    public void setTipoExposicion(TipoExposicion tipoExposicion) {
        this.tipoExposicion = tipoExposicion;
    }

    public DetalleExposicion1[] getDetalleExposicions() {
        return detalleExposicions;
    }

    public void setDetalleExposicions(DetalleExposicion1[] detalleExposicions) {
        this.detalleExposicions = detalleExposicions;
    }

    public PublicoDestino[] getPublicoDestinos() {
        return publicoDestinos;
    }

    public void setPublicoDestinos(PublicoDestino[] publicoDestinos) {
        this.publicoDestinos = publicoDestinos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Exposicion{" +
                "fechaFin=" + fechaFin +
                ", FinReplanificada=" + FinReplanificada +
                ", fechaInicio=" + fechaInicio +
                ", fechaInicioReplanificada=" + fechaInicioReplanificada +
                ", horaApertura=" + horaApertura +
                ", horaCierra=" + horaCierra +
                ", nombre='" + nombre + '\'' +
                ", tipoExposicion=" + tipoExposicion +
                ", detalleExposicions=" + Arrays.toString(detalleExposicions) +
                ", publicoDestinos=" + Arrays.toString(publicoDestinos) +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }
}
