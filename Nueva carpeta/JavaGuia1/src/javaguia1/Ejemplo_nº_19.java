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
public class Ejemplo_nº_19 {
 /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
    public static void main(String[] args){
        
    Scanner leer = new Scanner(System.in);

   int [][] Matriz = new int [3][3];
   int [][] Matrizt = new int [3][3];
   boolean traspuesta=true;

    for(int i=0 ; i<=2 ; i++ ){
     for(int j=0 ; j<=2 ; j++ ){
       Matriz[i][j]= leer.nextInt() ;
    
 }
 }
 for(int i=0 ; i<=2 ; i++ ){
    for(int j=0 ; j<=2 ; j++ ){
        System.out.print(Matriz[i][j]+" ");
    }    
    System.out.println("");
    }
    
    
 for(int j=0 ; j<=2 ; j++ ){
    for(int i=0 ; i<=2 ; i++ ){
       Matrizt[j][i]= Matriz[i][j] ;
    
 }
 }
 for(int i=0 ; i<=2 ; i++ ){
    for(int j=0 ; j<=2 ; j++ ){
        System.out.print(Matrizt[i][j]+" ");
    }    
    System.out.println("");
    }
 
 for(int i=0 ; i<=2 ; i++ ){
    for(int j=0 ; j<=2 ; j++ ){
    
         if (Matriz[i][j] != -(Matrizt[i][j])){
             traspuesta=false;
         }  
 
        
    }
 }
        System.out.println("La Matriz traspuesta es antisimetrica "+ traspuesta);
 }
}   

