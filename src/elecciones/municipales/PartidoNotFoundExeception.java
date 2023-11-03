/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elecciones.municipales;

/**
 *
 * @author node
 */
class PartidoNotFoundExeception extends Exception {

    public PartidoNotFoundExeception(Partido p) {
        super(p.getNombre()+"no existe en la lista");
    }
    
}
