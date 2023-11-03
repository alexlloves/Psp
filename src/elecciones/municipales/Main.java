/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones.municipales;

/**
 *
 * @author node
 */
public class Main {
    public static final Integer CENSO = 10000;
    public static void main(String[] args) throws InterruptedException {
        Votante[] electores = new Votante[CENSO];
        Urna urna = new Urna();
        for (int i = 0; i < CENSO; i++) {
            electores[i] = new Votante(urna);
            electores[i].start();
            
        }
        
        
        for (int i = 0; i < CENSO; i++) {
            electores[i].join();
        }
        
        System.out.println(urna);
    }
    
}
