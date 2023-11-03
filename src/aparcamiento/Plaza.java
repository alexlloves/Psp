/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparcamiento;

/**
 *
 * @author node
 */
public class Plaza {
    
    private boolean estado;
    
    
    
    
    public Plaza(){
        this.estado = false;
    }
    
    
    
    
    public synchronized void ocupar() throws InterruptedException{
        while(estado){
            wait();
        }
        this.estado = true;
        notify();
    }
    
    public synchronized void desocupar() throws InterruptedException{
        while(!estado){
            wait();
        }
        this.estado = false;
        notify();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
