package Modelos;

import java.util.Arrays;

public class Sede{
    private int cantMaximaVisitantes;
    private int cantMaxPorGuia;
    private String nombre;
    private Tarifa[] tarifas;
    private Exposicion[] exposicions;
    private HorarioSede[] horarioSedes;
    private Planta[] plantas;
    private Empleado[] empleados;
    private Coleccion[] coleccions;
    private Deposito deposito;




    public Sede() {
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposicions, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] coleccions, Deposito deposito) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposicions = exposicions;
        this.horarioSedes = horarioSedes;
        this.plantas = plantas;
        this.empleados = empleados;
        this.coleccions = coleccions;
        this.deposito = deposito;
    }

    public int getCantMaximaVisitantes() {
        return cantMaximaVisitantes;
    }

    public void setCantMaximaVisitantes(int cantMaximaVisitantes) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
    }

    public int getCantMaxPorGuia() {
        return cantMaxPorGuia;
    }

    public void setCantMaxPorGuia(int cantMaxPorGuia) {
        this.cantMaxPorGuia = cantMaxPorGuia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarifa[] getTarifas() {
        return tarifas;
    }

    public void setTarifas(Tarifa[] tarifas) {
        this.tarifas = tarifas;
    }

    public Exposicion[] getExposicions() {
        return exposicions;
    }

    public void setExposicions(Exposicion[] exposicions) {
        this.exposicions = exposicions;
    }

    public HorarioSede[] getHorarioSedes() {
        return horarioSedes;
    }

    public void setHorarioSedes(HorarioSede[] horarioSedes) {
        this.horarioSedes = horarioSedes;
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Coleccion[] getColeccions() {
        return coleccions;
    }

    public void setColeccions(Coleccion[] coleccions) {
        this.coleccions = coleccions;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "cantMaximaVisitantes=" + cantMaximaVisitantes +
                ", cantMaxPorGuia=" + cantMaxPorGuia +
                ", nombre='" + nombre + '\'' +
                ", tarifas=" + Arrays.toString(tarifas) +
                ", exposicions=" + Arrays.toString(exposicions) +
                ", horarioSedes=" + Arrays.toString(horarioSedes) +
                ", plantas=" + Arrays.toString(plantas) +
                ", empleados=" + Arrays.toString(empleados) +
                ", coleccions=" + Arrays.toString(coleccions) +
                ", deposito=" + deposito +
                '}';
    }

    /*conocerColeccion(){

    }
    conocerDeposito(){

    }

    conocerEmpleado(){

    }
    conocerExposicion(){

    }

    conocerHorario(){

    }

    conocerPlanta(){

    }

    conocerTarifa(){

    }*/
}