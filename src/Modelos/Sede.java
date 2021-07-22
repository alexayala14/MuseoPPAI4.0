package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sede{
    private int cantMaximaVisitantes;
    private int cantMaxPorGuia;
    private String nombre;
    public Tarifa[] tarifas;
    private Exposicion[] exposiciones;
    private HorarioSede[] horarioSedes;
    private Planta[] plantas;
    private Empleado[] empleados;
    private Coleccion[] coleccions;
    private Deposito deposito;
    public static Tarifa[] tarifas3;
    public static LocalDate hoy;
    public static int i=0;
    private LocalTime duracion;




    public Sede() {
    }

    public Sede(String nombre) {
        this.nombre = nombre;
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposicions, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] coleccions, Deposito deposito) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposiciones = exposicions;
        this.horarioSedes = horarioSedes;
        this.plantas = plantas;
        this.empleados = empleados;
        this.coleccions = coleccions;
        this.deposito = deposito;
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposicions) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposiciones = exposicions;
    }

    public Sede(int i, int i1, String pepe, Tarifa[] tarifas) {
       // this.exposiciones= falta completar
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
        return exposiciones;
    }

    public void setExposicions(Exposicion[] exposicions) {
        this.exposiciones = exposicions;
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
                ", exposicions=" + Arrays.toString(exposiciones) +
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
*/
    public  Tarifa[] conocerTarifa(){
        System.out.println();
        Tarifa[] tarifas;
        tarifas=Tarifa.conocerTarifa();


        //hoy=LocalDate.now();
        hoy=LocalDate.of(2021,8,21);
        //tarifas3=new Tarifa[tarifas.length];
        List<Tarifa> list=new ArrayList<>();
        for(Tarifa e:tarifas){
            if((hoy.isBefore(e.fechaFinVigencia)||hoy.equals(e.fechaFinVigencia)) && (hoy.isAfter(e.fechaInicioVigencia)||hoy.equals(e.fechaInicioVigencia))){
               // tarifas3[i]=e;
                list.add(e);
                System.out.println("QUE PASO??"+list.toString());
                i++;
            }
            System.out.println("La fecha Fin de Vigencia TODAS TARIFAS EN SEDE: "+e.getFechaFinVigencia()+"\n"+"La Fecha inicio Vigencia es: "+e.getFechaInicioVigencia()+"\n"+"El Monto es: "+e.getMonto()+"\n"+"El Monto Adicional por Guia es: "+e.getMontoAdicionaGuia()+"\n"+"El tipo de entrada es: "+e.getTipoDeEntrada().getNombre()+"\n"+"El tipo de visita es: "+e.getTipoVisita().getNombre()+"\n");
        }
        tarifas3=new Tarifa[list.size()];
        list.toArray(tarifas3);
        System.out.println("EL CONTENIDO DE TARIFAS EN SEDE DESDE TARIFA ES"+tarifas3.length);
       /* for(Tarifa e:tarifas3){

            //System.out.println("La fecha Fin de Vigencia TODAS TARIFAS EN SEDE 3: "+e.getFechaFinVigencia()+"\n"+"La Fecha inicio Vigencia es: "+e.getFechaInicioVigencia()+"\n"+"El Monto es: "+e.getMonto()+"\n"+"El Monto Adicional por Guia es: "+e.getMontoAdicionaGuia()+"\n"+"El tipo de entrada es: "+e.getTipoDeEntrada().getNombre()+"\n"+"El tipo de visita es: "+e.getTipoVisita().getNombre()+"\n");

        }*/

        return tarifas3;
    }
    public Exposicion[] conocerExposision(){

        return this.exposiciones;
    }
    public LocalTime getDuracion(){

        //exposicions= this.exposicions.
        //this.duracion=
        for(Exposicion e:this.conocerExposision()){
            //e.es falta completar
        }
        return this.duracion;

    }
}