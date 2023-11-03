/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones.municipales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author node
 */
public class Urna {
    private Partido[] partidos;

    public Urna() {
       this.partidos = new Partido[5];
       partidos[0] = new Partido("ROJO");
       partidos[1] = new Partido("VERDE");
       partidos[2] = new Partido("AZUL");
       partidos[3] = new Partido("ROSA");
       partidos[4] = new Partido("NEGRO");
    }
    
    
    public void votar(Partido p) throws PartidoNotFoundExeception{
        int i = 0;
        while (!p.equals(partidos[i])) {            
            i++;
            if(i>=partidos.length){
                throw new PartidoNotFoundExeception(p);
            }
        }
        partidos[i].votar();
        
    }
    
    public Partido[] getPartidos(){
        
        return this.partidos.clone();
    }
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder("Resultados/n");
        
        Comparator<Partido> c = (Partido p1, Partido p2) -> p2.getVotos()-p1.getVotos();
        Arrays.sort(partidos,c);
        int totalVotos = 0;
        int maxVotos = 0;
        List<Partido> ganadores = new ArrayList();
        for(Partido p:partidos){
           sb.append(p);
           sb.append("\n");
           totalVotos+=p.getVotos();
           if(p.getVotos()>=maxVotos){
               ganadores.add(p);
               maxVotos = p.getVotos();
           }
        }
        
        sb.append("Total votos:  ");
        sb.append(totalVotos);
        
        if(ganadores.size()==1){
            sb.append("Ganador:  ");
            sb.append(ganadores.get(0));
        }else{
            sb.append("Empatados: ");
            for(Partido p:ganadores){
                sb.append(p);
                sb.append(" ");
            }
        
                    }
        
        return sb.toString();
    }
}
