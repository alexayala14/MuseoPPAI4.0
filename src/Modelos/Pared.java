package Modelos;

public class Pared {
    private String nombre;
    private float alto;
    private float ancho;

    public Pared(String nombre, float alto, float ancho) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Pared{" +
                "nombre='" + nombre + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
