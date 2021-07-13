package Modelos;

import java.time.LocalDate;

public class Restauracion {
    private String descripcionTrabajo;
    private LocalDate fechaReingreso;
    private LocalDate fechaSalida;
    private float precio;
    private Restaurador restaurador;
    private TipoRestauracion tipoRestauracion;

    public Restauracion() {
    }

    public Restauracion(String descripcionTrabajo, LocalDate fechaReingreso, LocalDate fechaSalida, float precio, Restaurador restaurador, TipoRestauracion tipoRestauracion) {
        this.descripcionTrabajo = descripcionTrabajo;
        this.fechaReingreso = fechaReingreso;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
        this.restaurador = restaurador;
        this.tipoRestauracion = tipoRestauracion;
    }

    public Restaurador getRestaurador() {
        return restaurador;
    }

    public void setRestaurador(Restaurador restaurador) {
        this.restaurador = restaurador;
    }

    public TipoRestauracion getTipoRestauracion() {
        return tipoRestauracion;
    }

    public void setTipoRestauracion(TipoRestauracion tipoRestauracion) {
        this.tipoRestauracion = tipoRestauracion;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public LocalDate getFechaReingreso() {
        return fechaReingreso;
    }

    public void setFechaReingreso(LocalDate fechaReingreso) {
        this.fechaReingreso = fechaReingreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Restauracion{" +
                "descripcionTrabajo='" + descripcionTrabajo + '\'' +
                ", fechaReingreso=" + fechaReingreso +
                ", fechaSalida=" + fechaSalida +
                ", precio=" + precio +
                ", restaurador=" + restaurador +
                ", tipoRestauracion=" + tipoRestauracion +
                '}';
    }

    //conocerRestaurador();
    //conocerTipoRestauracion();

}
