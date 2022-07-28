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
public class Ejemplo_nº_20 {
    
 /*20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    int[][] Matriz=new int [3][3];
    int diagonal0=0;
    int diagonal1=0;
    int columna0=0;
    int columna1=0;
    int columna2=0;
    int fila0=0;
    int fila1=0;
    int fila2=0;
    boolean magico=true;
    for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
           Matriz[i][j]=leer.nextInt();
           System.out.println(magico+"columna");
       }
    }
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(j==0){
           columna0=columna0+Matriz[i][j];
           }else if(j==1){
           columna1=columna1+Matriz[i][j];   
           }else if(j==2){
           columna2=columna2+Matriz[i][j];
           }
           //columnas/
           if(j==i){
               diagonal0=diagonal0+Matriz[i][j];
           }
           if(i+j==2){
               diagonal1=diagonal1+Matriz[i][j];
           }
         /* diagonales*/
          if(i==0){
           fila0=fila0+Matriz[i][j];
           }else if(i==1){
           fila1=fila1+Matriz[i][j];

           }else if(i==2){
           fila2=fila2+Matriz[i][j];
           }
        }
    }
    
    if(columna0!=columna1 || columna0!=columna2){
        magico=false;
    }
    if(diagonal0!=diagonal1){
        magico=false;
    }
    if(fila0!=fila1 || fila0!=fila2){
        magico=false;
    }
    
    for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
           System.out.print(Matriz[i][j]);
       }
        System.out.println("");
    }
        System.out.println(columna0);
        System.out.println(columna1);
        System.out.println(columna2);
        System.out.println(fila0);
        System.out.println(fila1);
        System.out.println(fila2);
        System.out.println(diagonal0);
        System.out.println(diagonal1);
        System.out.println(magico);
    }
    
}
