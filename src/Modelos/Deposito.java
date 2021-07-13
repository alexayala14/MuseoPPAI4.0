package Modelos;

import java.util.Arrays;

public class Deposito {
    private String denominacion;
    private int numero;
    private SectorDeposito[] sectorDepositos;

    public Deposito() {
    }

    public Deposito(String denominacion, int numero, SectorDeposito[] sectorDepositos) {
        this.denominacion = denominacion;
        this.numero = numero;
        this.sectorDepositos = sectorDepositos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "denominacion='" + denominacion + '\'' +
                ", numero=" + numero +
                ", sectorDepositos=" + Arrays.toString(sectorDepositos) +
                '}';
    }

    //conocerSectorDeposito();
}
