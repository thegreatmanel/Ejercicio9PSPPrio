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
public class Prio4 extends Thread {
//aqui cojo los numeros que están como num1 y num2 y los uso para hacer calculos que guardo como num4 para mostrar
    String nombre;

    public Prio4(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void run() {
        
            int num4 = 0;
            num4 = Prio.num1 + Prio2.num2;

            System.out.println("(T4)Suma de T1 y T2= " + num4);
        
    }

}
