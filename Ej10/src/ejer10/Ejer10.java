/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import java.util.Arrays;

/**
 *
 * @author vluce
 */
public class Ejer10 {

    /**
     * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20.
     */
    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        llenarVector(vectorA);
        mostrar(vectorA);
        ordenar(vectorA);       
        mostrar(vectorA);             
        //ctorB = Arrays.copyOfRange(vectorA, 0, 11);
        for (int i = 0; i < 10 ; i++){
            vectorB[i]= vectorA[i]; 
        };        
        mostrar(vectorB);    
        for (int i = 10 ; i < vectorB.length ; i++){
            vectorB[i]= (double) 0.5;
        };
        System.out.println("----------------------------------------------");
        mostrar(vectorA);            
        mostrar(vectorB);    
    }
    
    /*----------------------------------------------------------------------------*/  
    
     public static  void llenarVector( double[]  vec ){
         for (int i = 1 ; i < vec.length ; i++) {
             vec[i] =    Math.random() * 90;
         }
     } 
     
     public static  void mostrar( double[]  vec ){
         for (int i = 1 ; i < vec.length ; i++) {
             System.out.print(vec[i]+ " " ) ; 
         }
         System.out.println("");
     } 
     public static  void ordenar( double[]  vec ){
         Arrays.sort(vec);
         
     }
}
