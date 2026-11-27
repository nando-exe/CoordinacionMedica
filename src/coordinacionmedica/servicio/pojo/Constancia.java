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
    private int idInscripcion;
    private String folio;
    private String fechaEmision;
    private String nombreCurso;
    private String nombreEstudiante;
    private String periodo;
    private ConstanciaEstado estado;

    public Constancia() {
    }

    public Constancia(int idConstancia, int idInscripcion, String folio, String fechaEmision,
            String nombreCurso, String nombreEstudiante, String periodo, ConstanciaEstado estado) {
        this.idConstancia = idConstancia;
        this.idInscripcion = idInscripcion;
        this.folio = folio;
        this.fechaEmision = fechaEmision;
        this.nombreCurso = nombreCurso;
        this.nombreEstudiante = nombreEstudiante;
        this.periodo = periodo;
        this.estado = estado;
    }

    public int obtenerIdConstancia() {
        return idConstancia;
    }

    public void establecerIdConstancia(int idConstancia) {
        this.idConstancia = idConstancia;
    }

    public int obtenerIdInscripcion() {
        return idInscripcion;
    }

    public void establecerIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String obtenerFolio() {
        return folio;
    }

    public void establecerFolio(String folio) {
        this.folio = folio;
    }

    public String obtenerFechaEmision() {
        return fechaEmision;
    }

    public void establecerFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String obtenerNombreCurso() {
        return nombreCurso;
    }

    public void establecerNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public void establecerNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String obtenerPeriodo() {
        return periodo;
    }

    public void establecerPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ConstanciaEstado obtenerEstado() {
        return estado;
    }

    public void establecerEstado(ConstanciaEstado estado) {
        this.estado = estado;
    }
}
