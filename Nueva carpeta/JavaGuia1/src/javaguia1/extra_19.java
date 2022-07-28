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
public class extra_19 {
    
   /**
9. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
     */
    public static void main(String[] args) {
    //int [] vector1 ;
    //int [] vector2 ;
    
    int [] vector1 = {10,24,26,76,66,44};
    int [] vector2 = {10,24,26,76,66,44};
    
    
    boolean  iguales = true ; 
    for  (int i = 0 ; i< vector1.length; i++ ){
        if (vector1[i] != vector2[i]) {
            iguales = false;
            break;
        } 
    }
    System.out.println("Las dos matrices son " +  ( (iguales== true )? "Iguales" : "Distintos" )  );    
    }
    
}
