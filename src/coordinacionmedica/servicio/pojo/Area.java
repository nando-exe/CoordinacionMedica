/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinacionmedica.servicio.pojo;

/**
 *
 * @author Mgg12
 */
public class Area {

    private int idArea;
    private String nombre;
    private int numeroEstudiantes;

    public Area() {
    }

    public Area(int idArea, String nombre, int numeroEstudiantes) {
        this.idArea = idArea;
        this.nombre = nombre;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public int obtenerIdArea() {
        return idArea;
    }

    public void establecerIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void establecerNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }
}

