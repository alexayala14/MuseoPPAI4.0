package Modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AsignacionVisita {
    private LocalDate fechaHoraFin;
    private LocalDate fechaHoraInicio;
    private Empleado empleado;

    public AsignacionVisita() {
    }

    public AsignacionVisita(LocalDate fechaHoraFin, LocalDate fechaHoraInicio, Empleado empleado) {
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraInicio = fechaHoraInicio;
        this.empleado = empleado;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "AsignacionVisita{" +
                "fechaHoraFin=" + fechaHoraFin +
                ", fechaHoraInicio=" + fechaHoraInicio +
                ", empleado=" + empleado +
                '}';
    }
}
