/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Inscripcion {


    private int idInscripcion;
    private int idCurso;
    private int idEstudiante;
    private String periodo;
    private int idEstatus;
    private String estatus;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, int idCurso, int idEstudiante, String periodo,
            int idEstatus, String estatus) {
        this.idInscripcion = idInscripcion;
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
        this.periodo = periodo;
        this.idEstatus = idEstatus;
        this.estatus = estatus;
    }

    public int obtenerIdInscripcion() {
        return idInscripcion;
    }

    public void establecerIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int obtenerIdCurso() {
        return idCurso;
    }

    public void establecerIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }

    public void establecerIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String obtenerPeriodo() {
        return periodo;
    }

    public void establecerPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int obtenerIdEstatus() {
        return idEstatus;
    }

    public void establecerIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String obtenerEstatus() {
        return estatus;
    }

    public void establecerEstatus(String estatus) {
        this.estatus = estatus;
    }
}

