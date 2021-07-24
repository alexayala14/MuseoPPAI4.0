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
    private float duracion;

    public Sede() {
    }

//    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposicions, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] coleccions, Deposito deposito) {
//        this.cantMaximaVisitantes = cantMaximaVisitantes;
//        this.cantMaxPorGuia = cantMaxPorGuia;
//        this.nombre = nombre;
//        this.tarifas = tarifas;
//        this.exposiciones = exposicions;
//        this.horarioSedes = horarioSedes;
//        this.plantas = plantas;
//        this.empleados = empleados;
//        this.coleccions = coleccions;
//        this.deposito = deposito;
//    }

//    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposicions) {
//        this.cantMaximaVisitantes = cantMaximaVisitantes;
//        this.cantMaxPorGuia = cantMaxPorGuia;
//        this.nombre = nombre;
//        this.tarifas = tarifas;
//        this.exposiciones = exposicions;
//    }

    public Sede(int cantMaxVis, int cantMaxPorGuia, String pepe, Tarifa[] tarifas) {
       // this.exposiciones= falta completar
        /*TipoVisita[] tipoVisitas=new TipoVisita[4];
        tipoVisitas[0]=new TipoVisita("Exposicion");
        tipoVisitas[1]=new TipoVisita("Exposicion con guia");
        tipoVisitas[2]=new TipoVisita("Completa");
        tipoVisitas[3]=new TipoVisita("Completa con guia");

        //TIPOS DE ENTRADAS
        TipoDeEntrada[] tipoDeEntradas=new TipoDeEntrada[4];
        tipoDeEntradas[0]=new TipoDeEntrada("General");
        tipoDeEntradas[1]=new TipoDeEntrada("Adulto");
        tipoDeEntradas[2]=new TipoDeEntrada("Menores");
        tipoDeEntradas[3]=new TipoDeEntrada("Organizacion");

        //TARIFAS

        this.tarifas=new Tarifa[4];
        tarifas[0]=new Tarifa(LocalDate.of(2021,9,22),LocalDate.of(2021,7,20),50,20,tipoDeEntradas[0],tipoVisitas[0]);
        tarifas[1]=new Tarifa(LocalDate.of(2021,8,22),LocalDate.of(2021,5,20),60,8,tipoDeEntradas[1],tipoVisitas[1]);
        tarifas[2]=new Tarifa(LocalDate.of(2021,3,22),LocalDate.of(2021,3,20),70,10,tipoDeEntradas[2],tipoVisitas[2]);
        tarifas[3]=new Tarifa(LocalDate.of(2021,2,22),LocalDate.of(2021,2,20),80,15,tipoDeEntradas[3],tipoVisitas[3]);

        Sede sede = new Sede(50,50,"PEPE",tarifas);
        Sede[] sedes = new Sede[4];
        sedes[0]=new Sede(50,50,"PEPE",tarifas);
        sedes[1]=new Sede(50,50,"Jose",tarifas);
        sedes[2]=new Sede(50,50,"Alberto",tarifas);
        sedes[3]=new Sede(50,50,"Dario",tarifas);*/
    }

    public Sede(int cantMaximaVisitantes, int cantMaxPorGuia, String nombre, Tarifa[] tarifas, Exposicion[] exposiciones, HorarioSede[] horarioSedes, Planta[] plantas, Empleado[] empleados, Coleccion[] colecciones, Deposito deposito, Tarifa[] tarifas1) {
        this.cantMaximaVisitantes = cantMaximaVisitantes;
        this.cantMaxPorGuia = cantMaxPorGuia;
        this.nombre = nombre;
        this.tarifas = tarifas;
        this.exposiciones = exposiciones;
        this.horarioSedes = horarioSedes;
        this.plantas = plantas;
        this.empleados = empleados;
        this.coleccions = colecciones;
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
       // System.out.println("EL CONTENIDO DE TARIFAS EN SEDE DESDE TARIFA ES"+tarifas3.length);
       /* for(Tarifa e:tarifas3){

            //System.out.println("La fecha Fin de Vigencia TODAS TARIFAS EN SEDE 3: "+e.getFechaFinVigencia()+"\n"+"La Fecha inicio Vigencia es: "+e.getFechaInicioVigencia()+"\n"+"El Monto es: "+e.getMonto()+"\n"+"El Monto Adicional por Guia es: "+e.getMontoAdicionaGuia()+"\n"+"El tipo de entrada es: "+e.getTipoDeEntrada().getNombre()+"\n"+"El tipo de visita es: "+e.getTipoVisita().getNombre()+"\n");

        }*/

        return tarifas3;
    }
    //MODIFICARRRRRRRRR S
    public Exposicion[] conocerExposision(){
        exposiciones=Exposicion.conocerExposisiones();
        return this.exposiciones;
    }
    public float getDuracion(){

        //exposicions= this.exposicions.
        //this.duracion=
        List<Exposicion> list=new ArrayList<>();
        //DetalleExposicion1[] detalleExposicion1s=new DetalleExposicion1[8];
        for(Exposicion e: this.conocerExposision()){
            //e.es falta completar
            //System.out.println("ENTRA POR ACA LAS EXPOSICIONES"+e.getNombre());
            //float duracion;
            if(e.esVigente(e.getFechaInicio(),e.getFechaFin())) {
                list.add(e);
                duracion= e.getDuracion();
               // System.out.printf("DURACIONNNNN"+duracion);
               // System.out.println("ES VIGENTE "+e.getNombre());
            }
        }
       // System.out.println("LA CANTIDAD LISTA DURACION ESSSSS"+list.size());

        return duracion;

    }


}