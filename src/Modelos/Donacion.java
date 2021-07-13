package Modelos;

import java.time.LocalDate;

public class Donacion {
    private LocalDate fechaDonacion;
    private Donador donador;

    public Donacion(LocalDate fechaDonacion, Donador donador) {
        this.fechaDonacion = fechaDonacion;
        this.donador = donador;
    }

    public Donacion() {
    }

    public LocalDate getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(LocalDate fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public Donador getDonador() {
        return donador;
    }

    public void setDonador(Donador donador) {
        this.donador = donador;
    }

    @Override
    public String toString() {
        return "Donacion{" +
                "fechaDonacion=" + fechaDonacion +
                ", donador=" + donador +
                '}';
    }

    //conocerDonador();
}
