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
public class extra_10 {
    
 /**
     * @param args the command line arguments
     * 10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
* 
     */
    public static void main(String[] args) {
        Scanner  leer = new Scanner(System.in);
        int valor1 = (int)( Math.random() * 10 );        
        int valor2 = (int) (Math.random() * 10 );
        System.out.println("Ingrese un valor que estima: ");
        int valor = valor1 * valor2; 
        System.out.println( " <" + valor + ">" ) ;
        int estima = 0;
        boolean encontrado  = false; 
        while (!encontrado) {
            estima =  leer.nextInt();
            if( estima == valor){
                System.out.println("Valor correcto");
                encontrado = true;
            }else {
                System.out.println("Valor incorrecto");
            }
        }
                
    }
 }
