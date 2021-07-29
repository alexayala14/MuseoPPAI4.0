package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.TablaEntradas;
import Modelos.Tarifa;
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
import java.util.ArrayList;
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
    private Button agregarEntradasButton;

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

    private int indiceSeleccionado;
    private static int cantidadDeEntradasSeleccionadas;
    private static Tarifa tarifaSeleccionada = new Tarifa();

    private float montoEntrada;
    private int numeroEntrada;
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas;

    //EJEMPLOS
    @FXML
    private TableView<TablaEntradas> tablaEntradas = new TableView<TablaEntradas>();

    @FXML
    private TableColumn<TablaEntradas, String> tipoEntradaCol = new TableColumn<TablaEntradas, String>();

    ObservableList<TablaEntradas> listaTE = FXCollections.observableArrayList();

    TablaEntradas tablaDeEntradas;

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

        agregarEntradasButton = (Button)scene.lookup("#agregarEntradaButton");

        tipoEntradaTipoVisita = (ComboBox)scene.lookup("#tiposEntradaVisitaCombo");
        tipoEntradaTipoVisita.getItems().addAll(tarifas);

        montoCampo = (TextField) scene.lookup("#montoTextField");
        montoAdicionalGuiaCampo = (TextField) scene.lookup("#montoAdicionalPorGuiaTextField");

        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, supuestaCantidadMaxSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();

        ChangeListener listenerTarifa = ((observable, oldValue, newValue) -> {
            indiceSeleccionado =  tipoEntradaTipoVisita.getItems().indexOf(newValue);
            montoCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMonto()));
            montoAdicionalGuiaCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMontoAdicionaGuia()));
            montoEntrada = tarifas[indiceSeleccionado].getMonto() + tarifas[indiceSeleccionado].getMontoAdicionaGuia();
            tarifaSeleccionada = tarifas[indiceSeleccionado];
        });

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            cantidadDeEntradasSeleccionadas = (int) newValue;
            if (cantidadDeEntradasSeleccionadas == supuestaCantidadMaxSede){
                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
            }
        });

        tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);
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

    public void mostrarTarifas() throws IOException{

    }

    public void agregarEntrada() throws IOException{
        tablaDeEntradas = new TablaEntradas(
                this.tarifaSeleccionada.getTipoDeEntrada().getNombre(),
                this.tarifaSeleccionada.getTipoVisita().getNombre(),
                this.tarifaSeleccionada.getMonto(),
                this.tarifaSeleccionada.getMontoAdicionaGuia(),
                this.cantidadDeEntradasSeleccionadas,
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

