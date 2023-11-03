/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones.municipales;

import java.util.Objects;


/**
 *
 * @author node
 */
public class Partido implements Cloneable{
    private String nombre;
    private Integer votos;
    
    public Partido(String nombre){
        this.nombre = nombre;
        this.votos = 0;
    }
    private Partido(String nombre, Integer votos){
        this.nombre = nombre;
        this.votos = votos;
    }
    
    //RECURSO COMPARTIDO, PROTEGER
    
    public synchronized void votar(){
        this.votos++;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.votos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partido other = (Partido) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.votos, other.votos);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    @Override
    public String toString() {
        return this.nombre +"("+this.votos+" votos)";
    }
    
    public Object clone(){
        
        
        return new Partido(this.nombre,this.votos);
        
    }
    
    
   
}
