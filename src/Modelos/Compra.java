package Modelos;

import java.time.LocalDate;

public class Compra {
    private LocalDate fechaCompra;
    private LocalDate fechaPago;
    private float monto;

    public Compra() {
    }

    public Compra(LocalDate fechaCompra, LocalDate fechaPago, float monto) {
        this.fechaCompra = fechaCompra;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "fechaCompra=" + fechaCompra +
                ", fechaPago=" + fechaPago +
                ", monto=" + monto +
                '}';
    }
}
