/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package llegajefe;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.Soundbank;

/**
 *
 * @author node
 */
public class Oficina {
    private boolean estaJefe;

    public Oficina() {
        this.estaJefe = false;
    }
    
    
    
    public synchronized void entra(Empleado p){
        
        if(p.isJefe()){
            System.out.println("EL JEFE HA LLEGADO");
            estaJefe = true;
            notifyAll();
        }else{
            if(!estaJefe){
                try {
                    System.out.println(p.getName()+" He llegado. ZZzzzzz");
                    wait();
                        System.out.println(p.getName()+" Hola jefe, aqui estoy trabajando");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Oficina.class.getName()).log(Level.SEVERE, null, ex);
                }
                       
            }else{
                System.out.println(p.getName()+" Hola, jefe me pongo a trabajar.");
                
            }
        }
        
        
    }
    
}
