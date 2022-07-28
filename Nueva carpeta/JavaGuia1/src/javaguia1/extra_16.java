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
public class extra_16 {
    
    /**
     * @param args the command line arguments
     * 16. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese  la cantidad de personas a comparar ");
        int   cant  = leer.nextInt();
        int   menores = 0; 
        int i ; 
        String opcion ; 
        boolean  finalizar = false ;
        for ( i = 1 ; i <= cant; i++){
            menores+= leerPersona(i);
            System.out.println("Desea continuar?  ( S/N)  ");
            opcion = leer.next() ; 
            if (opcion.equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cantidad de personas leidas: " + i );
        System.out.println("Cantidad de menores : " + menores );
    }
    
    
     public static int leerPersona( int p ) {
            Scanner leo = new Scanner(System.in);
            System.out.println("ingrese el nombre de la  persona : " +  p  );
            String  nombre  = leo.next();
            System.out.println("ingrese la edad de la persona  "   );
            int  edad = leo.nextInt();
            if ( edad < 18 ) {
                return(1);
            } else {
                return (0);
            }         
     }
   }