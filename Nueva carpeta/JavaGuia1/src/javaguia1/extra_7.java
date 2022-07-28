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
public class extra_7 {
    
public static void main(String[] args) {
        
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros");
        int num= leer.nextInt();
        int suma=0;
        int i=0;
        int max=0;
        int min=999;
        int valor=0;
        
        while(i<num){
            valor= leer.nextInt();
            i++;
            suma=suma+valor;
            if(valor<min){
                min=valor;
                
            }
            if(valor>max){
                max=valor;
            }
                    
            
        }
        System.out.println("El valor maximo es: "+ max);
        System.out.println("El valor minimo es: "+ min);
        System.out.println("El promedio de numeros ingresados es: "+ suma/num);
        
        i=0;
        suma=0;
        max=0;
        min=999;
        valor=0;
                
                
        do{
            valor= leer.nextInt();
            i++;
            suma=suma+valor;
            if(valor<min){
                min=valor;
                
            }
            if(valor>max){
                max=valor;
            }
        }while(i<num); 
            
        System.out.println("El valor maximo es: "+ max);
        System.out.println("El valor minimo es: "+ min);
        System.out.println("El promedio de numeros ingresados es: "+ suma/num);
     }
}
