package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.TablaEntradas;
import Modelos.Tarifa;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class PantallaDeVentaDeEntradas implements Initializable {
    public Button ingresar;
    private static Scene scene;
    private static Stage stage;
    private static Parent root;
    private static ComboBox<Tarifa> tipoEntradaTipoVisita;
    private static TextField montoCampo;
    private static TextField montoAdicionalGuiaCampo;
    private static Spinner<Integer> cantidadDeEntradas;
    private static Button agregarEntradasButton;
    private static int supuestaCantidadMaxSede;

//    @FXML
//    private TableView<String> tablaEntradas = new TableView<String>(){};
//    @FXML
//    private TableColumn<String, String> tipoEntradaCol = new TableColumn<String, String>();
    @FXML
    private TableColumn<TablaEntradas, String> tipoVisitaCol = new TableColumn<TablaEntradas, String>();
    @FXML
    private TableColumn<Tarifa, Integer> montoCol = new TableColumn<Tarifa, Integer>();
    @FXML
    private TableColumn<Tarifa, Integer> montoAdicionalGuiaCol = new TableColumn<Tarifa, Integer>();
    @FXML
    private TableColumn<Integer, Integer> cantidadEntradasCol = new TableColumn<Integer, Integer>();
    @FXML
    private TableColumn<Integer, Integer> montoTotalCol = new TableColumn<Integer, Integer>();

    private static int indiceSeleccionado;
    private static int cantidadDeEntradasSeleccionadas;
    private static Tarifa tarifaSeleccionada = new Tarifa();

    private static float montoEntrada;
    private  int numeroEntrada;
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas;
    private Tarifa[] tarifas;

    //EJEMPLOS
    @FXML
    private TableView<TablaEntradas> tablaEntradas = new TableView<TablaEntradas>();

    @FXML
    private TableColumn<TablaEntradas, String> tipoEntradaCol = new TableColumn<TablaEntradas, String>();

    ObservableList<TablaEntradas> listaTE = FXCollections.observableArrayList();

    TablaEntradas tablaDeEntradas;

    /*@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PantallaLogin.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Museo Pictórico");

        Image icon = new Image("/Imagenes/icon.png");
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }*/

   /* public static void main(String[] args){
        gestorDeVentaDeEntradas = GestorDeVentaDeEntradas.getInstance();
        //launch(args);
    }*/

  /*  public void switchToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/

    /*public void switchToFirstScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaInicio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }*/

    public void habilitarVentana(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaRegistrarVentaDeEntradas.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        supuestaCantidadMaxSede = 1000;
        GestorDeVentaDeEntradas gestorDeVentaDeEntradas = GestorDeVentaDeEntradas.getInstance();
        gestorDeVentaDeEntradas.registrarVentaDeEntrada();
        //agregarEntradasButton = (Button)scene.lookup("#agregarEntradaButton");
        //tomarSeleccionDeEntradas();
        /*Tarifa[] tarifas = gestorDeVentaDeEntradas.buscarTarifas();
        ArrayList<String> tiposDeEntradasYVisitas = new ArrayList<>();
        ArrayList<Float> montos = new ArrayList<>();
        ArrayList<Float> montosPorGuia = new ArrayList<>();

        for (Tarifa t: tarifas){
            System.out.println("Tarifa en pantalla: "+ t.toString());
            tiposDeEntradasYVisitas.add("Tipo de Entrada: " + t.getTipoDeEntrada().getNombre() + " | Tipo de Visita: " + t.getTipoVisita().getNombre());
            montos.add(t.getMonto());
            montosPorGuia.add(t.getMontoAdicionaGuia());
        }*/

        /*agregarEntradasButton = (Button)scene.lookup("#agregarEntradaButton");*/

        /*tipoEntradaTipoVisita = (ComboBox)scene.lookup("#tiposEntradaVisitaCombo");
        tipoEntradaTipoVisita.getItems().addAll(tarifas);

        montoCampo = (TextField) scene.lookup("#montoTextField");
        montoAdicionalGuiaCampo = (TextField) scene.lookup("#montoAdicionalPorGuiaTextField");*/

        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas);
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, supuestaCantidadMaxSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();
        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas.getValue());

       /* ChangeListener listenerTarifa = ((observable, oldValue, newValue) -> {
            indiceSeleccionado =  tipoEntradaTipoVisita.getItems().indexOf(newValue);
            montoCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMonto()));
            montoAdicionalGuiaCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMontoAdicionaGuia()));
            montoEntrada = tarifas[indiceSeleccionado].getMonto() + tarifas[indiceSeleccionado].getMontoAdicionaGuia();
            tarifaSeleccionada = tarifas[indiceSeleccionado];
        });*/

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            cantidadDeEntradasSeleccionadas = (int) newValue;
            if (cantidadDeEntradasSeleccionadas == supuestaCantidadMaxSede){
                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
            }
            System.out.println("LA CANTIDAD DE ENTRADAS SELECCIONAS EN PANTALLA "+cantidadDeEntradasSeleccionadas);
            gestorDeVentaDeEntradas.tomarSeleccionDeEntradas(cantidadDeEntradasSeleccionadas);
        });

        //tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);
       cantidadDeEntradas.valueProperty().addListener(listenerSpinner);

        Random rand = new Random();
        numeroEntrada = rand.nextInt(10000);

