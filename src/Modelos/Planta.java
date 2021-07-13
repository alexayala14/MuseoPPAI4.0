package Modelos;

public class Planta{
    int numero;
    private Sala[] salas;
    private Archivo[] archivo;

    public Planta() {
    }

    public Planta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Planta{" +
                "numero=" + numero +
                '}';
    }

    /*conocerArchivo(){

    }
    conocerSala(){

    }*/
}