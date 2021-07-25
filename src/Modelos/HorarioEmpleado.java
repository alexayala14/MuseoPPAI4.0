package Modelos;

import java.time.LocalDate;
import java.util.Arrays;

public class HorarioEmpleado {
    private LocalDate horarioIngreso;
    private LocalDate horarioSalida;
    private DiaSemana[] diaSemanas;

    public HorarioEmpleado() {
    }

    public HorarioEmpleado(LocalDate horarioIngreso, LocalDate horarioSalida, DiaSemana[] diaSemanas) {
        this.horarioIngreso = horarioIngreso;
        this.horarioSalida = horarioSalida;
        this.diaSemanas = diaSemanas;
    }

    public LocalDate getHorarioIngreso() {
        return horarioIngreso;
    }

    public void setHorarioIngreso(LocalDate horarioIngreso) {
        this.horarioIngreso = horarioIngreso;
    }

    public LocalDate getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(LocalDate horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public DiaSemana[] getDiaSemanas() {
        return diaSemanas;
    }

    public void setDiaSemanas(DiaSemana[] diaSemanas) {
        this.diaSemanas = diaSemanas;
    }

    @Override
    public String toString() {
        return "HorarioEmpleado{" +
                "horarioIngreso=" + horarioIngreso +
                ", horarioSalida=" + horarioSalida +
                ", diaSemanas=" + Arrays.toString(diaSemanas) +
                '}';
    }
}
