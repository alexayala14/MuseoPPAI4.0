package Modelos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Obra{
   private float alto;
    private float ancho;
    private int codigoSensor;
    private String descripcion;
    private float duracionExtendida;
    private float duracionResumida;
    private LocalDate fechaCreacion;
    private LocalDate fechaPrimerIngreso;
    private String nombreObra;
    private float peso;
    private float valuacion;
    private Empleado empleado;
    private Tecnica tecnica;
    private Estilo estilo;
    private Tematica tematica;
    private TipoIngreso tipoIngreso;
    private SectorDeposito sectorDeposito;
    private  Artista artista;
    private Compra[] compra;
    private Restauracion[] restauracions;
    private Archivo[] archivos;
    private CambioDeEstado[] cambioDeEstados;
    private Donacion[] donacions;
    private PrestamoAMuseo[] prestamoAMuseos;




    public Obra() {
    }

    public Obra(float alto, float ancho, int codigoSensor, String descripcion, float duracionExtendida, float duracionResumida, LocalDate fechaCreacion, LocalDate fechaPrimerIngreso, String nombreObra, float peso, float valuacion, Empleado empleado, Tecnica tecnica, Estilo estilo, Tematica tematica, TipoIngreso tipoIngreso, SectorDeposito sectorDeposito, Artista artista, Compra[] compra, Restauracion[] restauracions, Archivo[] archivos, CambioDeEstado[] cambioDeEstados, Donacion[] donacions, PrestamoAMuseo[] prestamoAMuseos) {
        this.alto = alto;
        this.ancho = ancho;
        this.codigoSensor = codigoSensor;
        this.descripcion = descripcion;
        this.duracionExtendida = duracionExtendida;
        this.duracionResumida = duracionResumida;
        this.fechaCreacion = fechaCreacion;
        this.fechaPrimerIngreso = fechaPrimerIngreso;
        this.nombreObra = nombreObra;
        this.peso = peso;
        this.valuacion = valuacion;
        this.empleado = empleado;
        this.tecnica = tecnica;
        this.estilo = estilo;
        this.tematica = tematica;
        this.tipoIngreso = tipoIngreso;
        this.sectorDeposito = sectorDeposito;
        this.artista = artista;
        this.compra = compra;
        this.restauracions = restauracions;
        this.archivos = archivos;
        this.cambioDeEstados = cambioDeEstados;
        this.donacions = donacions;
        this.prestamoAMuseos = prestamoAMuseos;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public int getCodigoSensor() {
        return codigoSensor;
    }

    public void setCodigoSensor(int codigoSensor) {
        this.codigoSensor = codigoSensor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getDuracionExtendida() {
        return duracionExtendida;
    }

    public void setDuracionExtendida(float duracionExtendida) {
        this.duracionExtendida = duracionExtendida;
    }

    public float getDuracionResumida() {
        return duracionResumida;
    }

    public void setDuracionResumida(float duracionResumida) {
        this.duracionResumida = duracionResumida;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaPrimerIngreso() {
        return fechaPrimerIngreso;
    }

    public void setFechaPrimerIngreso(LocalDate fechaPrimerIngreso) {
        this.fechaPrimerIngreso = fechaPrimerIngreso;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getValuacion() {
        return valuacion;
    }

    public void setValuacion(float valuacion) {
        this.valuacion = valuacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public TipoIngreso getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(TipoIngreso tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

    public SectorDeposito getSectorDeposito() {
        return sectorDeposito;
    }

    public void setSectorDeposito(SectorDeposito sectorDeposito) {
        this.sectorDeposito = sectorDeposito;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Compra[] getCompra() {
        return compra;
    }

    public void setCompra(Compra[] compra) {
        this.compra = compra;
    }

    public Restauracion[] getRestauracions() {
        return restauracions;
    }

    public void setRestauracions(Restauracion[] restauracions) {
        this.restauracions = restauracions;
    }

    public Archivo[] getArchivos() {
        return archivos;
    }

    public void setArchivos(Archivo[] archivos) {
        this.archivos = archivos;
    }

    public CambioDeEstado[] getCambioDeEstados() {
        return cambioDeEstados;
    }

    public void setCambioDeEstados(CambioDeEstado[] cambioDeEstados) {
        this.cambioDeEstados = cambioDeEstados;
    }

    public Donacion[] getDonacions() {
        return donacions;
    }

    public void setDonacions(Donacion[] donacions) {
        this.donacions = donacions;
    }

    public PrestamoAMuseo[] getPrestamoAMuseos() {
        return prestamoAMuseos;
    }

    public void setPrestamoAMuseos(PrestamoAMuseo[] prestamoAMuseos) {
        this.prestamoAMuseos = prestamoAMuseos;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", codigoSensor=" + codigoSensor +
                ", descripcion='" + descripcion + '\'' +
                ", duracionExtendida=" + duracionExtendida +
                ", duracionResumida=" + duracionResumida +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaPrimerIngreso=" + fechaPrimerIngreso +
                ", nombreObra='" + nombreObra + '\'' +
                ", peso=" + peso +
                ", valuacion=" + valuacion +
                ", empleado=" + empleado +
                ", tecnica=" + tecnica +
                ", estilo=" + estilo +
                ", tematica=" + tematica +
                ", tipoIngreso=" + tipoIngreso +
                ", sectorDeposito=" + sectorDeposito +
                ", artista=" + artista +
                ", compra=" + Arrays.toString(compra) +
                ", restauracions=" + Arrays.toString(restauracions) +
                ", archivos=" + Arrays.toString(archivos) +
                ", cambioDeEstados=" + Arrays.toString(cambioDeEstados) +
                ", donacions=" + Arrays.toString(donacions) +
                ", prestamoAMuseos=" + Arrays.toString(prestamoAMuseos) +
                '}';
    }

    /* conocerArtista(){}
    concerCambioEstado(){}
    conocerCompra(){}
    conocerDonacion(){}
    conocerEmpleado(){}
    conocerEstilo(){}
    conocerPrestamo(){}
    conocerPrestamoAMuseo(){}
    conocerRestauracion(){}
    conocerSectorAsignado(){}
    conocerTecnica(){}
    conocerTematica(){}
    conocerTipoIngreso(){}
    crearCambioEstado(){}*/
}