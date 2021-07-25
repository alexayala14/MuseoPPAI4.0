package Modelos;

import java.time.LocalDate;

public class CambioDeEstado {
    private LocalDate fechaHoraFin;
    private LocalDate fechaHoraInicio;
    private Estado estado;

    public CambioDeEstado(LocalDate fechaHoraFin, LocalDate fechaHoraInicio, Estado estado) {
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }

    public CambioDeEstado() {
    }

    public LocalDate getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDate fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public LocalDate getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(LocalDate fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CambioDeEstado{" +
                "fechaHoraFin=" + fechaHoraFin +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", estado=" + estado +
                '}';
    }
}
