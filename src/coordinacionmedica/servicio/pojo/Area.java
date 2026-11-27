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

    private int numArea;
    private String nombre;

    public Area() {
    }

    public Area(int numArea, String nombre) {
        this.numArea = numArea;
        this.nombre = nombre;
    }

    public int obtenerNumArea() {
        return numArea;
    }

    public void establecerNumArea(int numArea) {
        this.numArea = numArea;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }
}