/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author andre
 */
public class Autenticacion {
    private boolean credencialesCorrectas;
    private String mensaje;
    private boolean activo;
    private UsuarioEstatus usuarioEstatus;
    private Usuario usuario;

    public Autenticacion() {
    }

    public Autenticacion(boolean credencialesCorrectas, String mensaje, boolean activo, UsuarioEstatus usuarioEstatus, Usuario usuario) {
        this.credencialesCorrectas = credencialesCorrectas;
        this.mensaje = mensaje;
        this.activo = activo;
        this.usuarioEstatus = usuarioEstatus;
        this.usuario = usuario;
    }

    public boolean isCredencialesCorrectas() {
        return credencialesCorrectas;
    }

    public void setCredencialesCorrectas(boolean credencialesCorrectas) {
        this.credencialesCorrectas = credencialesCorrectas;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public UsuarioEstatus getUsuarioEstatus() {
        return usuarioEstatus;
    }

    public void setUsuarioEstatus(UsuarioEstatus usuarioEstatus) {
        this.usuarioEstatus = usuarioEstatus;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
