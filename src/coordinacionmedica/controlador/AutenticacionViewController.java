/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coordinacionmedica.controlador;

import coordinacionmedica.CoordinacionMedica;
import coordinacionmedica.modelo.dao.AutenticacionDAO;
import coordinacionmedica.servicio.AutenticacionService;
import coordinacionmedica.servicio.pojo.Autenticacion;
import coordinacionmedica.servicio.pojo.Usuario;
import coordinacionmedica.utilidades.Utilidades;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
        String nombreUsuario  = tftUsuario.getText();
        String contrasenia = tftContrasenia.getText();
        if(sonCamposVacios()){
            validarCredenciales(nombreUsuario, contrasenia);
        }
    }
    
    private void validarCredenciales(String nombreUsuario, String contrasenia){
        AutenticacionService autenticacionService = new AutenticacionService(new AutenticacionDAO());
        try{
            Autenticacion respuesta =
                    autenticacionService.verificarCredenciales(nombreUsuario, contrasenia);
            if(respuesta.isCredencialesCorrectas() && respuesta.isActivo()){
                Utilidades.generarAlerta("Credenciales correctas",
                        respuesta.getMensaje(), Alert.AlertType.INFORMATION);
               irPantallaPrincipal(respuesta.getUsuario());
            }else{
                Utilidades.generarAlerta("Lo sentimos", respuesta.getMensaje(), Alert.AlertType.WARNING);
            }
        }catch (RuntimeException ex){
            Utilidades.generarAlerta("Error",
                    ex.getMessage(), Alert.AlertType.ERROR);
        }
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
            lblErrorContrasenia.setText("Debes ingresar la contraseña");
            esValido = false;
        }
        return esValido;
    }
    private void irPantallaPrincipal(Usuario usuario ){
        try{
            Stage escenario = (Stage) tftUsuario.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(CoordinacionMedica.class.getResource("vista/PrincipalView.fxml"));
            Parent vista = loader.load();
            PrincipalViewController controlador = loader.getController();
            controlador.inicializarInformacion(usuario);
            Scene escena = new Scene(vista);
            escenario.setScene(escena);
            escenario.setTitle("Coordinacion Medica");
            escenario.show();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
