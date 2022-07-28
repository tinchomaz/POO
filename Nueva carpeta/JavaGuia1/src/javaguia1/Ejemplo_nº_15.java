/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

/**
 *
 * @author serus
 */
public class Ejemplo_nº_15 {
    
    /**
    15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[]  Vector = new int[100];
        //for(int i = 0; i<=99 ; i++){        
        for(int i = 0; i< Vector.length ; i++){        
            Vector[i]= i+1; 
        };
        System.out.println("-------------------");
        for(int i = 99; i>=0 ; i--){
            System.out.println("Vector["+i+"]="+ Vector[i]);           
        };
    }
    
}
