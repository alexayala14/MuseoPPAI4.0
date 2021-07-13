package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sesion {
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private LocalTime horaFin;
    private LocalTime horaInicio;
    private Usuario usuario;

    public Sesion() {
    }

    public Sesion(LocalDate fechaFin, LocalDate fechaInicio, LocalTime horaFin, LocalTime horaInicio, Usuario usuario) {
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
        this.usuario = usuario;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "fechaFin=" + fechaFin +
                ", fechaInicio=" + fechaInicio +
                ", horaFin=" + horaFin +
                ", horaInicio=" + horaInicio +
                ", usuario=" + usuario +
                '}';
    }

    //conocerUsuario;
}
