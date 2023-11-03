/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node
 */
public class Empleado extends Thread{
    public static final int MAX_APUESTAS = 5;
    public static final int TIEMPO_ESPERA_MIN=300;
    public static final int TIEMPO_ESPERA_MAX=500;
    int[][] resultados;

    public Empleado() {
        this.resultados = new int[MAX_APUESTAS-1][MAX_APUESTAS-1];
    }

    public int[][] getResultados() {
        return resultados;
    }

    public void setResultados(int[][] resultados) {
        this.resultados = resultados;
    }
    
   
    
    
    
    
    public void run(){
        Random r = new Random();
        Random a = new Random();
        int i = 0;
        while(i < MAX_APUESTAS){
            try {
                resultados[i][i] = r.nextInt(5);
                if(i==4){
                    break;
                }
                resultados[i][i+1] = r.nextInt(5);
                
                Thread.sleep(TIEMPO_ESPERA_MIN,TIEMPO_ESPERA_MAX);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        
    }
}
