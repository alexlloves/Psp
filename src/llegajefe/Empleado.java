/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llegajefe;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node
 */
public class Empleado extends Thread{
    private Oficina oficina;
    private boolean esJefe;
    public final static int MAX_ESPERA = 3000;
    public Empleado(String nombre,Oficina o){
        super(nombre);
        this.oficina = o;
        this.esJefe = false;
    }
    
    
    public Empleado(String nombre,Oficina o, boolean esJefe){
        super(nombre);
        this.oficina = o;
        this.esJefe = esJefe;
    }
    
    public boolean isJefe(){
        return esJefe;
    }
    
    public void run(){
        try {
            Random r = new Random();
            
            Thread.sleep(r.nextInt(MAX_ESPERA));
            oficina.entra(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
