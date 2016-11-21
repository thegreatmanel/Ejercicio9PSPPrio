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
public class Prio extends Thread {
//aqui comparto el num1 con el resto de clases
    String nombre;
    static int num1 = 0;

    public Prio(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void run() {
//hace los calculos matemáticos y lo guarda como num1 para mostrar
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                num1 = num1 + i;
            }
            
        }System.out.println("(T1)Suma de multiplos de 3= " + num1);

    }
}
