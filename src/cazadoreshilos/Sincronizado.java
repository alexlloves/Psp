/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cazadoreshilos;

/**
 *
 * @author node
 */
public class Sincronizado {
    int contador = 0;

    public Sincronizado(int contador) {
        this.contador = contador;
    }
    
    
    public synchronized void contador() throws InterruptedException{
              Thread.sleep(2000);

        contador++;
    }
    
    
    
    
    
    
    
    
    
    
}
