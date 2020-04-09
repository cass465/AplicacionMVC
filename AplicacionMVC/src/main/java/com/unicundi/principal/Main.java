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
 *
 * @author cass465
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Persona> personas = new ArrayList<>();
        Ventana ventana = new Ventana("LISTADO MVC");

        InsertarPersona insertar = new InsertarPersona(personas, ventana);
        
        
        insertar.iniciar();

    }

}
