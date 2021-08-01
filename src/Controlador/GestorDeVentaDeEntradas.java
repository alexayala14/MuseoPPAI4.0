package Controlador;

import Modelos.*;
import VistasFX.PantallaDeVentaDeEntradas;

import java.time.LocalDate;
import java.time.LocalTime;

public class GestorDeVentaDeEntradas  {

    public LocalDate fechaHoy = LocalDate.now();
    public LocalTime horaHoy = LocalTime.now();
    private Tarifa[] tarifas;
    private Tarifa tarifa;
    /*private PantallaDeVentaDeEntradas pantallaDeVentaDeEntradas;
    private PantallaRegistrarVentaDeEntradas pantallaRegistrarVentaDeEntradas;*/
    private float duracionEstimada;
    private boolean esMenorCantidad=false;
    //private static Tarifa[] tarifas;
//    private Sede sede;
    private Sede[] sedes;
    public Sede sedeActual;
    private ReservaVisita[] reservasVisita;
    private Entrada[] entradasACrear;
    private int cantidadPersonasEnSede;
    private static GestorDeVentaDeEntradas instance;
    private static int cantidadDeEntradas;

    public GestorDeVentaDeEntradas() {
        //"BASE DE DATOS"

        TipoVisita[] tipoVisitas=new TipoVisita[4];
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

        Escuela[] escuelas=new Escuela[2];
        escuelas[0]=new Escuela("AvenidaSiempre Viva","pepe@gmail.com","Pepe","654654654","4564646");
        escuelas[1]=new Escuela("AvenidaSiempre Viva","pepe@gmail.com","Pepe","654654654","4564646");

        AsignacionVisita[] asignacionVisitas=new AsignacionVisita[2];
        asignacionVisitas[0]=new AsignacionVisita(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),empleados[0]);
        asignacionVisitas[1]=new AsignacionVisita(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),empleados[0]);
        HorarioSede[] horarioSede=new HorarioSede[2];
        horarioSede[0]=new HorarioSede(LocalTime.of(2,50,22),LocalTime.of(2,9,22),diaSemanas);
        horarioSede[1]=new HorarioSede(LocalTime.of(5,20,22),LocalTime.of(5,9,22),diaSemanas);
        Subcoleccion[] subcolecciones = new Subcoleccion[2];
        subcolecciones[0] = new Subcoleccion("Descripcion Subcol 1","Nombre subcol 1", obras);
        subcolecciones[1] = new Subcoleccion("Descripcion Subcol 2","Nombre subcol 2", obras);
        Coleccion[] colecciones = new Coleccion[2];
        colecciones[0] = new Coleccion("Coleccion1", LocalDate.of(2021,10,5),LocalDate.of(2021,9,5), "Coleccion Nombre 1", subcolecciones);
        colecciones[1] = new Coleccion("Coleccion2", LocalDate.of(2021,10,5),LocalDate.of(2021,9,5), "Coleccion Nombre 2", subcolecciones);
        Planta[] plantas = new Planta[2];
        plantas[0] = new Planta(1);
        plantas[1] = new Planta(2);
        Deposito deposito = new Deposito("Deposito1",1,sectorDepositos);
        this.sedes = new Sede[4];
        sedes[0]=new Sede(50,50,"PEPE",tarifas, exposiciones, horarioSede, plantas, empleados, colecciones, deposito, tarifas);
        sedes[1]=new Sede(100,51,"PEPE1",tarifas, exposiciones, horarioSede, plantas, empleados, colecciones, deposito, tarifas);
        sedes[2]=new Sede(52,52,"PEPE2",tarifas, exposiciones, horarioSede, plantas, empleados, colecciones, deposito, tarifas);
        sedes[3]=new Sede(53,53,"PEPE3",tarifas, exposiciones, horarioSede, plantas, empleados, colecciones, deposito, tarifas);
        sedeActual = sedes[0];

        this.reservasVisita = new ReservaVisita[8];
        reservasVisita[0]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(2,10),LocalTime.of(17,10),1,exposiciones,sedes[0],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[1]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(19,10),LocalTime.of(17,10),2,exposiciones,sedes[1],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[2]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(2,10),LocalTime.of(17,10),3,exposiciones,sedes[2],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[3]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(2,10),LocalTime.of(17,10),4,exposiciones,sedes[3],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[4]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(22,10),LocalTime.of(18,10),4,exposiciones,sedes[1],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[5]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(17,10),LocalTime.of(10,10),4,exposiciones,sedes[1],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[6]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(2,10),LocalTime.of(17,10),4,exposiciones,sedes[0],escuelas[0],cambioDeEstados,asignacionVisitas);
        reservasVisita[7]=new ReservaVisita(20,40,LocalTime.now(),LocalDate.of(2021,7,20),LocalDate.of(2021,7,20),LocalTime.of(23,10),LocalTime.of(17,10),4,exposiciones,sedes[1],escuelas[0],cambioDeEstados,asignacionVisitas);

        this.entradasACrear = new Entrada[4];
        entradasACrear[0]= new Entrada(LocalDate.now(), LocalTime.now(), 25,10440,asignacionVisitas,this.sedes[1],tarifas[0]);
        entradasACrear[1]= new Entrada(LocalDate.now(), LocalTime.now(), 20,44634,asignacionVisitas,this.sedes[1],tarifas[1]);
        entradasACrear[2]= new Entrada(LocalDate.now(), LocalTime.now(), 30,166400,asignacionVisitas,this.sedes[1],tarifas[2]);
        entradasACrear[3]= new Entrada(LocalDate.now(), LocalTime.now(), 95,10540,asignacionVisitas,this.sedes[1],tarifas[3]);
    }

    public static GestorDeVentaDeEntradas getInstance(){
        if (instance == null) {
            instance = new GestorDeVentaDeEntradas();
        }
        return instance;
    }

    public void registrarVentaDeEntrada(){
        PantallaDeVentaDeEntradas.mostrarTarifas(this.buscarTarifas());
         //this.buscarTarifas();
         //falta probar
//        tomarSeleccionTarifa();
        duracionEstimada= this.calcularDuracionEstimada();
        System.out.println("LA DURACION ESTIMADA EN VARIABLE ES:" + this.duracionEstimada);

//        tomarSeleccionDeEntradas();
        /*validarCantidadDeEntradas(cantidadDeEntradas);*/
        tomarConfirmacionDeVenta(true);
//        getId();
        getDate();
//        getMonto();
//        imprimirEntrada();
        finCasoUso();
    }

    public Tarifa[] buscarTarifas(){
        this.tarifas = this.sedes[0].conocerTarifa();
        for(Tarifa e:this.tarifas){
            System.out.println(
                    "La fecha Fin de Vigencia DE TARIFA 2: "+e.getFechaFinVigencia()+"\n"+
                    "La Fecha inicio Vigencia es: "+e.getFechaInicioVigencia()+"\n"+
                    "El Monto es: "+e.getMonto()+"\n"+
                    "El Monto Adicional por Guia es: "+e.getMontoAdicionaGuia()+"\n"+
                    "El tipo de entrada es: "+e.getTipoDeEntrada().getNombre()+"\n"+
                    "El tipo de visita es: "+e.getTipoVisita().getNombre()+"\n");
        }

        //PantallaDeVentaDeEntradas.mostrarTarifas(this.tarifas);
        System.out.println("LE ESTOY ENVIANDO TARIFAS" + this.tarifas);

        return this.tarifas;
    }

    public static Tarifa tomarSeleccionTarifa(Tarifa tarifa){
        //tarifa = tarifa;
        //System.out.printf("ESTA ES LA TARIFA SELECCIONADA EN GESTOR "+ tarifa.getTipoDeEntrada().getNombre());
        return tarifa;
    }

    public float calcularDuracionEstimada(){
        this.duracionEstimada = this.sedes[0].getDuracion();
        System.out.println("LA DURACION EN GESTOR ESSSS: "+this.duracionEstimada);
        return this.duracionEstimada;
    }

    public static int tomarSeleccionDeEntradas(int cantidadEntradas){

        System.out.println("ESTOY EN SELECCION DEENTRASDA "+ cantidadEntradas);
        cantidadDeEntradas=cantidadEntradas;
        System.out.println("ES VERDADEROOOOOOOOOO: "+getInstance().validarCantidadDeEntradas(cantidadDeEntradas));
        return cantidadDeEntradas;
    }

    public  boolean validarCantidadDeEntradas(int cantidadDeEntradas){
        int alumnosConfirmados = 0;//Poner arriba como atributo
        for(ReservaVisita e:this.reservasVisita){
            if(e.esSedeActual(this.sedes[1]) && e.validaHorario(e.getHoraInicioReal(), e.getHoraFinReal())){
                alumnosConfirmados = e.getCantidadAlumnosConfirmada(); //Poner arriba como atributo
            }
        }
        int cantMaxVisitantes = this.sedes[1].getCantMaximaVisitantes(); //Poner arriba como atributo

        System.out.println("ALUMNOS CONFIRMADOS"+alumnosConfirmados+"  Cantidad Maxima: "+cantMaxVisitantes);
        if(esMenorCantidadMaximaVisitantes(alumnosConfirmados, cantMaxVisitantes, cantidadDeEntradas)){
            //this.calcularMontoTotal(cantidadDeEntradas,tarifa);
            //PantallaDeVentaDeEntradas.detalleDeEntradas();
            return true;
        }else {
            //PantallaDeVentaDeEntradas.detalleDeEntradas();
            return false;
        }
    }

    public boolean esMenorCantidadMaximaVisitantes(int alumnosConfirmados, int cantMaxVisitantes, int cantidadDeEntradas){
        if(alumnosConfirmados + cantidadDeEntradas <= cantMaxVisitantes){
            esMenorCantidad=true;
        }else {
            esMenorCantidad=false;
        }

        return this.esMenorCantidad;
    }

    public float calcularMontoTotal(int cantidadDeEntradas,Tarifa tarifa){
        float montoTotal = 0; //SACAR ATRIBUTO GLOBALMENTE

            System.out.println("Monto tarifa: " + tarifa.getMonto());
            System.out.println("Monto adicional por guia: " + tarifa.getMontoAdicionaGuia());
            montoTotal += (tarifa.getMonto() + tarifa.getMontoAdicionaGuia()) * cantidadDeEntradas;
        System.out.println("EN TOTAL ES EN CALCULAR MONTO TOTAL "+ montoTotal);

        return montoTotal;
    }

    public void tomarConfirmacionDeVenta(boolean confirmacionDeVenta){
        if (confirmacionDeVenta) {
            this.crearEntrada();
        }
    }

    public void crearEntrada(){
        Entrada[] entradas = new Entrada[entradasACrear.length];
        for (int i = 0; i <= entradasACrear.length-1; i++){
            entradas[i] = new Entrada(getDate(), getTime(), entradasACrear[i].getMonto(), entradasACrear[i].getNumero(), entradasACrear[i].getAsignacionVisitas(), this.sedes[1] , entradasACrear[i].getTarifa());
        }
        for (Entrada e: entradas){
            System.out.println("Entrada creada: "+e.getMonto());
        }
        this.actualizarCantVisitantes(entradasACrear.length);
    }

//    public static void getId(){}

    public LocalDate getDate(){
        return LocalDate.now();
    }

    public LocalTime getTime(){
        return LocalTime.now();
    }

//    public static void getMonto(){}

//    public void imprimirEntrada(){}

    public void actualizarCantVisitantes(int cantidadDeEntradas){
        this.cantidadPersonasEnSede += cantidadDeEntradas;
    }

    public void finCasoUso(){
        System.out.println("Este es el fin del caso de uso");
    }

 /*   @Override
    public void actionPerformed(ActionEvent e) {

    }*/

}