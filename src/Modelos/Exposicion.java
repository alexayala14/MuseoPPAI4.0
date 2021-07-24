package Modelos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Exposicion {
    private LocalDate fechaFin;
    private LocalDate FinReplanificada;
    private LocalDate fechaInicio;
    private LocalDate fechaInicioReplanificada;
    private LocalDate horaApertura;
    private LocalDate horaCierra;
    private String nombre;
    private TipoExposicion tipoExposicion;
    private DetalleExposicion1[] detalleExposicions;
    private PublicoDestino[] publicoDestinos;
    private Empleado[] empleados;
    private boolean esVigente=false;
    public static LocalDate hoy;

    public Exposicion() {
    }

    public Exposicion(LocalDate fechaFin, LocalDate finReplanificada, LocalDate fechaInicio, LocalDate fechaInicioReplanificada, LocalDate horaApertura, LocalDate horaCierra, String nombre, TipoExposicion tipoExposicion, DetalleExposicion1[] detalleExposicions, PublicoDestino[] publicoDestinos, Empleado[] empleados) {
        this.fechaFin = fechaFin;
        FinReplanificada = finReplanificada;
        this.fechaInicio = fechaInicio;
        this.fechaInicioReplanificada = fechaInicioReplanificada;
        this.horaApertura = horaApertura;
        this.horaCierra = horaCierra;
        this.nombre = nombre;
        this.tipoExposicion = tipoExposicion;
        this.detalleExposicions = detalleExposicions;
        this.publicoDestinos = publicoDestinos;
        this.empleados = empleados;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFinReplanificada() {
        return FinReplanificada;
    }

    public void setFinReplanificada(LocalDate finReplanificada) {
        FinReplanificada = finReplanificada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaInicioReplanificada() {
        return fechaInicioReplanificada;
    }

    public void setFechaInicioReplanificada(LocalDate fechaInicioReplanificada) {
        this.fechaInicioReplanificada = fechaInicioReplanificada;
    }

    public LocalDate getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalDate horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalDate getHoraCierra() {
        return horaCierra;
    }

    public void setHoraCierra(LocalDate horaCierra) {
        this.horaCierra = horaCierra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoExposicion getTipoExposicion() {
        return tipoExposicion;
    }

    public void setTipoExposicion(TipoExposicion tipoExposicion) {
        this.tipoExposicion = tipoExposicion;
    }

    public DetalleExposicion1[] getDetalleExposicions() {
        return detalleExposicions;
    }

    public void setDetalleExposicions(DetalleExposicion1[] detalleExposicions) {
        this.detalleExposicions = detalleExposicions;
    }

    public PublicoDestino[] getPublicoDestinos() {
        return publicoDestinos;
    }

    public void setPublicoDestinos(PublicoDestino[] publicoDestinos) {
        this.publicoDestinos = publicoDestinos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Exposicion{" +
                "fechaFin=" + fechaFin +
                ", FinReplanificada=" + FinReplanificada +
                ", fechaInicio=" + fechaInicio +
                ", fechaInicioReplanificada=" + fechaInicioReplanificada +
                ", horaApertura=" + horaApertura +
                ", horaCierra=" + horaCierra +
                ", nombre='" + nombre + '\'' +
                ", tipoExposicion=" + tipoExposicion +
                ", detalleExposicions=" + Arrays.toString(detalleExposicions) +
                ", publicoDestinos=" + Arrays.toString(publicoDestinos) +
                ", empleados=" + Arrays.toString(empleados) +
                '}';
    }

    public static Exposicion[] conocerExposisiones(){
        TipoExposicion[] tipoExposicion = new TipoExposicion[4];
        tipoExposicion[0]= new TipoExposicion("Primer Tipo","Nombre1");
        tipoExposicion[1]= new TipoExposicion("Segundo Tipo","Nombre2");
        tipoExposicion[2]= new TipoExposicion("Tercer Tipo","Nombre3");
        tipoExposicion[3]= new TipoExposicion("Cuarto Tipo","Nombre4");
        Cargo[] cargos=new Cargo[2];
        cargos[0]=new Cargo("Responsable de Obra","Responsable");
        cargos[1]=new Cargo("Responsable de Obra","Responsable");
        DiaSemana[] diaSemanas=new DiaSemana[7];
        diaSemanas[0]=new DiaSemana("Lunes");
        diaSemanas[1]=new DiaSemana("Martes");
        diaSemanas[2]=new DiaSemana("Miercoles");
        diaSemanas[3]=new DiaSemana("Jueves");
        diaSemanas[4]=new DiaSemana("Viernes");
        diaSemanas[5]=new DiaSemana("Sabado");
        diaSemanas[6]=new DiaSemana("Domingo");
        HorarioEmpleado[] horarioEmpleados=new HorarioEmpleado[2];
        horarioEmpleados[0]=new HorarioEmpleado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),diaSemanas);
        horarioEmpleados[1]=new HorarioEmpleado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),diaSemanas);
        Empleado[] empleados=new Empleado[2];
        empleados[0]=new Empleado("sanchez","25","20202020","32333652","Ubicacion 14",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe@gmail.com","Pepe","Masculino","25121151",cargos[0],horarioEmpleados[0]);
        empleados[1]=new Empleado("sanchez","25","20202020","32333652","Ubicacion 14",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe@gmail.com","Pepe","Masculino","25121151",cargos[0],horarioEmpleados[0]);
        Tecnica[] tecnicas=new Tecnica[2];
        tecnicas[0]=new Tecnica("Claro Oscuro","Oleo");
        tecnicas[1]=new Tecnica("Claro Oscuro","Oleo");
        Tematica[] tematicas=new Tematica[2];
        tematicas[0]=new Tematica("Claro Oscuro");
        tematicas[1]=new Tematica("Claro Oscuro");
        Estilo[] estilos=new Estilo[2];
        estilos[0]=new Estilo("Claro Oscuro","dos");
        estilos[1]=new Estilo("Claro Oscuro","uno");
        TipoIngreso[] tipoIngresos=new TipoIngreso[2];
        tipoIngresos[0]=new TipoIngreso("descrip","uno");
        tipoIngresos[1]=new TipoIngreso("descrip","dos");
        SectorDeposito[]sectorDepositos = new SectorDeposito[2];
        sectorDepositos[0]=new SectorDeposito("uno");
        sectorDepositos[1]=new SectorDeposito("dos");
        Compra[] compras = new Compra[2];
        compras[0]=new Compra(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000);
        compras[1]=new Compra(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000);
        Artista[] artistas = new Artista[2];
        artistas[0]=new Artista("uno","Leonardo","Da vinci","Leo","Masculino","23235");
        artistas[1]=new Artista("uno","Leonardo","Da vinci","Leo","Masculino","23235");
        Especialidad[] especialidades = new Especialidad[2];
        especialidades[0]=new Especialidad("Descripcion uno","Uno",estilos[0],tecnicas[0]);
        especialidades[1]=new Especialidad("Descripcion uno","Uno",estilos[0],tecnicas[0]);

        Restaurador[] restauradores=new Restaurador[2];
        restauradores[0]=new Restaurador("Argento","pepe","Avenida Siempre Viva","sdadasd@gmail.com","315646465",especialidades);
        restauradores[1]=new Restaurador("Argento","pepe","Avenida Siempre Viva","sdadasd@gmail.com","315646465",especialidades);
        TipoRestauracion[] tipoRestauraciones=new TipoRestauracion[2];
        tipoRestauraciones[0]=new TipoRestauracion("Descripcion uno","uno");
        tipoRestauraciones[1]=new TipoRestauracion("Descripcion uno","uno");

        Restauracion[] restauraciones = new Restauracion[2];
        restauraciones[0]=new Restauracion("Descripcion uno",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000,restauradores[0],tipoRestauraciones[0]);
        restauraciones[1]=new Restauracion("Descripcion uno",LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),3000,restauradores[0],tipoRestauraciones[0]);

        Archivo[] archivos=new Archivo[2];
        archivos[0]=new Archivo("Uno","ubicacion uno");
        archivos[1]=new Archivo("Uno","ubicacion uno");
        Donador[] donadores=new Donador[2];
        donadores[0]=new Donador("Jose");
        donadores[1]=new Donador("Jose");


        Donacion[] donaciones=new Donacion[2];
        donaciones[0]=new Donacion(LocalDate.of(2021,9,22),donadores[0]);
        donaciones[1]=new Donacion(LocalDate.of(2021,9,22),donadores[0]);
        Estado[] estados = new Estado[2];
        estados[0]=new Estado("Obra","En Restauracion","En Restauracion");
        estados[1]=new Estado("Obra","En Restauracion","En Restauracion");

        CambioDeEstado[] cambioDeEstados = new CambioDeEstado[2];
        cambioDeEstados[0]=new CambioDeEstado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),estados[0]);
        cambioDeEstados[1]=new CambioDeEstado(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),estados[0]);

        Museo[] museos=new Museo[2];
        museos[0]=new Museo("Avenida Siemrpe Viva","Uno","5654646");
        museos[1]=new Museo("Avenida Siemrpe Viva","Uno","5654646");

        PrestamoAMuseo[] prestamoAMuseos = new PrestamoAMuseo[2];
        prestamoAMuseos[0]=new PrestamoAMuseo(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe", LocalTime.now(),museos[0]);
        prestamoAMuseos[1]=new PrestamoAMuseo(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"pepe", LocalTime.now(),museos[0]);

        Obra[] obras=new Obra[4];
        obras[0]=new Obra(20,20,5,"hola mundo",30,20,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
        obras[1]=new Obra(20,20,5,"hola mundo",30,30,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
        obras[2]=new Obra(20,20,5,"hola mundo",30,40,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);
        obras[3]=new Obra(20,20,5,"hola mundo",30,50,LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"Obra1",15,3000,empleados[0],tecnicas[1],estilos[0],tematicas[0],tipoIngresos[0],sectorDepositos[0],artistas[0],compras,restauraciones,archivos,cambioDeEstados,donaciones,prestamoAMuseos);

        Pared[] paredes=new Pared[2];
        paredes[0]=new Pared("Uno",20,20);
        paredes[1]=new Pared("Uno",20,20);

        DetalleExposicion1[] detalleExposiciones = new DetalleExposicion1[4];
        detalleExposiciones[0]=new DetalleExposicion1("lugar1",obras[0],paredes[0]);
        detalleExposiciones[1]=new DetalleExposicion1("lugar1",obras[1],paredes[1]);
        detalleExposiciones[2]=new DetalleExposicion1("lugar1",obras[2],paredes[0]);
        detalleExposiciones[3]=new DetalleExposicion1("lugar1",obras[3],paredes[1]);

        PublicoDestino[] publicoDestinos=new PublicoDestino[2];
        publicoDestinos[0]=new PublicoDestino("Caracteristica uno"," uno");
        publicoDestinos[1]=new PublicoDestino("Caracteristica uno"," uno");

        Exposicion[] exposiciones=new Exposicion[4];
        exposiciones[0]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,5,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 1",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
        exposiciones[1]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,4,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 2",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
        exposiciones[2]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,4,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 3",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);
        exposiciones[3]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),"La numero 4",tipoExposicion[2],detalleExposiciones,publicoDestinos,empleados);

        return  exposiciones;
    }

    public Boolean esVigente(LocalDate fechaInicio,LocalDate fechaFin){
        hoy=LocalDate.of(2021,7,23);
       // System.out.println("ES HOY EN VIGENTE"+hoy);
        //System.out.println("lOS LOCATE DEN VIGENTE: "+fechaFin+"FECHA INICIO "+fechaInicio);
        if((hoy.isBefore(this.fechaFin)||hoy.equals(fechaFin)) && (hoy.isAfter(this.fechaInicio)||hoy.equals(fechaInicio))){
            this.esVigente=true;
           // System.out.printf("ESTOY EN VIGENTE"+this.esVigente);
        }else {
            this.esVigente=false;
            //System.out.printf("ESTOY EN NO VIGENTE"+this.esVigente);

        }
     return this.esVigente;
    }

    public float getDuracion(){
        float duracion=0;
        for(DetalleExposicion1 e:this.detalleExposicions) {
            duracion = duracion + e.sumarDuracionResumida();
            //System.out.printf("ES EXPOSICION DURACION "+duracion);
        }
        return duracion;
    }
}
