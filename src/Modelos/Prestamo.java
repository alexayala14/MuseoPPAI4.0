package Modelos;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaDevolucionPrevista;
    private LocalDate fechaprestamo;
    private LocalDate fechaRealDevolucion;
    private int nroConvenio;
    private Obra obra;
    private Artista artista;

    public Prestamo() {
    }

    public Prestamo(LocalDate fechaDevolucionPrevista, LocalDate fechaprestamo, LocalDate fechaRealDevolucion, int nroConvenio, Obra obra, Artista artista) {
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
        this.fechaprestamo = fechaprestamo;
        this.fechaRealDevolucion = fechaRealDevolucion;
        this.nroConvenio = nroConvenio;
        this.obra = obra;
        this.artista = artista;
    }

    public LocalDate getFechaDevolucionPrevista() {
        return fechaDevolucionPrevista;
    }

    public void setFechaDevolucionPrevista(LocalDate fechaDevolucionPrevista) {
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDate getFechaRealDevolucion() {
        return fechaRealDevolucion;
    }

    public void setFechaRealDevolucion(LocalDate fechaRealDevolucion) {
        this.fechaRealDevolucion = fechaRealDevolucion;
    }

    public int getNroConvenio() {
        return nroConvenio;
    }

    public void setNroConvenio(int nroConvenio) {
        this.nroConvenio = nroConvenio;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaDevolucionPrevista=" + fechaDevolucionPrevista +
                ", fechaprestamo=" + fechaprestamo +
                ", fechaRealDevolucion=" + fechaRealDevolucion +
                ", nroConvenio=" + nroConvenio +
                ", obra=" + obra +
                ", artista=" + artista +
                '}';
    }
}
