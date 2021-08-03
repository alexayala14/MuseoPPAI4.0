package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.TablaEntradas;
import Modelos.Tarifa;
import javafx.animation.PauseTransition;
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
import javafx.util.Duration;

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
    @FXML
    private static Button registrarEntradasBtn;

    @FXML
    private static Label errorLbl;
    @FXML
    private static Label cantidadVisitantesLbl;

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
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas = new GestorDeVentaDeEntradas();
    private int cantidadMaximaSede = GestorDeVentaDeEntradas.getInstance().cantMaxVisitantes;
    private Tarifa[] tarifas;
    

    private static ObservableList<TablaEntradas> listaTE = FXCollections.observableArrayList();

    private static TablaEntradas tablaDeEntradas;

    public static void mostrarLabel(int cantidadPersonasEnSede) {
        cantidadVisitantesLbl = (Label)scene.lookup("#cantidadVisitantesLbl");
//      cantidadPersonasEnSedeLbl.setVisible(true);
        if (cantidadPersonasEnSede != 0) {
            cantidadVisitantesLbl.setText("ASDSA");
        }
    }

    public void cerrarVentana() {
        try {
            root = FXMLLoader.load(getClass().getResource("PantallaInicio.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void habilitarVentana(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaRegistrarVentaDeEntradas.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        GestorDeVentaDeEntradas gestorDeVentaDeEntradas = GestorDeVentaDeEntradas.getInstance();
        gestorDeVentaDeEntradas.registrarVentaDeEntrada();

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

        registrarEntradasBtn = (Button)scene.lookup("#registrarEntradasBtn");
        registrarEntradasBtn.setDisable(true);

        cantidadDeEntradas = (Spinner)scene.lookup("#cantEntradasSpinner");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, getInstance().cantidadMaximaSede);
        valueFactory.setValue(0);
        cantidadDeEntradas.setValueFactory(valueFactory);
        cantidadDeEntradasSeleccionadas = cantidadDeEntradas.getValue();

        ChangeListener listenerSpinner = ((observable, oldValue, newValue) -> {
            if (tipoEntradaTipoVisita.getValue() != null && cantidadDeEntradas.getValueFactory().getValue() > 0) {
                cantidadDeEntradasSeleccionadas = (int) newValue;
                registrarEntradasBtn.setDisable(false);
            } else if (tipoEntradaTipoVisita.getValue() == null && cantidadDeEntradas.getValueFactory().getValue() < 0){
                cantidadDeEntradas.getValueFactory().setValue(0);
            }
            if (cantidadDeEntradasSeleccionadas >= getInstance().cantidadMaximaSede){
                cantidadDeEntradas.getValueFactory().setValue(getInstance().cantidadMaximaSede);
            }
            gestorDeVentaDeEntradas.tomarSeleccionDeEntradas(cantidadDeEntradasSeleccionadas);
        });

        cantidadDeEntradas.valueProperty().addListener(listenerSpinner);
    }

    public static void mostrarTarifas(Tarifa[] tarifas){
        //tarifas = tarifas;
        ArrayList<String> tiposDeEntradasYVisitas = new ArrayList<>();
        ArrayList<Float> montos = new ArrayList<>();
        ArrayList<Float> montosPorGuia = new ArrayList<>();

        for (Tarifa t: tarifas){
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
            gestorDeVentaDeEntradas.getInstance().tomarConfirmacionDeVenta(true);
            return true;
        } else {
            gestorDeVentaDeEntradas.getInstance().tomarConfirmacionDeVenta(false);
            return false;
        }
    }

    public void imprimir(){
        // can use an Alert, Dialog, or PopupWindow as needed...
        Alert popup = new Alert(Alert.AlertType.INFORMATION);
        popup.setTitle("IMPRIMIENDO...");
        popup.setContentText("Se imprimirán las entradas registradas!");
// hide popup after 3 seconds:
        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(e -> popup.hide());

        popup.show();
        delay.play();
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

}

