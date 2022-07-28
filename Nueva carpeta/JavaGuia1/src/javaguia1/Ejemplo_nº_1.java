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
public class Ejemplo_nº_1 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma*/
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num= leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("la suma de ambos numeros es "+ (num+num2));
    }
    
}
