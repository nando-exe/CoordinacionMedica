/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coordinacionmedica.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class AutenticacionViewController implements Initializable {

    @FXML
    private Label lblErrorUsuario;
    @FXML
    private Label lblErrorContrasenia;
    @FXML
    private TextField tftUsuario;
    @FXML
    private PasswordField tftContrasenia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtnIngresar(ActionEvent event) {
    }
    
    private boolean sonCamposVacios(){
        boolean esValido = true;
        lblErrorUsuario.setText("");
        lblErrorContrasenia.setText("");
        if(tftUsuario.getText().isEmpty()){
            lblErrorUsuario.setText ("El nombre de usuario es obligatorio");
            esValido = false;
        }
        if(tftContrasenia.getText().isEmpty()){
            lblErrorContrasenia.setText("Debes ingresar la contraseña6");
            esValido = false;
        }
        return esValido;
    }
}
