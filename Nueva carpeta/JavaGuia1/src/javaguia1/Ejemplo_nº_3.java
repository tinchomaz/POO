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
public class Ejemplo_nº_3 {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
    Scanner leer=new Scanner(System.in);
    String palabra=leer.nextLine();
        System.out.println("en minusculas "+palabra.toLowerCase()+ " en mayusculas "+ palabra.toUpperCase() );
    }
    
}
