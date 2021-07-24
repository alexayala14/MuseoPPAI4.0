package Modelos;

public class DetalleExposicion1 {
    private String lugarAsignado;
    private Obra obra;
    private Pared pared;
    private float sumaDuracion =0;

    public DetalleExposicion1() {
    }

    public DetalleExposicion1(String lugarAsignado, Obra obra, Pared pared) {
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

    public DetalleExposicion1(String lugarAsignado, Obra obra, Pared pared, float sumaDuracion) {
        this.lugarAsignado = lugarAsignado;
        this.obra = obra;
        this.pared = pared;
        this.sumaDuracion = sumaDuracion;
    }

    @Override
    public String toString() {
        return "DetalleExposicion1{" +
                "lugarAsignado='" + lugarAsignado + '\'' +
                ", obra=" + obra +
                ", pared=" + pared +
                ", sumaDuracion=" + sumaDuracion +
                '}';
    }

    public float sumarDuracionResumida(){
        this.sumaDuracion=this.sumaDuracion+this.obra.getDuracionResumida();
        //System.out.println("\n\nLA SUMA ES EN DETALLE"+sumaDuracion);
        return this.sumaDuracion;

    }
}
