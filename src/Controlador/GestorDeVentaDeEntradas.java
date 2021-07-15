package Controlador;

import Modelos.*;
import Vistas.PantallaDeVentaDeEntradas;
import Vistas.PantallaRegistrarVentaDeEntradas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.*;

class GestorDeVentaDeEntradas implements ActionListener {

   public static Date fechaHoy;
    public static Date horaHoy;
    private Tarifa tarifa1;
    private PantallaDeVentaDeEntradas pantallaDeVentaDeEntradas;
    private PantallaRegistrarVentaDeEntradas pantallaRegistrarVentaDeEntradas;

    public GestorDeVentaDeEntradas(PantallaDeVentaDeEntradas pantallaDeVentaDeEntradas,Tarifa tarifa1) {
        this.pantallaDeVentaDeEntradas=pantallaDeVentaDeEntradas;
        this.tarifa1=tarifa1;
        this.pantallaDeVentaDeEntradas.buttonRegistrarVenta.addActionListener(this);
        //this.pantallaDeVentaDeEntradas.comboBoxTarifas.addItemListener;
    }

    /*public void  iniciar(){
        pantallaDeVentaDeEntradas.setLocationRelativeTo(null);
    }*/



    public static void main(String[] args){
        /*PantallaDeVentaDeEntradas pantallaDeVentaDeEntradas = new PantallaDeVentaDeEntradas();
        Tarifa tarifa = new Tarifa();
        GestorDeVentaDeEntradas gestorDeVentaDeEntradas = new GestorDeVentaDeEntradas(pantallaDeVentaDeEntradas,tarifa);*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame=new PantallaRegistrarVentaDeEntradas();
                jFrame.setSize(900,900);
                jFrame.setVisible(true);
            }
        });

        registrarVentaDeEntrada();



       /* Calendar c1 = Calendar.getInstance();
        c1.getTime();

        System.out.println("La hora es: "+ c1.get(Calendar.HOUR)+":"+c1.get(Calendar.MINUTE)+":"+c1.get(Calendar.SECOND));
*/


    }

    public static void registrarVentaDeEntrada(){
       //funciona faltan detalles de base
        buscarTarifas();
        //falta probar
        //tomarSeleccionTarifa(tarifa1);
        calcularDuracionEstimada();
        tomarSeleccionDeEntradas();
        validarCantidadDeEntradas();
        esMenorCantidadMaximaVisitantes();
        calcularMontoTotal();
        tomarConfirmacionDeVenta();
        crearEntrada();
        getId();
        getDate();
        getMonto();
        imprimirEntrada();
        actualizarCantVisitantes();
        finCasoUso();
    }

    public static List<Tarifa> buscarTarifas(){
            //Sede.conocerTarifa.
        ArrayList<Tarifa> listaTarifas= new ArrayList<>();
        /*Sede[] sedes = new Sede[3];
        sedes[0]=new Sede(30,5,"Carrafa");
        sedes[1]=new Sede(40,5,"Virrey Liniers");
        sedes[2]=new Sede(50,5,"Malba");*/

        /*LocalDate localDate1 = LocalDate.of(20,02,8);
        System.out.println("LA FECHA ESSSSSSS"+localDate1);*/
        //TIPOS DE VISITAS
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

        Tarifa[] tarifas=new Tarifa[4];
        tarifas[0]=new Tarifa(LocalDate.of(2021,9,22),LocalDate.of(2021,7,20),50,20,tipoDeEntradas[0],tipoVisitas[0]);
        tarifas[1]=new Tarifa(LocalDate.of(2021,8,22),LocalDate.of(2021,5,20),60,8,tipoDeEntradas[1],tipoVisitas[1]);
        tarifas[2]=new Tarifa(LocalDate.of(2021,3,22),LocalDate.of(2021,3,20),70,10,tipoDeEntradas[2],tipoVisitas[2]);
        tarifas[3]=new Tarifa(LocalDate.of(2021,2,22),LocalDate.of(2021,2,20),80,15,tipoDeEntradas[3],tipoVisitas[3]);

        /*for (int i=0;i<=tarifas.length-1;i++){
            System.out.println("La fecha Fin de Vigencia "+tarifas[i].getFechaFinVigencia()+"\n"+"La Fecha inicio Vigencia es: "+tarifas[i].getFechaInicioVigencia()+"\n"+"El Monto es: "+tarifas[i].getMonto()+"\n"+"El Monto Adicional por Guia es: "+tarifas[i].getMontoAdicionaGuia()+"\n");
        }
*/
        //RECORRE TARIFAS Y MUESTRA POR CONSOLA FALTA QUE ENVIE A INTERFAZ LA INFO
        for(Tarifa e:tarifas){
            System.out.println("La fecha Fin de Vigencia: "+e.getFechaFinVigencia()+"\n"+"La Fecha inicio Vigencia es: "+e.getFechaInicioVigencia()+"\n"+"El Monto es: "+e.getMonto()+"\n"+"El Monto Adicional por Guia es: "+e.getMontoAdicionaGuia()+"\n"+"El tipo de entrada es: "+e.getTipoDeEntrada().getNombre()+"\n"+"El tipo de visita es: "+e.getTipoVisita().getNombre()+"\n");
            listaTarifas.add(e);
        }
        System.out.println("LA LISTA ES: "+listaTarifas.toString());
        return listaTarifas;
    }

   /* public static void tomarSeleccionTarifa(Tarifa tarifa){
        tarifa1=tarifa;

    }*/
    public static void calcularDuracionEstimada(){
        //ArrayList<DetalleExposicion> listaDetalles=new ArrayList<>();
       /* DetalleExposicion[] detalleExposicion=new DetalleExposicion[4];
        detalleExposicion[0]=new DetalleExposicion("Centro");
        detalleExposicion[1]=new DetalleExposicion("Centro");
        detalleExposicion[2]=new DetalleExposicion("Centro");
        detalleExposicion[3]=new DetalleExposicion("Centro");*/

        /*detalleExposicionArrayList.add(detalleExposicions[0]);
        detalleExposicionArrayList.add(detalleExposicions[1]);
        detalleExposicionArrayList.add(detalleExposicions[2]);
        detalleExposicionArrayList.add(detalleExposicions[3]);*/

        /*for(DetalleExposicion e:detalleExposicion){
            listaDetalles.add(e);

        }*/

       /* Exposicion[] exposicions=new Exposicion[4];
        exposicions[0]=new Exposicion(LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22),LocalDate.of(2021,9,22), LocalTime.of(2,15,00),LocalTime.of(02,15,00),"Renacimiento",ArrayList<DetalleExposicion>detalleExposicion[0]);
*/
    }

    public static void tomarSeleccionDeEntradas(){


    }
    public static void validarCantidadDeEntradas(){


    }

    public static void esMenorCantidadMaximaVisitantes(){


    }

    public static void calcularMontoTotal(){


    }

    public static void tomarConfirmacionDeVenta(){


    }

    public static void crearEntrada(){


    }

    public static void getId(){


    }

    public static void getDate(){


    }

    public static void getMonto(){


    }

    public static void imprimirEntrada(){


    }

    public static void actualizarCantVisitantes(){


    }

    public static void finCasoUso(){

        System.out.println("Este es el fin");
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}