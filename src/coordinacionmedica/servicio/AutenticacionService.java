/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio;

import coordinacionmedica.servicio.interfaz.IAutenticacionRepository;
import coordinacionmedica.servicio.pojo.Autenticacion;
import coordinacionmedica.servicio.pojo.Usuario;
import coordinacionmedica.servicio.pojo.UsuarioEstatus;
import coordinacionmedica.utilidades.Utilidades;

/**
 *
 * @author andre
 */
public class AutenticacionService {
    private final IAutenticacionRepository contrato;
    private final int CREDENCIALES_INCORRECTAS = -1;
    private final int ESTATUS_USUARIO_ACTIVO = 1;
    private final int ESTATUS_USUARIO_BAJA = 2;
    
    public AutenticacionService(IAutenticacionRepository contrato){
        this.contrato = contrato;
                
    }
    
    public Autenticacion verificarCredenciales(String nombreUsuario,
            String contrasenia) throws RuntimeException{
        Autenticacion respuesta = new Autenticacion();
        if(nombreUsuario.isEmpty() || contrasenia.isEmpty()){
            respuesta.setCredencialesCorrectas(false);
            respuesta.setMensaje("Por favor rellena los campos con el formato solicitado");
            return respuesta;
        }
        String contraseniaCifrado = Utilidades.generarCifradoSHA256(contrasenia);
        int idUsuario = contrato.verificarCredenciales(nombreUsuario, contraseniaCifrado);
        if(idUsuario == CREDENCIALES_INCORRECTAS){
            respuesta.setCredencialesCorrectas(false);
            respuesta.setMensaje("El nombre de usuario o contraseña son incorrectos."
                    + "\nVerifica a informacion e intentalo nuevamente");
            return respuesta;
        }
        UsuarioEstatus estatus = contrato.verificarEstatusUsuario(idUsuario);
        if(estatus.getIdEstatus() == ESTATUS_USUARIO_ACTIVO){
            respuesta.setCredencialesCorrectas(true);
            respuesta.setActivo(true);
            Usuario info = contrato.obtenerInformacionUsuario(idUsuario);
            respuesta.setUsuario(info);
            respuesta.setMensaje("Hola, "
                + info.getNombre() + "  bienvenido al Sistema de la Coordinacion Medica");
            return respuesta;
        }
        respuesta.setCredencialesCorrectas(true);
        respuesta.setActivo(false);
        if(estatus.getIdEstatus() == ESTATUS_USUARIO_BAJA){
            respuesta.setMensaje("Tu cuenta ha sido dada de baja");
        }
        return respuesta;
    }
}
