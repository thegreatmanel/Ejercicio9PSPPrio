/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9psp;

/**
 *
 * @author juchafernandez
 */
public class Prio2 extends Thread{
    //aqui comparto num2
    String nombre;
    static int num2 = 0;

    public Prio2(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void run() {
     
            //aqui hago los calculos y lo guardo como num2 para mostrar
            for (int i = 0; i < 1000; i++) {
                if (i % 5 == 0) {
                    num2 = num2 + i;
                }
               
            }
        
 System.out.println("(T2)Suma de multiplos de 5= " + num2);
    }
    
}
