/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.jugador;
import entidades.revolver;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.juego;

/**
 *
 * @author vluce
 */
public class principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    ArrayList<jugador> lista = new ArrayList(); 
    revolver arma = new revolver(); 
    Scanner  leer  = new Scanner(System.in); 
    juego    jgo = new juego(); 
    int  cantidad ; 
        System.out.println("Ingrese la cantidad de jufagores  (1-6) ");
        cantidad = leer.nextInt(); 
        if (cantidad < 1  ||  cantidad > 6 ) {
            cantidad = 6; 
        }
        for (int  i = 0 ; i< cantidad   ; i++){
            jugador aux =  new jugador() ; 
            aux.setId(i);
            aux.setMojado(false);
            aux.setNombre( " Jugador nro_" + (i+1) );
            lista.add(aux);
        };
        
        jgo.llenarJuego(lista, arma);
        
        System.out.println(jgo.getArma().toString() ) ;
        boolean rta ; 
        
        rta = jgo.ronda();  
        
    
    }
    
}
