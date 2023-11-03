/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author node
 */
public class Main {
    public static void main(String[] args) {
        
        
        Empleado e = new Empleado();
        Empleado a = new Empleado();
        
        e.run();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(e.getResultados()[i][i]);
            if(i==4){
                break;
            }
            System.out.print(" vs "+e.getResultados()[i][i+1]+"\n");
            
        }
        
    }
    
    
    
    
    
}
