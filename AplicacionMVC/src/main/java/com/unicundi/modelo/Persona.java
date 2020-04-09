/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.modelo;

/**
 * Clase que tiene los datos de la persona
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class Persona {

    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Constructor de clase
     * @param nombre nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Obtiene el nombre de la persona
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

}
