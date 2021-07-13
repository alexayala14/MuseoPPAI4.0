package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrestamoAMuseo {
    private LocalDate fechaDevolucion;
    private LocalDate fechaPrestamo;
    private String responsableMuseo;
    private LocalTime tiempoPrestamo;
    private Museo museo;

    public PrestamoAMuseo() {
    }

    public PrestamoAMuseo(LocalDate fechaDevolucion, LocalDate fechaPrestamo, String responsableMuseo, LocalTime tiempoPrestamo, Museo museo) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaPrestamo = fechaPrestamo;
        this.responsableMuseo = responsableMuseo;
        this.tiempoPrestamo = tiempoPrestamo;
        this.museo = museo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getResponsableMuseo() {
        return responsableMuseo;
    }

    public void setResponsableMuseo(String responsableMuseo) {
        this.responsableMuseo = responsableMuseo;
    }

    public LocalTime getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(LocalTime tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public Museo getMuseo() {
        return museo;
    }

    public void setMuseo(Museo museo) {
        this.museo = museo;
    }

    @Override
    public String toString() {
        return "PrestamoAMuseo{" +
                "fechaDevolucion=" + fechaDevolucion +
                ", fechaPrestamo=" + fechaPrestamo +
                ", responsableMuseo='" + responsableMuseo + '\'' +
                ", tiempoPrestamo=" + tiempoPrestamo +
                ", museo=" + museo +
                '}';
    }

    //conocerMuseo;
}
