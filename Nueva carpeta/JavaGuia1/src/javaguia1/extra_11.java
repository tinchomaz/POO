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
public class extra_11 {
 /**
     * @param args the command line arguments
     * 11. Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados.
     */
    public static void main(String[] args) {
       Scanner  leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
       int  valor = leer.nextInt();
       int  digito = 0; 
       int cont= 1;
       while ( valor >=  10) {
           cont++;
           valor = (int) valor / 10 ;           
       }
        System.out.println("Cantidad de  digitos:" + cont);    
    }    
}   

