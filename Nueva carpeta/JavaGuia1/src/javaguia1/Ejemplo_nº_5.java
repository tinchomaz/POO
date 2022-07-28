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
public class Ejemplo_nº_5 {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
    Scanner leer=new Scanner(System.in);
    float num=leer.nextFloat();
    float doble=num*2;
    float triple=num*3;
    float raiz= (float)Math.sqrt(num);
        System.out.println(doble+" "+triple+" "+raiz);
    }
    
}
