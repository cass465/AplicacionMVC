/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.principal;

import com.unicundi.graficas.Ventana;
import com.unicundi.modelo.Persona;
import com.unicundi.controlador.InsertarPersona;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal 
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Main {

    /** Metodo donde se ejecuta la aplicacion
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Persona> personas = new ArrayList<Persona>();
        Ventana ventana = new Ventana("LISTADO MVC");
        new InsertarPersona(personas, ventana);

    }

}
