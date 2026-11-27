/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Calificacion {
 
    public static final double CALIFICACION_MINIMA = 0;
    public static final double CALIFICACION_MAXIMA = 10;

    private int idCalificacion;
    private int idEstudiante;
    private int idInstancia;
    private double valor;
    private String fechaRegistro;
    private int idResponsable;

    public Calificacion() {
    }

    public Calificacion(int idCalificacion, int idEstudiante, int idInstancia, double valor,
            String fechaRegistro, int idResponsable) {
        this.idCalificacion = idCalificacion;
        this.idEstudiante = idEstudiante;
        this.idInstancia = idInstancia;
        this.valor = valor;
        this.fechaRegistro = fechaRegistro;
        this.idResponsable = idResponsable;
    }

    public int obtenerIdCalificacion() {
        return idCalificacion;
    }

    public void establecerIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }

    public void establecerIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int obtenerIdInstancia() {
        return idInstancia;
    }

    public void establecerIdInstancia(int idInstancia) {
        this.idInstancia = idInstancia;
    }

    public double obtenerValor() {
        return valor;
    }

    public void establecerValor(double valor) {
        this.valor = valor;
    }

    public String obtenerFechaRegistro() {
        return fechaRegistro;
    }

    public void establecerFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int obtenerIdResponsable() {
        return idResponsable;
    }

    public void establecerIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }
}

