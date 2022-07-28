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
public class Ejemplo_nº_6 {
    
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Crear un programa que dado un numero determine si es par o impar./
    Scanner leer=new Scanner(System.in);
    int num=leer.nextInt();
    if (num%2==0){
        System.out.println("el numero "+num+" es par");
    }else{
        System.out.println("el numero es impar");
    }
    }
    
}
