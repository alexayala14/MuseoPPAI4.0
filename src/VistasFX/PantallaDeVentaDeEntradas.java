package VistasFX;

import Controlador.GestorDeVentaDeEntradas;
import Modelos.Tarifa;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PantallaDeVentaDeEntradas extends Application {
    private Scene scene;
    private Stage stage;
    private Parent root;
    private ComboBox<Tarifa> tipoEntradaTipoVisita;
    private TextField montoCampo;
    private static GestorDeVentaDeEntradas gestorDeVentaDeEntradas;

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

        while (tipoEntradaTipoVisita.getValue() != null) {
            montoCampo.setText(String.valueOf(tipoEntradaTipoVisita.getValue().getMonto()));
        }

//        if(tipoEntradaTipoVisita.getValue().getTipoDeEntrada().getNombre().equals("General")){
//
//        } else if (tipoEntradaTipoVisita.getValue().getTipoDeEntrada().getNombre().equals("Adulto")){
//            montoCampo.setText(String.valueOf(tipoEntradaTipoVisita.getValue().getMonto()));
//        }


        stage.show();
    }

    public void mostrarTarifas() throws IOException{

    }


//    public void switchToEntradasRegistradas(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("PantallaRegistroEntradas.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
}
