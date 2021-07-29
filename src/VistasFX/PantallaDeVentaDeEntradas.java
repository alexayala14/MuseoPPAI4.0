package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.Entrada;
import Modelos.Tarifa;
import Modelos.TipoDeEntrada;
import Modelos.TipoVisita;
import javafx.application.Application;
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
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class PantallaDeVentaDeEntradas extends Application implements Initializable {
    private Scene scene;
    private Stage stage;
    private Parent root;
    private ComboBox<Tarifa> tipoEntradaTipoVisita;
    private TextField montoCampo;
    private TextField montoAdicionalGuiaCampo;
    private Spinner<Integer> cantidadDeEntradas;
    private TableView tablaEntradasSeleccionadas;
    private TableColumn<String, String> tipoEntradaColumna;
    private TableColumn tipoVisitaColumna;
    private TableColumn montoColumna;
    private TableColumn montoAdicionalGuiaColumna;
    private TableColumn cantidadEntradasColumna;
    private TableColumn montoTotalColumna;
    private int indiceSeleccionado;
    private int valorActualSpinner;
    private Tarifa tarifaSeleccionada;
    private ObservableList<String> listaEntradas = FXCollections.observableArrayList(
//            new Entrada(LocalDate.now(), LocalTime.now(), 500, 525252, gestorDeVentaDeEntradas.sedeActual, new Tarifa(LocalDate.of(2021,9,22),LocalDate.of(2021,7,20),50,20,new TipoDeEntrada("TIPOENTRADA1"),new TipoVisita("TIPOVISITA1")))
    );
    private float montoEntrada;
    private int numeroEntrada;
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas;

    //EJEMPLOS
    @FXML
    private TableView<TipoDeEntrada> tablaEntradas = new TableView<TipoDeEntrada>();

    @FXML
    private TableColumn<TipoDeEntrada, String> tipoEntradaCol = new TableColumn<TipoDeEntrada, String>();


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PantallaLogin.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Museo Pictórico");

        Image icon = new Image("/Imagenes/icon.png");
        stage.getIcons().add(icon);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        gestorDeVentaDeEntradas = GestorDeVentaDeEntradas.getInstance();
        launch(args);
    }

    public void switchToLogin(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaLogin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToFirstScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaInicio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRegistrarVenta(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaRegistrarVentaDeEntradas.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        int supuestaCantidadMaxSede = 1000;


        Tarifa[] tarifas = gestorDeVentaDeEntradas.buscarTarifas();
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

        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, supuestaCantidadMaxSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        valorActualSpinner = cantidadDeEntradas.getValue();


        ChangeListener listenerTarifa = ((observable, oldValue, newValue) -> {
            indiceSeleccionado =  tipoEntradaTipoVisita.getItems().indexOf(newValue);
            montoCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMonto()));
            montoAdicionalGuiaCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMontoAdicionaGuia()));
            montoEntrada = tarifas[indiceSeleccionado].getMonto() + tarifas[indiceSeleccionado].getMontoAdicionaGuia();
            tarifaSeleccionada = tarifas[indiceSeleccionado];
        });

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            valorActualSpinner = (int) newValue;
            if (valorActualSpinner == supuestaCantidadMaxSede){
                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
            }
        });


        tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);
        cantidadDeEntradas.valueProperty().addListener(listenerSpinner);

        Random rand = new Random();
        numeroEntrada = rand.nextInt(10000);

//        listaEntradas.add(new Entrada(LocalDate.now(), LocalTime.now(), montoEntrada, numeroEntrada, gestorDeVentaDeEntradas.sedeActual, tarifaSeleccionada));

        stage.show();
    }

    public void mostrarTarifas() throws IOException{

    }

    public void agregarEntrada() throws IOException{
        System.out.println("ANTES DEL ADD: " + this.tarifaSeleccionada);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<TipoDeEntrada> listaTE = FXCollections.observableArrayList();

        listaTE.add(new TipoDeEntrada("TIPOENTRADA1"));
        listaTE.add(new TipoDeEntrada("TIPOENTRADA2"));
        listaTE.add(new TipoDeEntrada("TIPOENTRADA3"));

//        tablaEntradas.setEditable(true);
        tablaEntradas.setItems(listaTE);

        tipoEntradaCol.setCellValueFactory(new PropertyValueFactory<TipoDeEntrada, String>("nombre"));

    }


//    public void switchToEntradasRegistradas(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("PantallaRegistroEntradas.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
}
