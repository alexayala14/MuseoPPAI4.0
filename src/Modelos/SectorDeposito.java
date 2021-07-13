package Modelos;

public class SectorDeposito {

    private String nombre;

    public SectorDeposito() {
    }

    public SectorDeposito(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "SectorDeposito{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
