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
public class extra_6 {
 public static void main(String[] args) {
        
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
        Scanner leer= new Scanner(System.in);
        
        int cant=leer.nextInt();
        int altura=0;
        int bajitos=0;
        int general=0;
        int altbaja=0;
        
        
        for(int i=0; i<cant; i++){
            
            altura=leer.nextInt();
            
            if(altura<=160){
                bajitos++;
                altbaja=altbaja+altura;
            }
            general=general+altura;
        }
        
        System.out.println("El promedio de menos de 1.60 es: " + altbaja/bajitos + " y el promedio de estatura general es: " + general/cant );
        
        
    }
}   

