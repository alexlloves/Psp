/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones.municipales;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author node
 */
public class Votante extends Thread {

    public final static Integer REFLEXION_MAX = 500;
    private Urna urna;
    public Votante(Urna urna) {
    this.urna = urna;
    }

    public void run() {
        Random r = new Random();
        try {
            Thread.sleep(r.nextInt(REFLEXION_MAX));
           Partido[] pars = urna.getPartidos();
           urna.votar(pars[r.nextInt(pars.length)]);
        } catch (InterruptedException ex) {
            Logger.getLogger(Votante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PartidoNotFoundExeception ex) {
            Logger.getLogger(Votante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
