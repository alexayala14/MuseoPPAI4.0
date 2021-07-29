package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Entrada {
    private LocalDate fechaVenta;
    private LocalTime horaVenta;
    private float monto;
    private int numero;
    private AsignacionVisita[] asignacionVisitas;
    private Sede sede;
    private Tarifa tarifa;

    public Entrada() {
    }

    public Entrada(LocalDate fechaVenta, LocalTime horaVenta, float monto, int numero, Sede sede, Tarifa tarifa) {
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.monto = monto;
        this.numero = numero;
        this.sede = sede;
        this.tarifa = tarifa;
    }

    public Entrada(LocalDate fechaVenta, LocalTime horaVenta, float monto, int numero, AsignacionVisita[] asignacionVisitas, Sede sede, Tarifa tarifa) {
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.monto = monto;
        this.numero = numero;
        this.asignacionVisitas = asignacionVisitas;
        this.sede = sede;
        this.tarifa = tarifa;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public LocalTime getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(LocalTime horaVenta) {
        this.horaVenta = horaVenta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public AsignacionVisita[] getAsignacionVisitas() {
        return asignacionVisitas;
    }

    public void setAsignacionVisitas(AsignacionVisita[] asignacionVisitas) {
        this.asignacionVisitas = asignacionVisitas;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "fechaVenta=" + fechaVenta +
                ", horaVenta=" + horaVenta +
                ", monto=" + monto +
                ", numero=" + numero +
                ", asignacionVisitas=" + Arrays.toString(asignacionVisitas) +
                ", sede=" + sede +
                ", tarifa=" + tarifa +
                '}';
    }
}
