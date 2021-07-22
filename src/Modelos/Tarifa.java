package Modelos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tarifa {
    LocalDate fechaFinVigencia;
    LocalDate fechaInicioVigencia;
    float monto;
    float montoAdicionaGuia;
    TipoDeEntrada tipoDeEntrada; /*= new TipoDeEntrada();*/
    TipoVisita tipoVisita; /*=new TipoVisita();*/
    Tarifa[] tarifas;


    public Tarifa(LocalDate fechaFinVigencia, LocalDate fechaInicioVigencia, float monto, float montoAdicionaGuia, TipoDeEntrada tipoDeEntrada, TipoVisita tipoVisita) {
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.monto = monto;
        this.montoAdicionaGuia = montoAdicionaGuia;
        this.tipoDeEntrada = tipoDeEntrada;
        this.tipoVisita = tipoVisita;
    }

    public Tarifa(LocalDate fechaFinVigencia, LocalDate fechaInicioVigencia, float monto, float montoAdicionaGuia, TipoDeEntrada tipoDeEntrada, TipoVisita tipoVisita, Tarifa[] tarifas) {
        this.fechaFinVigencia = fechaFinVigencia;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.monto = monto;
        this.montoAdicionaGuia = montoAdicionaGuia;
        this.tipoDeEntrada = tipoDeEntrada;
        this.tipoVisita = tipoVisita;
        this.tarifas = tarifas;
    }

    public Tarifa[] getTarifas() {
        return tarifas;
    }

    public void setTarifas(Tarifa[] tarifas) {
        this.tarifas = tarifas;
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

    public static Tarifa[] conocerTarifa(){
        //TIPOS DE VISITAS
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
        //System.out.println("ESTAMOS EN TARIFA"+tarifas.toString());
        return tarifas;
    }
}