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
    private int idEstudiante;
    private int idCurso;
    private String periodo;
    private boolean estado;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, int idEstudiante, int idCurso, String periodo,
            boolean estado) {
        this.idInscripcion = idInscripcion;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        this.periodo = periodo;
        this.estado = estado;
    }

    public int obtenerIdInscripcion() {
        return idInscripcion;
    }

    public void establecerIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public int obtenerIdEstudiante() {
        return idEstudiante;
    }

    public void establecerIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int obtenerIdCurso() {
        return idCurso;
    }

    public void establecerIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String obtenerPeriodo() {
        return periodo;
    }

    public void establecerPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean obtenerEstado() {
        return estado;
    }

    public void establecerEstado(boolean estado) {
        this.estado = estado;
    }
}