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
public class Pizzas {

    private LinkedList<Pizza> vPizzas;
    

    public Pizzas() {
        this.vPizzas = new LinkedList<>();
    }

    /**
     * @return the vPizzas
     */
    public LinkedList<Pizza> getvPizzas() {
        return vPizzas;
    }

    /**
     * @param vPizzas the vPizzas to set
     */
    public void setvPizzas(LinkedList<Pizza> vPizzas) {
        this.vPizzas = vPizzas;
    }

    
    
}
