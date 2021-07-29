package Modelos;

public class TablaEntradas {
    private String stringEntrada;
    private String stringVisita;
    private float monto;
    private float montoAdicionalGuia;
    private int cantidadEntradas;
    private float montoTotal;

    public TablaEntradas() {
    }

    public TablaEntradas(String stringEntrada, String stringVisita, float monto, float montoAdicionalGuia, int cantidadEntradas, float montoTotal) {
        this.stringEntrada = stringEntrada;
        this.stringVisita = stringVisita;
        this.monto = monto;
        this.montoAdicionalGuia = montoAdicionalGuia;
        this.cantidadEntradas = cantidadEntradas;
        this.montoTotal = montoTotal;
    }

    public String getStringEntrada() {
        return stringEntrada;
    }

    public void setStringEntrada(String stringEntrada) {
        this.stringEntrada = stringEntrada;
    }

    public String getStringVisita() {
        return stringVisita;
    }

    public void setStringVisita(String stringVisita) {
        this.stringVisita = stringVisita;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMontoAdicionalGuia() {
        return montoAdicionalGuia;
    }

    public void setMontoAdicionalGuia(float montoAdicionalGuia) {
        this.montoAdicionalGuia = montoAdicionalGuia;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public String toString() {
        return "TablaEntradas{" +
                "stringEntrada='" + stringEntrada + '\'' +
                ", stringVisita='" + stringVisita + '\'' +
                ", monto=" + monto +
                ", montoAdicionalGuia=" + montoAdicionalGuia +
                ", cantidadEntradas=" + cantidadEntradas +
                ", montoTotal=" + montoTotal +
                '}';
    }
}
