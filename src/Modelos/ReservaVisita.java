package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

public class ReservaVisita{

    private int cantidadAlumnos;
    private int cantidadAlumnosConfirmada;
    private LocalTime duracionEstimada;
    private LocalDate fechaHoraCreacion;
    private LocalDate fechaHoraReserva;
    private LocalTime horaFinReal;
    private LocalTime horaInicioReal;
    private int numeroReserva;
    private Exposicion[] exposicions;
    private Sede sede;
    private Escuela escuela;
    private CambioDeEstado[] cambioDeEstados;
    private AsignacionVisita[] asignacionVisitas;



    public ReservaVisita() {
    }

    public ReservaVisita(int cantidadAlumnos, int cantidadAlumnosConfirmada, LocalTime duracionEstimada, LocalDate fechaHoraCreacion, LocalDate fechaHoraReserva, LocalTime horaFinReal, LocalTime horaInicioReal, int numeroReserva, Exposicion[] exposicions, Sede sede, Escuela escuela, CambioDeEstado[] cambioDeEstados, AsignacionVisita[] asignacionVisitas) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.cantidadAlumnosConfirmada = cantidadAlumnosConfirmada;
        this.duracionEstimada = duracionEstimada;
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraReserva = fechaHoraReserva;
        this.horaFinReal = horaFinReal;
        this.horaInicioReal = horaInicioReal;
        this.numeroReserva = numeroReserva;
        this.exposicions = exposicions;
        this.sede = sede;
        this.escuela = escuela;
        this.cambioDeEstados = cambioDeEstados;
        this.asignacionVisitas = asignacionVisitas;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public int getCantidadAlumnosConfirmada() {
        return cantidadAlumnosConfirmada;
    }

    public void setCantidadAlumnosConfirmada(int cantidadAlumnosConfirmada) {
        this.cantidadAlumnosConfirmada = cantidadAlumnosConfirmada;
    }

    public LocalTime getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(LocalTime duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public LocalDate getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(LocalDate fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public LocalDate getFechaHoraReserva() {
        return fechaHoraReserva;
    }

    public void setFechaHoraReserva(LocalDate fechaHoraReserva) {
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public LocalTime getHoraFinReal() {
        return horaFinReal;
    }

    public void setHoraFinReal(LocalTime horaFinReal) {
        this.horaFinReal = horaFinReal;
    }

    public LocalTime getHoraInicioReal() {
        return horaInicioReal;
    }

    public void setHoraInicioReal(LocalTime horaInicioReal) {
        this.horaInicioReal = horaInicioReal;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Exposicion[] getExposicions() {
        return exposicions;
    }

    public void setExposicions(Exposicion[] exposicions) {
        this.exposicions = exposicions;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public CambioDeEstado[] getCambioDeEstados() {
        return cambioDeEstados;
    }

    public void setCambioDeEstados(CambioDeEstado[] cambioDeEstados) {
        this.cambioDeEstados = cambioDeEstados;
    }

    public AsignacionVisita[] getAsignacionVisitas() {
        return asignacionVisitas;
    }

    public void setAsignacionVisitas(AsignacionVisita[] asignacionVisitas) {
        this.asignacionVisitas = asignacionVisitas;
    }

    @Override
    public String toString() {
        return "ReservaVisita{" +
                "cantidadAlumnos=" + cantidadAlumnos +
                ", cantidadAlumnosConfirmada=" + cantidadAlumnosConfirmada +
                ", duracionEstimada=" + duracionEstimada +
                ", fechaHoraCreacion=" + fechaHoraCreacion +
                ", fechaHoraReserva=" + fechaHoraReserva +
                ", horaFinReal=" + horaFinReal +
                ", horaInicioReal=" + horaInicioReal +
                ", numeroReserva=" + numeroReserva +
                ", exposicions=" + Arrays.toString(exposicions) +
                ", sede=" + sede +
                ", escuela=" + escuela +
                ", cambioDeEstados=" + Arrays.toString(cambioDeEstados) +
                ", asignacionVisitas=" + Arrays.toString(asignacionVisitas) +
                '}';
    }

    /*conocerAsignacionGuia(){}
    conocerCambioEstado(){}
    conocerEmpleado(){}
    conocerExposicion(){}
    concoerSede(){}*/

}