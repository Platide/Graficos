/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    
    private JLabel resultresta;
    private JLabel label1resta;
    private JLabel label2resta;
    
    private JLabel resultdivision;
    private JLabel label1div;
    private JLabel label2div;
    
    private JLabel resultmul;
    private JLabel label1mul;
    private JLabel label2mul;
    
    private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JTextField dato3;
    private JTextField dato4;
    private JTextField dato5;
    private JTextField dato6;
    private JTextField dato7;
    private JTextField dato8;
    
    private JButton btncalcular;
    private JButton btncalcularresta;
    private JButton btncalculardivision;
    private JButton btncalcularmultiplicacion;
    

    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // alto ancho
        setSize(660, 400); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
        
        resultresta = new JLabel ("Resultado resta");
        label1resta = new JLabel ("Valor 1 resta");
        label2resta = new JLabel ("Valor 2 resta");
    
        resultdivision = new JLabel ("Resultado division");
        label1div = new JLabel ("Valor 1 division");
        label2div = new JLabel ("Valor 2 division");
    
        resultmul = new JLabel ("Resultado multiplicacion");
        label1mul = new JLabel ("Valor 1 multiplicacion");
        label2mul = new JLabel ("Valor 2 multiplicacion");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        dato3 = new JTextField(5);
        dato4 = new JTextField(5);
        dato5 = new JTextField(5);
        dato6 = new JTextField(5);
        dato7 = new JTextField(5);
        dato8 = new JTextField(5);
        btncalcular = new JButton("Calcular");
        btncalcularresta = new JButton("Calcular");
        btncalculardivision = new JButton("Calcular");
        btncalcularmultiplicacion = new JButton("Calcular");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular); 
        ventana.add(result);
        ventana.add(label1resta);
        ventana.add(dato3);
        ventana.add(label2resta); 
        ventana.add(dato4);
        ventana.add(btncalcularresta);
        ventana.add(resultresta);
        ventana.add(label1div);
        ventana.add(dato5);
        ventana.add(label2div);
        ventana.add(dato6);
        ventana.add(btncalculardivision);
        ventana.add(resultdivision);
        ventana.add(label1mul);
        ventana.add(dato7);
        ventana.add(label2mul);
        ventana.add(dato8); 
        ventana.add(btncalcularmultiplicacion);
        ventana.add(resultmul);
       
        //ventana.add(btncalcularresta);
        //ventana.add(btncalculardivision);
        //ventana.add(btncalcularmultiplicacion);

        btncalcular.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btncalcularActionPerformed(evt);
            }
           

            private void btncalcularActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });   
        
        btncalcular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btncalcularActionPerformed2(evt);
            }
        });
         
    }
    
    
    private void btncalcularActionPerformed2(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado Mouse: " + re);
        
        
    }
    
     private void btncalcularActionPerformed3(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
     
     private void btncalcularActionPerformed4(ActionEvent evt) {
        int v1 = Integer.parseInt(dato3.getText()); 
        int v2 = Integer.parseInt(dato4.getText());
        int re = v1-v2;
        result.setText("Resultado: " + re);
    }
     
     private void btncalcularActionPerformed5(ActionEvent evt) {
        int v1 = Integer.parseInt(dato5.getText()); 
        int v2 = Integer.parseInt(dato6.getText());
        int re = v1/v2;
        result.setText("Resultado: " + re);
    }
     
     private void btncalcularActionPerformed6(ActionEvent evt) {
        int v1 = Integer.parseInt(dato7.getText()); 
        int v2 = Integer.parseInt(dato8.getText());
        int re = v1*v2;
        result.setText("Resultado: " + re);
    }

    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}