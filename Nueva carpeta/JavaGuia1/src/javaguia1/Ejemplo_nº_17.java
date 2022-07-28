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
public class Ejemplo_nº_17 {
    
 /**
     17. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner   leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector a tratar:");
        int  Dimension = leer.nextInt();
        int  [] Vector = new int[Dimension];
        int  [] Contador = new int[5];
        for (int i=0; i< 5; i++) { 
            Contador[i]=0;
        }
        for (int i=0; i< Vector.length ; i++) {
            if ((i%2) ==0 ) {
                Vector[i] =  (int) (Math.random() * 1000 ); 
            } else  if ((i%3) ==0){
                Vector[i] =  (int) (Math.random() * 10000 ); 
            } else {
                Vector[i] =  (int) (Math.random() * 10 ); 
            }
            
        }
        for (int i=0; i< Vector.length ; i++) {
            if (Vector[i] > 0  && Vector[i] < 10 ) {
                Contador[0]++;
            } else if(Vector[i] >= 10  && Vector[i] < 100) {
                Contador[1]++;       
            } else if(Vector[i] >= 100  && Vector[i] < 1000) {
                Contador[2]++;
            } else if(Vector[i] >= 1000  && Vector[i] < 10000) {
                Contador[3]++;       
            } else if(Vector[i] >= 10000  && Vector[i] < 100000) {
                Contador[4]++;
            }
        }
        System.out.println("----------------------------------");
        for (int i=0; i< Vector.length ; i++) {
            System.out.println( Vector[i]);
        }
        System.out.println("----------------------------------");
        for (int i=0; i< Contador.length ; i++) {
            System.out.println( Contador[i]);
        }
    }
    
}
