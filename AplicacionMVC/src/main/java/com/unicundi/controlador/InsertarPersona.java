/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import com.unicundi.modelo.Persona;
import com.unicundi.graficas.Ventana;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 * Clase controlador que permite insertar personas desde la vista
 *
 * @author Yeison Cifuentes
 * @version 1.0.0
 */
public class InsertarPersona implements ActionListener {

    /**
     * Lista de las personas que son agregadas 
     */
    private List<Persona> personas;
    /**
     * Vista de la aplicación
     */
    private Ventana ventana;

     /**
      * Metodo constructor de la clase
      * @param personas lista de personas que seran agregadas 
      * @param ventana vista principal de la aplicacion
      */
    public InsertarPersona(List<Persona> personas, Ventana ventana) {
        this.personas = personas;
        this.ventana = ventana;
        this.ventana.agregar.addActionListener(this);
    }

    /**
     * Metodo que se dispara cuando el boton es presionado
     * @param evento evento de la vista
     */
    public void actionPerformed(ActionEvent evento) {

        DefaultListModel modelo = new DefaultListModel();//Modelo para insertar los datos en el JList

        this.personas.add(new Persona(ventana.nombre.getText()));

        for (Persona persona : this.personas) {

            modelo.addElement(persona.getNombre());
        }
        ventana.listado.setModel(modelo);//Añade el modelo al JList
    }
}
