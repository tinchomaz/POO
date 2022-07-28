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
public class extra_17 {
    
   /**
     17. Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true si es 
primo, sino false.
     */
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        System.out.println("Ingrese el numero entero a controlar");
        int num = leer.nextInt();
        System.out.println("El numero es : "  +  esPrimo(num)  );
    }
    
    public static String esPrimo( int num1) {
        boolean lPrimo = false; 
        int i = num1-1; 
        while( !lPrimo  && i > 1 ){
            if ( ( num1 % i ) == 0 ) {
                lPrimo = true; 
            }
            i--;
        }
        if (!lPrimo) {
            return ("Primo");    
           } else   return ("NO es Primo")    ;
    }
}
