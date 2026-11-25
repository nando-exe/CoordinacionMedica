/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Curso {

    private int idCurso;
    private String nombre;
    private String descripcion;
    private String horario;
    private int idEstatus;
    private String estatus;

    public Curso() {
    }

    public Curso(int idCurso, String nombre, String descripcion, String horario, int idEstatus,
            String estatus) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.idEstatus = idEstatus;
        this.estatus = estatus;
    }

    public int obtenerIdCurso() {
        return idCurso;
    }

    public void establecerIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDescripcion() {
        return descripcion;
    }

    public void establecerDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String obtenerHorario() {
        return horario;
    }

    public void establecerHorario(String horario) {
        this.horario = horario;
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

