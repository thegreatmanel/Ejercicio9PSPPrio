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
public class Ejercicio9PSP {

    /**
     * @param args the command line arguments
     */
    //aqui asigno prioridades a los threads poniendo en este orden: el factorial, la suma de 3, la de 5 y la total y los inicio
    public static void main(String[] args) {
        // TODO code application logic here
        Prio Fio1=new Prio("suma1");
        Prio2 Fio2=new Prio2("suma2");
        Prio3 Fio3=new Prio3("factorial");
        Prio4 Fio4=new Prio4("sumatot");
 Fio1.setPriority(2);
 Fio2.setPriority(3);
 Fio3.setPriority(4);
 Fio4.setPriority(1);
 Fio1.start();
 Fio2.start();
 Fio3.start();
 Fio4.start();
    }}

   

