    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

import java.util.Scanner;

/**
 *
 * @author serus
 */
public class Ejemplo_nº_16 {
    
/**
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
     * @param args
     */
    public static void main(String[] args) {
        Scanner   leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a tratar:");
        int  Dimension = leer.nextInt();
        int  [] Vector = new int[Dimension];
        for (int i=0; i< Vector.length ; i++) {
             Vector[i] =  (int) (Math.random() * 10 ); 
        }
        
        for (int i=0; i< Vector.length ; i++) {
                        System.out.println( Vector[i]);              
                }
        
        System.out.println("Ingrese el valor a buscar :");
        int numero = leer.nextInt();
              
        
        for (int i=0; i< Vector.length ; i++) {
            if (numero == Vector[i]) {
                System.out.println( "valor en posicion :" + i);             
            }            
        }
    }
    
}
