/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

/**
 *
 * @author serus
 */
public class Ejemplo_nº_18 {
    

    /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
   
 public static void main(String[] args) {
int [][] Matriz = new int [4][4];
    
for(int i=0 ; i<=3 ; i++ ){
    for(int j=0 ; j<=3 ; j++ ){
    Matriz[i][j]= (int)(Math.random() *10);
    
 }
 }
 for(int i=0 ; i<=3 ; i++ ){
    for(int j=0 ; j<=3 ; j++ ){
        System.out.print(Matriz[i][j]+" ");
        
    }
     System.out.println("");
     
     }  
     System.out.println("---------------- ");
 
 for(int i=0 ; i<=3 ; i++ ){
    for(int j=0 ; j<=3 ; j++ ){
        System.out.print(Matriz[j][i]+" ");
 
    }
         System.out.println("");
 }
}
}
