/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidotelepizza;

import java.util.LinkedList;

/**
 *
 * @author Alex Recacha
 */
public class Pizza {

    private String nombre;
    private LinkedList<String> ingredientes;

    public Pizza(String nombre, LinkedList<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ingredientes
     */
    public LinkedList<String> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(LinkedList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return nombre + " " + ingredientes; //To change body of generated methods, choose Tools | Templates.
    }

}
