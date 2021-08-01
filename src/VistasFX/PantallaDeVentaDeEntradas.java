package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.Sede;
import Modelos.TablaEntradas;
import Modelos.Tarifa;
import com.sun.javafx.scene.control.FakeFocusTextField;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jdk.internal.icu.text.NormalizerBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class PantallaDeVentaDeEntradas {
    @FXML
    private static TableView<TablaEntradas> tablaEntradas;

    public Button ingresar;
    private static Scene scene;
    private static Stage stage;
    private static Parent root;
    private static ComboBox<Tarifa> tipoEntradaTipoVisita;
    private static TextField montoCampo;
    private static TextField montoAdicionalGuiaCampo;
    private static Spinner<Integer> cantidadDeEntradas;
    private static Button agregarEntradasButton;

    @FXML
    private static Label errorLbl;

    @FXML
    private TableColumn<TablaEntradas, String> tipoEntradaCol = new TableColumn<>("Tipo Entrada");
    @FXML
    private TableColumn<TablaEntradas, String> tipoVisitaCol = new TableColumn<>("Tipo Visita");
    @FXML
    private TableColumn<TablaEntradas, Integer> montoCol = new TableColumn<>("Monto");
    @FXML
    private TableColumn<TablaEntradas, Integer> montoAdicionalGuiaCol = new TableColumn<>("Adicional x Guía");
    @FXML
    private TableColumn<TablaEntradas, Integer> cantidadEntradasCol = new TableColumn<>("Cantidad Entradas");
    @FXML
    private TableColumn<TablaEntradas, Integer> montoTotalCol = new TableColumn<>("Monto Total");

    private static PantallaDeVentaDeEntradas instance;

    private static int indiceSeleccionado;
    private static int cantidadDeEntradasSeleccionadas;
    private static Tarifa tarifaSeleccionada = new Tarifa();

    private static float montoEntrada;
    private  int numeroEntrada;
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas;
    private int cantidadMaximaSede = GestorDeVentaDeEntradas.getInstance().cantMaxVisitantes;
    private Tarifa[] tarifas;

    //EJEMPLOS
   /* @FXML
    TableView<TablaEntradas> tablaEntradas = new TableView<>();*/

    private static ObservableList<TablaEntradas> listaTE = FXCollections.observableArrayList();

    private static TablaEntradas tablaDeEntradas;
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

//        supuestaCantidadMaxSede = 1000;
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

//        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
//        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas);
//        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, supuestaCantidadMaxSede);
//        valueFactory.setValue(0);
//        cantidadDeEntradas.setValueFactory(valueFactory);
//        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();
//        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas.getValue());

       /* ChangeListener listenerTarifa = ((observable, oldValue, newValue) -> {
            indiceSeleccionado =  tipoEntradaTipoVisita.getItems().indexOf(newValue);
            montoCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMonto()));
            montoAdicionalGuiaCampo.setText(String.valueOf(tarifas[indiceSeleccionado].getMontoAdicionaGuia()));
            montoEntrada = tarifas[indiceSeleccionado].getMonto() + tarifas[indiceSeleccionado].getMontoAdicionaGuia();
            tarifaSeleccionada = tarifas[indiceSeleccionado];
        });*/

//        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
//            cantidadDeEntradasSeleccionadas = (int) newValue;
//            if (cantidadDeEntradasSeleccionadas == supuestaCantidadMaxSede){
//                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
//            }
//            System.out.println("LA CANTIDAD DE ENTRADAS SELECCIONAS EN PANTALLA "+cantidadDeEntradasSeleccionadas);
//            gestorDeVentaDeEntradas.tomarSeleccionDeEntradas(cantidadDeEntradasSeleccionadas);
//        });

        //tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);
//       cantidadDeEntradas.valueProperty().addListener(listenerSpinner);

//        Random rand = new Random();
//        numeroEntrada = rand.nextInt(10000);

//        agregarEntradasButton.setOnMouseClicked((evento) -> {
//            try {
//                agregarEntrada(this.tarifaSeleccionada);
//            } catch (IOException e) {
//                System.out.println("ERROR: ");
//                e.printStackTrace();
//            }
//        });

//        listaEntradas.add(new Entrada(LocalDate.now(), LocalTime.now(), montoEntrada, numeroEntrada, gestorDeVentaDeEntradas.sedeActual, tarifaSeleccionada));

        tomarSeleccionDeEntradas();

        stage.show();
    }

    public static PantallaDeVentaDeEntradas getInstance(){
        if (instance == null) {
            instance = new PantallaDeVentaDeEntradas();
        }
        return instance;
    }

    public static void tomarSeleccionDeEntradas(){
//        cantidadMaximaSede =  gestorDeVentaDeEntradas.cantMaxVisitantes;
        System.out.println("CANTIDAD MAXIMA SEDE: "+getInstance().cantidadMaximaSede);

        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas);
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, getInstance().cantidadMaximaSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();
        System.out.println("SPINNER CANTIDAD DE ENTRADAS "+ cantidadDeEntradas.getValue());

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            cantidadDeEntradasSeleccionadas = (int) newValue;
            if (cantidadDeEntradasSeleccionadas >= getInstance().cantidadMaximaSede){
                System.out.println("NO SE PUEDEN AGREGAR MÁS ENTRADAS!!!");
                cantidadDeEntradas.getValueFactory().setValue(getInstance().cantidadMaximaSede);
            }
            System.out.println("LA CANTIDAD DE ENTRADAS SELECCIONAS EN PANTALLA "+cantidadDeEntradasSeleccionadas);
            gestorDeVentaDeEntradas.tomarSeleccionDeEntradas(cantidadDeEntradasSeleccionadas);
        });

        cantidadDeEntradas.valueProperty().addListener(listenerSpinner);
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
            cantidadDeEntradas.getValueFactory().setValue(0);
            System.out.println("LA TARIFA SELECCIONADA EN MOSTRAR TARIFA ES : "+ tarifaSeleccionada.getTipoDeEntrada().getNombre());
           gestorDeVentaDeEntradas.tomarSeleccionTarifa(tarifaSeleccionada);
        });
        tipoEntradaTipoVisita.valueProperty().addListener(listenerTarifa);
    }

    public static void mostrarDetalleDeEntrada(float monto){
        errorLbl = (Label)scene.lookup("#errorLbl");
        if (monto == 0){
            errorLbl.setVisible(true);

            int ultimoValor = cantidadDeEntradas.getValueFactory().getValue();
            cantidadDeEntradas.getValueFactory().setValue(ultimoValor-1);
        } else {
            errorLbl.setVisible(false);

            listaTE = FXCollections.observableArrayList();
            tablaEntradas = (TableView<TablaEntradas>) scene.lookup("#tablaEntradas");

            System.out.println("EL MONTO DENTRO DE DETALLE ES: " + monto);

            tablaDeEntradas = new TablaEntradas(
                    tarifaSeleccionada.getTipoDeEntrada().getNombre(),
                    tarifaSeleccionada.getTipoVisita().getNombre(),
                    tarifaSeleccionada.getMonto(),
                    tarifaSeleccionada.getMontoAdicionaGuia(),
                    cantidadDeEntradasSeleccionadas,
                    monto
            );

            listaTE.add(tablaDeEntradas);

            getInstance().tipoEntradaCol.setCellValueFactory(new PropertyValueFactory<>("stringEntrada"));
            getInstance().tipoVisitaCol.setCellValueFactory(new PropertyValueFactory<>("stringVisita"));
            getInstance().montoCol.setCellValueFactory(new PropertyValueFactory<>("monto"));
            getInstance().montoAdicionalGuiaCol.setCellValueFactory(new PropertyValueFactory<>("montoAdicionalGuia"));
            getInstance().cantidadEntradasCol.setCellValueFactory(new PropertyValueFactory<>("cantidadEntradas"));
            getInstance().montoTotalCol.setCellValueFactory(new PropertyValueFactory<>("montoTotal"));

            if (tablaEntradas.getColumns().size() == 0) {
                tablaEntradas.getColumns().addAll(getInstance().tipoEntradaCol, getInstance().tipoVisitaCol, getInstance().montoCol, getInstance().montoAdicionalGuiaCol, getInstance().cantidadEntradasCol, getInstance().montoTotalCol);
            }

            tablaEntradas.setItems(listaTE);
        }
    }

    public boolean tomarConfirmacionDeVenta(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("CONFIRMACION DE VENTA");
        String s = "Desea confirmar la venta de las entradas?";
        alert.setContentText(s);

        Optional<ButtonType> result = alert.showAndWait();

        if ((result.isPresent()) && (result.get() == ButtonType.OK)) {
            System.out.println("RESULTADO: "+result.get());
            gestorDeVentaDeEntradas.getInstance().tomarConfirmacionDeVenta(true);
            return true;
        } else {
            System.out.println("RESULTADO: "+result.get());
            gestorDeVentaDeEntradas.getInstance().tomarConfirmacionDeVenta(false);
            return false;
        }
    }

}

