package VistasFX;

import Modelos.Encryptor;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;

public class PantallaLogin extends Application
{
    private Scene scene;
    private Stage stage;
    private Parent root;
    public Button ingresar;

    @FXML
    public TextField usuarioField;
    @FXML
    public PasswordField contraField;
    @FXML
    public TextField errorField;

    File file = new File("userAndPswrd.csv");

    //Map containing <Username, Password>
    HashMap<String, String> loginInfo = new HashMap<>();

    Encryptor encryptor = new Encryptor();

    public static void main(String[] args){
        //gestorDeVentaDeEntradas = GestorDeVentaDeEntradas.getInstance();

        launch(args);
    }

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

    public void switchToFirstScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("PantallaInicio.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        ingresar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("PASO POR ACA");
            }
        });
    }

    @FXML
    void loginHandler(ActionEvent event) throws IOException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        String username = usuarioField.getText();
        String password = getPassword();
        updateLoginUsernamesAndPasswords();

        String encryptedPassword = loginInfo.get(username);
        if(encryptor.encryptString(password).equals(encryptedPassword)){
            switchToFirstScene(event);
        } else {
            errorField.setVisible(true);
        }
    }

    private String getPassword(){
        return contraField.getText();
    }

    @FXML
    void createAccount(ActionEvent event) throws IOException, NoSuchPaddingException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        writeToFile();
        usuarioField.setText("");
        contraField.setText("");
    }

    private void updateLoginUsernamesAndPasswords() throws IOException {
        Scanner scanner = new Scanner(file);
        loginInfo.clear();
        loginInfo = new HashMap<>();
        while (scanner.hasNext()){
            String[] usernameAndPassword = scanner.nextLine().split(",");
            loginInfo.put(usernameAndPassword[0],usernameAndPassword[1]);
        }
    }

    private void writeToFile() throws IOException, NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        String username = usuarioField.getText();
        String password = getPassword();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));

        writer.write(username + "," + encryptor.encryptString(password) + "\n");
        writer.close();
    }
}
