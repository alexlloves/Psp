/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio2;

/**
 *
 * @author Lloves
 */
public class Hilo extends Thread {

    public static final int NUM_INCREMENTOS = 10;
    private Contador cont;
    
    public Hilo(Contador cont){
        this.cont = cont;
    }
    
    public void run() {
        for (int i = 0; i < NUM_INCREMENTOS; i++) {
            cont.incrementa();
        }
    }

}
