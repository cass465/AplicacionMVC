/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.graficas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Clase que tiene los componentes y configuracion de la vista
 *
 * @author Camilo Sanabria
 * @version 1.0.0
 */
public class Ventana extends JFrame {

    /**
     * Panel de la vista
     */
    private JPanel panel;
    /**
     * Campo de texto que recibe el nombre
     */
    public JTextField nombre;
    /**
     * lista que muestra los nombres de las personas
     */
    public JList listado;
    /**
     * Boton que agrega a las personas
     */
    public JButton agregar;

    /**
     * Constructor de la vista
     * @param titulo recibe el titulo de la ventana
     */
    public Ventana(String titulo) {
        super(titulo);
        this.iniciar();
        this.configurarComponentes();
        //this.asignarEventos();

        this.pack();
        this.setVisible(true);
    }

    /**
     * Inicia la ventana
     */
    public void iniciar() {
        Dimension dims = new Dimension(600, 220);
        this.setSize(dims);
        this.setPreferredSize(dims);
        this.setLocationRelativeTo(null); // ejecuta el Frame en el centro de la pantalla
        this.setResizable(false); // no se puede redimensionar el grame
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Configuración de todos los componentes dentro de la ventana
     */
    private void configurarComponentes() {
        // crear panel
        panel = new JPanel(new GridBagLayout());
        panel.setBorder(new TitledBorder(""));

        // componentes panel
        nombre = new JTextField();
        agregar = new JButton("AGREGAR");
        listado = new JList();
        JScrollPane listadoDesplazamiento = new JScrollPane(listado); //Crea un scroll para el JList
        

        GridBagConstraints gbc = new GridBagConstraints();
        Insets insets = new Insets(5, 5, 5, 5);
        gbc.insets = insets;
        gbc.gridwidth = 5; // cuantas columnas coge
        gbc.gridheight = 1; // cuantas filas coge
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nombre, gbc);
        
        gbc.gridwidth = 1; // cuantas columnas coge
        gbc.gridheight = 1; // cuantas filas coge
        gbc.gridx = 5;
        gbc.gridy = 0;
        panel.add(agregar, gbc);
        
        gbc.gridwidth = 6; // cuantas columnas coge
        gbc.gridheight = 1; // cuantas filas coge
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(listadoDesplazamiento, gbc);
        
        this.add(panel, BorderLayout.NORTH);
    }
}
