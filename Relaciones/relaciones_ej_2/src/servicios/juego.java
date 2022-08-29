/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.jugador;
import entidades.revolver;
import java.util.ArrayList;

/**
 *
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó
 */
public class juego {
    private  ArrayList<jugador>  participantes = new ArrayList(); 
    private  revolver arma ; 

    public juego() {
    }

    public ArrayList<jugador> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<jugador> participantes) {
        this.participantes = participantes;
    }

    public revolver getArma() {
        return arma;
    }

    public void setArma(revolver arma) {
        this.arma = arma;
    }

    
    
    public void llenarJuego(ArrayList<jugador> jugadores, revolver r){
            this.arma = r;     
            this.arma.llenarRevolver();
            this.participantes = jugadores;
    }
    
    
    public boolean  ronda(){
        boolean fin = false;
        int     turno = 1; 
        int     tambor  = 1; 
        jugador  aux ; 
        //for (jugador aux : participantes){            
                
              
        do {
           aux = participantes.get((turno-1));            
           if (turno >= participantes.size()){
                turno = 1;
            }else {
                turno++;
            }
            //System.out.println( " Jugador "+  turno) ; 
            if (!arma.mojar()) {
                System.out.println( aux.getNombre()  + " ESTA SECO");
                arma.siguienteChorro();
            }else {
                System.out.println( aux.getNombre()  + " SE MOJO");
                fin = true;
                break;
            }       
        } while (!fin)  ;
        return (fin); 
    }
}
