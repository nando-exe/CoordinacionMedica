/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Practica {
    
    

    public static final float CALIFICACION_MINIMA = 0;
    public static final float CALIFICACION_MAXIMA = 10;

    private int idEstudiante;
    private int numArea;
    private float calificacion;
    private String periodo;
    private String fechaRegistro;
    private int idResponsable;

    public Practica() {
    }

    public Practica(int idEstudiante, int numArea, float calificacion, String periodo,
            String fechaRegistro, int idResponsable) {
        this.idEstudiante = idEstudiante;
        this.numArea = numArea;
        this.calificacion = calificacion;
        this.periodo = periodo;
        this.fechaRegistro = fechaRegistro;
        this.idResponsable = idResponsable;
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }

    public void establecerIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int obtenerNumArea() {
        return numArea;
    }

    public void establecerNumArea(int numArea) {
        this.numArea = numArea;
    }

    public float obtenerCalificacion() {
        return calificacion;
    }

    public void establecerCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String obtenerPeriodo() {
        return periodo;
    }

    public void establecerPeriodo(String periodo) {
        this.periodo = periodo;
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

