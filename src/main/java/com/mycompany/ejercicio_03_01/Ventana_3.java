/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Dremi7w7
 */
public class Ventana_3 extends JFrame{
        public Ventana_3(){
        setSize(400,100);
        //Metodo para cerrar el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titulo de la ventana
        setTitle("FlowLayout");
        //Posicion de la ventana
        setLocation(425,350);
        //Llamar metodo
        Componente_3(); 
    }
        //Agregar panel y etiquetas 
        private void Componente_3(){
            JPanel panel_3= new JPanel();
            this.getContentPane().add(panel_3);
            
            //Creacion del flow layout, ubicacion y separacion de cada elemento
            panel_3.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
            
            //Etiquetas
            JLabel etiqueta3_1= new JLabel();
            JLabel etiqueta3_2= new JLabel();
            JLabel etiqueta3_3= new JLabel();
            JLabel etiqueta3_4= new JLabel();
            JLabel etiqueta3_5= new JLabel();
            
            //Mensajes de las etiquetas
            etiqueta3_1.setText("Button 1");
            etiqueta3_2.setText("2");
            etiqueta3_3.setText("Button 3");
            etiqueta3_4.setText("Long-Named Button 4");
            etiqueta3_5.setText("Button 5");
            
            //Bordes de las etiquetas          
            etiqueta3_1.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta3_2.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta3_3.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta3_4.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta3_5.setBorder(BorderFactory.createLineBorder(Color.black));

            //Centrar los mensajes en los bordes
            etiqueta3_1.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta3_2.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta3_3.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta3_4.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta3_5.setHorizontalAlignment(SwingConstants.CENTER);
            
            //Agregar etiquetas al panel
            panel_3.add(etiqueta3_1);
            panel_3.add(etiqueta3_2);
            panel_3.add(etiqueta3_3);
            panel_3.add(etiqueta3_4);
            panel_3.add(etiqueta3_5);
      
        }
}
