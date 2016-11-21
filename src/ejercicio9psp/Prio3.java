/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9psp;

import javax.swing.JOptionPane;

/**
 *
 * @author juchafernandez
 */
public class Prio3 extends Thread{
    String nombre;

    public Prio3(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    
    @Override
    //aqui solo hago calculos y guardo como acumulador sin compartir ya que no lo necesitaré y lo muestro
    public void run() {
       int num3 = 0;
   num3=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
       int acumulador=1;     
            for (int i = 1; i <=num3; i++) {
                acumulador*=i;
                
               
            } 
            System.out.println("(T3)Factorial= " + acumulador);
        

    }
    
}
