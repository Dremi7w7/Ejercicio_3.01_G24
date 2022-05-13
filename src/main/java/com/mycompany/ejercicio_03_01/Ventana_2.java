/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


/**
 *
 * @author Dremi7w7
 */
public class Ventana_2 extends JFrame {
        public Ventana_2(){
        setSize(340,155);
        //Metodo para cerrar el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titulo de la ventana
        setTitle("GridLayout");
        //Posicion de la ventana
        setLocation(625,200);
        //Llamar metodo
        Componente_2(); 
    }
        
        //Agregar panel y etiquetas 
        private void Componente_2(){
        JPanel panel_2= new JPanel();
        this.getContentPane().add(panel_2);
            
            //Agregar filas, columnas y la separacion entre cada elemento
            panel_2.setLayout(new GridLayout(3,2,5,5));
            
            //Etiquetas
            JLabel etiqueta2_1= new JLabel();
            JLabel etiqueta2_2= new JLabel();
            JLabel etiqueta2_3= new JLabel();
            JLabel etiqueta2_4= new JLabel();
            JLabel etiqueta2_5= new JLabel();
            
            //Mensajes de las etiquetas
            etiqueta2_1.setText("Button 1");
            etiqueta2_2.setText("2");
            etiqueta2_3.setText("Button 3");
            etiqueta2_4.setText("Long-Named Button 4");
            etiqueta2_5.setText("Button 5");
            
            //Bordes de las etiquetas          
            etiqueta2_1.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta2_2.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta2_3.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta2_4.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta2_5.setBorder(BorderFactory.createLineBorder(Color.black));

            //Centrar los mensajes en los bordes
            etiqueta2_1.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta2_2.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta2_3.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta2_4.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta2_5.setHorizontalAlignment(SwingConstants.CENTER);
            
            //Agregar etiquetas al panel
            panel_2.add(etiqueta2_1);
            panel_2.add(etiqueta2_2);
            panel_2.add(etiqueta2_3);
            panel_2.add(etiqueta2_4);
            panel_2.add(etiqueta2_5);    
        }
}
