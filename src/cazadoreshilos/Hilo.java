/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cazadoreshilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node
 */
public class Hilo extends Thread{
    Sincronizado s;
    public Hilo(Sincronizado s) {
        this.s = s;
    }
    
    
    public boolean isBloqueado(){
        return getState().equals(Thread.State.BLOCKED);
    }
    
    public boolean isSleep(){
        return getState().equals(Thread.State.TIMED_WAITING);
    }
    
    
    
    @Override
    public void run(){
        s.contador();
        try {
            Thread.sleep(2000);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
