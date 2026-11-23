/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coordinacionmedica.controlador;

import coordinacionmedica.servicio.pojo.Usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class PrincipalViewController implements Initializable {
    private Usuario usuario;
    @FXML
    private Button btnInicio;
    @FXML
    private Button btnUsuarios;
    @FXML
    private Button btnSalir;
    @FXML
    private StackPane contenedorPrincipal;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public void inicializarInformacion(Usuario usuario){
        this.usuario = usuario;
    }
}
