/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cazadoreshilos;

/**
 *
 * @author node
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.State estado = null;
        Thread.State estado2 = null;
        Sincronizado s = new Sincronizado(0);
        Hilo n = new Hilo(s);
        estado = n.getState();
        Hilo a = new Hilo(s);
        estado2 = a.getState();
        
        
        System.out.println(n.getState());
        n.start();
        a.start();
//        if (n.isBloqueado()) {
//            System.out.println(n.getState());
//        }
//        if (a.isBloqueado()) {
//            System.out.println(a.getState());
//        }
//        
//        System.out.println(n.getState());
//        n.join();
//        System.out.println(n.getState());
        int i = 0;
        while(!estado.equals(Thread.State.TERMINATED)){
            Thread.State aux;
            Thread.State aux2;
            aux = estado;
            aux2 = estado2;
            estado2 = a.getState();
            estado = n.getState();
            
            
            if(!aux.equals(estado)){
                System.out.println("n: "+estado);
            }
             
            if(!aux2.equals(estado2)&&estado2.equals(Thread.State.BLOCKED)){
                System.out.println("a: "+estado2);
                aux2 = null;
            }
            
           
            
            
            i++;
        }
        
        
    

    }
}
