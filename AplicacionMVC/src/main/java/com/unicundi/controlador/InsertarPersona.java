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
 *
 * @author YEISON
 */
public class InsertarPersona implements ActionListener {

    private List<Persona> personas;
    private Ventana ventana;

    public InsertarPersona(List<Persona> personas, Ventana ventana) {
        this.personas = personas;
        this.ventana = ventana;
        this.ventana.getAgregar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        DefaultListModel modelo = new DefaultListModel();//Modelo para insertar los datos en el JList

        this.personas.add(new Persona(ventana.getNombre().getText()));

        for (Persona persona : this.personas) {

            modelo.addElement(persona.getNombre());
        }
        ventana.getListado().setModel(modelo);//Añade el modelo al JList
    }
}
