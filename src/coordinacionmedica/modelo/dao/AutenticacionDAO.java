/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.modelo.dao;

import coordinacionmedica.modelo.ConexionBD;
import coordinacionmedica.servicio.interfaz.IAutenticacionRepository;
import coordinacionmedica.servicio.pojo.Usuario;
import coordinacionmedica.servicio.pojo.UsuarioEstatus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class AutenticacionDAO implements IAutenticacionRepository{

    @Override
    public int verificarCredenciales(String nombreUsuario, String contrasenia) throws RuntimeException{
        int idUsuario = 0;
        String query = "SELECT idUsuario FROM Usuarios WHERE nombreUsuario = ? AND password = ?";
        try(Connection conexion = ConexionBD.obtenerConexion();
                PreparedStatement ps = conexion.prepareStatement(query)){
            ps.setString(1, nombreUsuario);
            ps.setString(2, contrasenia);
            ResultSet resultado = ps.executeQuery();
            if(resultado.next()){
                idUsuario = resultado.getInt("idUsuario");
            }else{
                return -1;
            }
            resultado.close();
            return idUsuario;
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("Error de conexion con el almacenamiento");
        }
    }

    @Override
    public UsuarioEstatus verificarEstatusUsuario(int idUsuario) {
        UsuarioEstatus estatus = new UsuarioEstatus();
        String query = "SELECT Usuarios.idEstatus, Estatus.estatus " +
            "FROM Usuarios " +
            "INNER JOIN Estatus " +
            "ON Estatus.idEstatus = Usuarios.idEstatus " +
            "WHERE Usuarios.idUsuario = ?";
        try(Connection conexion = ConexionBD.obtenerConexion();
                PreparedStatement ps = conexion.prepareStatement(query)){
            ps.setInt(1, idUsuario);
            try(ResultSet resultado = ps.executeQuery()){
                if(resultado.next()){
                    estatus.setIdEstatus(resultado.getInt("idEstatus"));
                    estatus.setEstatus(resultado.getString("estatus"));
                    return estatus;
                }else{
                    throw new RuntimeException("Error en la integridad de los datos");
                }
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("Error de conexion con la Bd");
        }
    }
    @Override
    public Usuario obtenerInformacionUsuario(int idUsuario) {
        Usuario usuario = new Usuario();
        String query = "SELECT Usuarios.idUsuario, Usuarios.nombre, Usuarios.apellidoPaterno, Usuarios.apellidoMaterno, " +
                "Usuarios.nombreUsuario, Usuarios.idRol, Roles.rol, Usuarios.idEstatus, Estatus.estatus " +
                "FROM Usuarios " +
                "INNER JOIN Roles ON Roles.idRol = Usuarios.idRol " +
                "INNER JOIN Estatus ON Estatus.idEstatus = Usuarios.idEstatus " +
                "WHERE Usuarios.idUsuario = ?";
        try (Connection conexion = ConexionBD.obtenerConexion();
                PreparedStatement ps = conexion.prepareStatement(query)) {
            ps.setInt(1, idUsuario);
            try (ResultSet resultado = ps.executeQuery()) {
                if (resultado.next()) {
                    usuario.setIdUsuario(resultado.getInt("idUsuario"));
                    usuario.setNombre(resultado.getString("nombre"));
                    usuario.setApellidoPaterno(resultado.getString("apellidoPaterno"));
                    usuario.setApellidoMaterno(resultado.getString("apellidoMaterno"));
                    usuario.setNombreUsuario(resultado.getString("nombreUsuario"));
                    usuario.setIdRol(resultado.getInt("idRol"));
                    usuario.setRol(resultado.getString("rol"));
                    usuario.setIdEstatus(resultado.getInt("idEstatus"));
                    usuario.setEstatus(resultado.getString("estatus"));
                    return usuario;
                } else {
                    throw new RuntimeException("Error en la integridad de los datos");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error de conexion con la BD", ex);
        }
    }
    
}
