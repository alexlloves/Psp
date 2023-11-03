/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author node
 */
public class Apuesta {
    public static final int MAX_APUESTAS = 5;
    public static final int PRECIO_APUESTA = 1;
    public static final int MAX_GOLES = 4;
    Empleado a;
    Random r = new Random();
    public Integer resultadoEquipoA;
    public Integer resultadoEquipoB;
    HashMap<Integer, Integer> aciertos = new HashMap();
    
    public Apuesta() {
        
     resultadoEquipoA = r.nextInt(MAX_GOLES+1);
     resultadoEquipoB = r.nextInt(MAX_GOLES+1);
    
    }
    
    
    public HashMap<Integer,Integer> comprobarApuesta(ArrayList<Empleado> empleados){
        int r = 0;
        int t = 0;
        for (int i = 1; i < empleados.size(); i++) {
            while( t<MAX_APUESTAS){
            if(empleados.get(1).resultados[r][r]==resultadoEquipoA && empleados.get(1).resultados[r][i]==resultadoEquipoB){
                int numaciertos = 0;
                numaciertos++;
                aciertos.put(i,numaciertos);
            }
                t++;
            }   
                
        }
            
            return aciertos;
        }
            
        
        
               
        
        
    }
    
    




    

