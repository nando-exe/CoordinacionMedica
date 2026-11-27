/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Constancia {
   
    private int idConstancia;
    private String folio;
    private int idCurso;
    private int idEstudiante;
    private String nombreEstudiante;
    private String matricula;
    private String nombreCurso;
    private String horarioCurso;
    private String fechaEmision;
    private int idEstatus;
    private String estatus;

    public Constancia() {
    }

    public Constancia(int idConstancia, String folio, int idCurso, int idEstudiante,
            String nombreEstudiante, String matricula, String nombreCurso, String horarioCurso,
            String fechaEmision, int idEstatus, String estatus) {
        this.idConstancia = idConstancia;
        this.folio = folio;
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.matricula = matricula;
        this.nombreCurso = nombreCurso;
        this.horarioCurso = horarioCurso;
        this.fechaEmision = fechaEmision;
        this.idEstatus = idEstatus;
        this.estatus = estatus;
    }

    public int obtenerIdConstancia() {
        return idConstancia;
    }

    public void establecerIdConstancia(int idConstancia) {
        this.idConstancia = idConstancia;
    }

    public String obtenerFolio() {
        return folio;
    }

    public void establecerFolio(String folio) {
        this.folio = folio;
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

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public void establecerNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public void establecerMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String obtenerNombreCurso() {
        return nombreCurso;
    }

    public void establecerNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String obtenerHorarioCurso() {
        return horarioCurso;
    }

    public void establecerHorarioCurso(String horarioCurso) {
        this.horarioCurso = horarioCurso;
    }

    public String obtenerFechaEmision() {
        return fechaEmision;
    }

    public void establecerFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
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
