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
public class extra_20 {
    
    /**
     * @param args the command line arguments
     * 20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
           parámetro. Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        int []  vector = new int [10];
        llenarVector(vector);
        veoVector(vector);         
    }
    
    
    public static void llenarVector(int [] vec ) {
    for (int i =0 ; i < vec.length ; i++){
        vec[i] =   (int) ( Math.random() *  20);
    }
}
    public static void veoVector(int [] vec ) {
    for (int i =0 ; i < vec.length ; i++){
        System.out.print(vec[i] + " ");        
    }
    }

}

   