//        agregarEntradasButton.setOnMouseClicked((evento) -> {
//            try {
//                agregarEntrada(this.tarifaSeleccionada);
//            } catch (IOException e) {
//                System.out.println("ERROR: ");
//                e.printStackTrace();
//            }
//        });

//        listaEntradas.add(new Entrada(LocalDate.now(), LocalTime.now(), montoEntrada, numeroEntrada, gestorDeVentaDeEntradas.sedeActual, tarifaSeleccionada));

        stage.show();
    }

    public static void mostrarTarifas(Tarifa[] tarifas){
        System.out.println("LLEGARON LAS TARIFAS"+tarifas);
        //tarifas = tarifas;
        ArrayList<String> tiposDeEntradasYVisitas = new ArrayList<>();
        ArrayList<Float> montos = new ArrayList<>();
        ArrayList<Float> montosPorGuia = new ArrayList<>();

        for (Tarifa t: tarifas){
            System.out.println("Tarifa en pantalla: "+ t.toString());
            tiposDeEntradasYVisitas.add("Tipo de Entrada: " + t.getTipoDeEntrada().getNombre() + " | Tipo de Visita: " + t.getTipoVisita().getNombre());
            montos.add(t.getMonto());
            montosPorGuia.add(t.getMontoAdicionaGuia());
        }

        tipoEntradaTipoVisita = (ComboBox)scene.lookup("#tiposEntradaVisitaCombo");
        tipoEntradaTipoVisita.getItems().addAll(tarifas);

        montoCampo = (TextField) scene.lookup("#montoTextField");
        montoAdicionalGuiaCampo = (TextField) scene.lookup("#montoAdicionalPorGuiaTextField");

        ChangeListener listenerTarifa = ((observable, oldValue, newValue) -> {
            indiceSeleccionado =  tipoEntradaTipoVisita.getItems().indexOf(newValue);
            montoCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMonto()));
            montoAdicionalGuiaCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMontoAdicionaGuia()));
            montoEntrada = tarifas[indiceSeleccionado].getMonto() + tarifas[indiceSeleccionado].getMontoAdicionaGuia();
            tarifaSeleccionada = tarifas[indiceSeleccionado];
            System.out.println("LA TARIFA SELECCIONADA EN MOSTRAR TARIFA ES : "+ tarifaSeleccionada.getTipoDeEntrada().getNombre());
           gestorDeVentaDeEntradas.tomarSeleccionTarifa(tarifaSeleccionada);
        });
        tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);

    }

    public static void tomarSeleccionDeEntradas(){
        /*supuestaCantidadMaxSede=1000;
        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, supuestaCantidadMaxSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            cantidadDeEntradasSeleccionadas = (int) newValue;
            if (cantidadDeEntradasSeleccionadas == supuestaCantidadMaxSede){
                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
            }
            gestorDeVentaDeEntradas.tomarSeleccionDeEntradas(cantidadDeEntradasSeleccionadas);
        });

        cantidadDeEntradas.valueProperty().addListener(listenerSpinner);

        Random rand = new Random();
        numeroEntrada = rand.nextInt(10000);*/




    }

    public void agregarEntrada() throws IOException{
        listaTE = FXCollections.observableArrayList();
        tablaDeEntradas = new TablaEntradas(
                tarifaSeleccionada.getTipoDeEntrada().getNombre(),
                tarifaSeleccionada.getTipoVisita().getNombre(),
                tarifaSeleccionada.getMonto(),
                tarifaSeleccionada.getMontoAdicionaGuia(),
                cantidadDeEntradasSeleccionadas,
                500
                );
        System.out.println("TIPO DE ENTRADA EN TABLAENTRADAS: " + tablaDeEntradas.getStringEntrada());
//        System.out.println("Tarifa Seleccionada: " + tarifaSeleccionada);


        listaTE.add(tablaDeEntradas);


        tipoEntradaCol.setCellValueFactory(new PropertyValueFactory<>("stringEntrada"));
        tipoVisitaCol.setCellValueFactory(new PropertyValueFactory<>("stringVisita"));
        montoCol.setCellValueFactory(new PropertyValueFactory<>("monto"));
        montoAdicionalGuiaCol.setCellValueFactory(new PropertyValueFactory<>("montoAdicionalGuia"));
        cantidadEntradasCol.setCellValueFactory(new PropertyValueFactory<>("cantidadEntradas"));
        montoTotalCol.setCellValueFactory(new PropertyValueFactory<>("montoTotal"));
        tablaEntradas.setItems(listaTE);
        //System.out.println("EL TAMAÑO ES DE LISTA TE "+listaTE.size());


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        ObservableList<TipoDeEntrada> listaTE = FXCollections.observableArrayList();
//
//        listaTE.add(new TipoDeEntrada("TIPOENTRADA1"));
//        listaTE.add(new TipoDeEntrada("TIPOENTRADA2"));
//        listaTE.add(new TipoDeEntrada("TIPOENTRADA3"));

//        tablaEntradas.setItems(listaTE);

//        tipoEntradaCol.setCellValueFactory(new PropertyValueFactory<TipoDeEntrada, String>("nombre"));

    }


//    public void switchToEntradasRegistradas(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("PantallaRegistroEntradas.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

}

