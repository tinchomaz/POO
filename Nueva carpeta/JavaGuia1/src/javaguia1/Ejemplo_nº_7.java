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
public class Ejemplo_nº_7 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java.*/
    Scanner leer=new Scanner(System.in);
    String frase=leer.nextLine();
    if(frase.equalsIgnoreCase("eureka")){
        System.out.println("Correcto");
    }else{System.out.println("Incorrecto");}
}
    
}
