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
public class Ejemplo_nº_14 {
    
  /**
     14. Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantida  de EUROS a convertir");
        float Euros= leer.nextFloat();
        conversor(Euros, "LIB");                
        conversor(Euros, "DOL");                
        conversor(Euros, "PESOS");                
    }
    
    public static void conversor( float Cantidad , String moneda) {
        switch (moneda){
            case "LIB" :
                System.out.println("LIBRAS :" + 0.86 * Cantidad );
                break;
            case "DOL" :     
                System.out.println("DOLARES :" + 1.28611 * Cantidad );
                break;
            case "YEN" :     
                System.out.println("YENES :" + 129.852 * Cantidad );    
                break;
            default  :   
               System.out.println("Sin cotizacion " );
        }
    }
    
}
