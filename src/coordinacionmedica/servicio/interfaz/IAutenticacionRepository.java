/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package coordinacionmedica.servicio.interfaz;

import coordinacionmedica.servicio.pojo.Usuario;
import coordinacionmedica.servicio.pojo.UsuarioEstatus;

/**
 *
 * @author andre
 */
public interface IAutenticacionRepository {
    
    public int verificarCredenciales(String nombreUsuario, String contrasenia) throws RuntimeException;
    
    public UsuarioEstatus verificarEstatusUsuario(int idUsuario);
    
    public Usuario obtenerInformacionUsuario(int idUsuario);
}
