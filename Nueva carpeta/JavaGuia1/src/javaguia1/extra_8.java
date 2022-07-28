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
public class extra_8 {
    
public static void main(String[] args) {
        
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
        
        Scanner leer= new Scanner(System.in);
        
        int num=0;
        int par=0;
        int impar=0;
        int cant=0;
        
        do{
            num= leer.nextInt();
            if(num>0){
                cant++;
            
            if((num%5)==0) break;
                if((num%2)==0){
                    par++;
                    
                }else impar++;
                
            }    
        }while((num%5)!=0);
        
        System.out.println("La cantidad de pares es: " + par);
        System.out.println("La cantidad de impares es: " + impar);
        System.out.println("La cantidad de numeros es: " + cant);
        
    }
}
