package Modelos;

public class DetalleExpo {
    private String lugarAsignado;
    private Obra obra;
    private Pared pared;

    public DetalleExpo() {
    }

    public DetalleExpo(String lugarAsignado, Obra obra, Pared pared) {
        this.lugarAsignado = lugarAsignado;
        this.obra = obra;
        this.pared = pared;
    }

    public String getLugarAsignado() {
        return lugarAsignado;
    }

    public void setLugarAsignado(String lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Pared getPared() {
        return pared;
    }

    public void setPared(Pared pared) {
        this.pared = pared;
    }

    @Override
    public String toString() {
        return "DetalleExpo{" +
                "lugarAsignado='" + lugarAsignado + '\'' +
                ", obra=" + obra +
                ", pared=" + pared +
                '}';
    }
}
