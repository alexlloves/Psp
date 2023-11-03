/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llegajefe;

/**
 *
 * @author node
 */
public class Main {
        public final static int MAX_EMPLEADOS = 10;
    public static void main(String[] args) {
        
        Oficina o = new Oficina();
        
        for (int i = 0; i <MAX_EMPLEADOS; i++) {
          Empleado e = new Empleado("Emp "+i, o);
          e.start();
        }
        
        Empleado jefe = new Empleado("Jefe",o, true);
        jefe.start();
        
        
        
        
        
        
        
        
    }
    
}
