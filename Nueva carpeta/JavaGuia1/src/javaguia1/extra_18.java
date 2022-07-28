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
public class extra_18 {
    
   /**
     18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector ;
        int n =0 ;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n]; 
        int sumador = 0; 
        for (int i = 0 ; i < n ; i++ ){
            System.out.println("Ingrese el  valor para  :"+i ) ; 
            vector [i] = leer.nextInt();
            sumador = sumador +  vector [i] ; 
            //sumador += vector [i] ; 
        }        
        //System.out.println("La suma de sus valores es : " + String.valueOf(sumador)  ) ; 
        System.out.println("La suma de sus valores es : " + sumador  ) ;         
    }    
}
