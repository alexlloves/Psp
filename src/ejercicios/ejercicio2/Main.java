/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author node
 */
public class Main {

    public static final int NUM_HILOS = 5;

    public static void main(String[] args) throws InterruptedException {
        Hilo[] hilos = new Hilo[NUM_HILOS];
        Contador c = new Contador();
        Hilo h=null;
        
        
        for(int i=0;i<NUM_HILOS;i++){
        hilos[i] = new Hilo(c);
        hilos[i].start();
       
        }
        //PARA QUE SE EJECUTEN EN PARALELO
        for(int i=0;i<NUM_HILOS;i++){
        hilos[i].join();
       
        }
        
        System.out.println("c ="+c.getContador());
    
    
    
    }
    
    
}
