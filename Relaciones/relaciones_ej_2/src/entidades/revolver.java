/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
public class revolver {
    private  int posicionActual; 
    private  int posicionAgua; 
    
    public void     llenarRevolver() {
        posicionActual =  (int) (Math.random()* 6)+1 ; 
       // posicionActual =  1 ; 
        posicionAgua   =  (int) (Math.random()* 6)+1 ; 
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }
    
    public boolean  mojar() {
        return ( posicionActual == posicionAgua  ) ; 
    }
    
    public void siguienteChorro(){
        if(posicionActual == 6 ){
            posicionActual = 1; 
        }else{  
            posicionActual++; 
        }
    }
    
    public  String toString(){
        return ( "Posicion Actual del tambor = "+ posicionActual + " Posicion del agua :" + posicionAgua  ); 
    }
}
