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
public class extra_15 {
   /**
     * @param args the command line arguments
     * 15. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese   un valor entero ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese  otro valor entero ");
        int num2 = leer.nextInt();
        String opcion; 
        boolean  finalizar = false ;
        do {
            System.out.println("Ingrese  la opcion deseada ");
            System.out.println("S = Sumar  ");
            System.out.println("M = Multiplicar  ");
            System.out.println("F = Finalizar  ");
            opcion = leer.next() ; //   .nextLine();
            switch ( opcion.toUpperCase()   ){
                case "S"  : 
                    System.out.println("El resultado de la suma es :"+   sumar(num1,num2));
                    break;                        
                case "M"  : 
                    System.out.println("El resultado de la multiplicacion es :"+   multiplicar(num1,num2));
                    break;       
                case "F"  : 
                    System.out.println("bye");
                    finalizar = true;
                    break;           
                default :     
                    System.out.println("La opcion es incorrecta ");
            }
                
        }while (finalizar == false );        
    }
    
    //------------------------*/  
    public static int sumar( int n1, int n2){
        return (n1 + n2);
    }
    
    public static int multiplicar( int n1, int n2){
        return (n1 * n2);
    }
    
}   

