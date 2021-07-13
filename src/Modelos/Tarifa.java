package Modelos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tarifa {
    LocalDate fechaFinVigencia;
    LocalDate fechaInicioVigencia;
    float monto;
    float montoAdicionaGuia;
    TipoDeEntrada tipoDeEntrada = new TipoDeEntrada();
    TipoVisita tipoVisita=new TipoVisita();


    public Tarifa(LocalDate fechaFinVigencia, LocalDate fechaInicioVigencia, float monto, float montoAdicionaGuia, TipoDeEntrada tipoDeEntrada, TipoVisita tipoVisita) {
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.monto = monto;
        this.montoAdicionaGuia = montoAdicionaGuia;
        this.tipoDeEntrada = tipoDeEntrada;
        this.tipoVisita = tipoVisita;
    }

    public Tarifa(LocalDate fechaFinVigencia, LocalDate fechaInicioVigencia, float monto, float montoAdicionaGuia) {
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.monto = monto;
        this.montoAdicionaGuia = montoAdicionaGuia;
    }

    public Tarifa() {
    }

    public TipoDeEntrada getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(TipoDeEntrada tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public TipoVisita getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(TipoVisita tipoVisita) {
        this.tipoVisita = tipoVisita;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public LocalDate getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDate fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMontoAdicionaGuia() {
        return montoAdicionaGuia;
    }

    public void setMontoAdicionaGuia(float montoAdicionaGuia) {
        this.montoAdicionaGuia = montoAdicionaGuia;
    }

    @Override
    public String toString() {
        return "Tarifa{" +
                "fechaFinVigencia=" + fechaFinVigencia +
                ", fechaInicioVigencia=" + fechaInicioVigencia +
                ", monto=" + monto +
                ", montoAdicionaGuia=" + montoAdicionaGuia +
                ", tipoDeEntrada=" + tipoDeEntrada.nombre +
                ", tipoVisita=" + tipoVisita.nombre +
                '}';
    }

/*conocerTipoEntrada(){

    }

    conocerTipoVisita(){

    }*/
}