package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class HorarioSede {
    private LocalTime horaApertura;
    private  LocalTime horaCierre;
    private DiaSemana[] diaSemanas;
    public HorarioSede() {
    }

    public HorarioSede(LocalTime horaApertura, LocalTime horaCierre, DiaSemana[] diaSemanas) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.diaSemanas = diaSemanas;
    }

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public DiaSemana[] getDiaSemanas() {
        return diaSemanas;
    }

    public void setDiaSemanas(DiaSemana[] diaSemanas) {
        this.diaSemanas = diaSemanas;
    }

    @Override
    public String toString() {
        return "HorarioSede{" +
                "horaApertura=" + horaApertura +
                ", horaCierre=" + horaCierre +
                ", diaSemanas=" + Arrays.toString(diaSemanas) +
                '}';
    }

    //conocerDiaSemana();
}
