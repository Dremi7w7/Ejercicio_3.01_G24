/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



/**
 *
 * @author Dremi7w7
 */
public class Ventana_1 extends JFrame{
        //Tamaño de la ventana
        public Ventana_1(){
        setSize(235,155);
        //Metodo para cerrar el programa
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Titulo de la ventana
        setTitle("BorderLayout");
        //Posicion de la ventana
        setLocation(400,200);
        //Llamar metodo
        Componente_1(); 
    }
        
        //Agregar panel y etiquetas 
        private void Componente_1(){
        JPanel panel_1= new JPanel();
        this.getContentPane().add(panel_1);
            
            //Crear borde y separar el borde del frame 
            panel_1.setLayout(new BorderLayout(5,5)); 
            panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
            
            //Etiquetas
            JLabel etiqueta1_1= new JLabel();
            JLabel etiqueta1_2= new JLabel();
            JLabel etiqueta1_3= new JLabel();
            JLabel etiqueta1_4= new JLabel();
            JLabel etiqueta1_5= new JLabel();
            
            //Mensajes de las etiquetas
            etiqueta1_1.setText("Button 1");
            etiqueta1_2.setText("Button 2");
            etiqueta1_3.setText("Button 3");
            etiqueta1_4.setText("Long-Named Button 4");
            etiqueta1_5.setText("Button 5");
            
            //Bordes de las etiquetas          
            etiqueta1_1.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta1_2.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta1_3.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta1_4.setBorder(BorderFactory.createLineBorder(Color.black));
            etiqueta1_5.setBorder(BorderFactory.createLineBorder(Color.black));

            //Centrar los mensajes en los bordes
            etiqueta1_1.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta1_2.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta1_3.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta1_4.setHorizontalAlignment(SwingConstants.CENTER);
            etiqueta1_5.setHorizontalAlignment(SwingConstants.CENTER);
            
            //Agregar etiquetas al panel y ubicacion en los bordes
            panel_1.add(etiqueta1_1,BorderLayout.NORTH);
            panel_1.add(etiqueta1_2,BorderLayout.CENTER);
            panel_1.add(etiqueta1_3,BorderLayout.WEST);
            panel_1.add(etiqueta1_4,BorderLayout.SOUTH);
            panel_1.add(etiqueta1_5,BorderLayout.EAST);
                 
        }

}
