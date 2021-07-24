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
    private boolean esSedeActual=false;



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

        TipoVisita[] tipoVisitas=new TipoVisita[4];
        tipoVisitas[0]=new TipoVisita("Exposicion");
        tipoVisitas[1]=new TipoVisita("Exposicion con guia");
        tipoVisitas[2]=new TipoVisita("Completa");
        tipoVisitas[3]=new TipoVisita("Completa con guia");

        //TIPOS DE ENTRADAS
        TipoDeEntrada[] tipoDeEntradas=new TipoDeEntrada[4];
        tipoDeEntradas[0]=new TipoDeEntrada("General");
        tipoDeEntradas[1]=new TipoDeEntrada("Adulto");
        tipoDeEntradas[2]=new TipoDeEntrada("Menores");
        tipoDeEntradas[3]=new TipoDeEntrada("Organizacion");

        //TARIFAS

        Tarifa[] tarifas=new Tarifa[4];
        tarifas[0]=new Tarifa(LocalDate.of(2021,9,22),LocalDate.of(2021,7,20),50,20,tipoDeEntradas[0],tipoVisitas[0]);
        tarifas[1]=new Tarifa(LocalDate.of(2021,8,22),LocalDate.of(2021,5,20),60,8,tipoDeEntradas[1],tipoVisitas[1]);
        tarifas[2]=new Tarifa(LocalDate.of(2021,3,22),LocalDate.of(2021,3,20),70,10,tipoDeEntradas[2],tipoVisitas[2]);
        tarifas[3]=new Tarifa(LocalDate.of(2021,2,22),LocalDate.of(2021,2,20),80,15,tipoDeEntradas[3],tipoVisitas[3]);


       /* Sede[] sedes = new Sede[4];
        sedes[0]=new Sede(50,50,"PEPE",tarifas);
        sedes[1]=new Sede(50,50,"Jose",tarifas);
        sedes[2]=new Sede(50,50,"Alberto",tarifas);
        sedes[3]=new Sede(50,50,"Dario",tarifas);*/

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
    conocerExposicion(){}*/
    public boolean esSedeActual(Sede sede) {
//        System.out.println("EN RESERVA ESSSSSS: "+sede.getNombre());
        if(this.getSede().getNombre().equals(sede.getNombre())){
            System.out.println("EN RESERVA ESSSSSS: "+sede.getNombre());
            this.esSedeActual=true;
            System.out.println("esSedeActual: "+this.esSedeActual);
        }else {
            this.esSedeActual=false;
//            System.out.println("esSedeActual: "+this.esSedeActual);
        }
        return this.esSedeActual;
    }

    public boolean validaHorario(LocalTime horaInicioReal, LocalTime horaFinReal){
        LocalTime ahora = LocalTime.of(21,0,0);
        boolean horarioValido = false;
        if((ahora.isBefore(horaFinReal) || ahora.equals(horaFinReal)) && (ahora.isAfter(horaInicioReal) ||ahora.equals(horaInicioReal))){
            horarioValido = true;
        } else {
            horarioValido = false;
        }
        return horarioValido;
    }


}