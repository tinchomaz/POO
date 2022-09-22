/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vluce
 */
public class principal {

    /**
4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  = new Scanner(System.in).useDelimiter("\n");
        int val1=0;
        int val2=0; 
        String cadena=""; 
        System.out.println("Ingrese   un numero: ");
        
        try {
          val2 = leer.nextInt();
        //} catch ( InputMismatchException err)  {
          } catch ( Exception err)  {
          System.out.println("Error en el ingreso de datos ");
          System.out.println( err.toString()) ;
           // System.out.println( err.getMessage());
            //System.out.println(err.getLocalizedMessage());
          cadena = leer.next(); // es para limpiar el buffer de teclado!!!! 
        }
               
        
        System.out.println("Ingrese otro  numero ahora : ");
        try{
            cadena = leer.next();
            val1 = Integer.parseInt(cadena); 
        }catch(NumberFormatException err ){
            System.out.println("Error el valor ingresado no es numerico");            
        }
        
        System.out.println("===========Division por cero.=========== ");
        try{
            val2 = val1 / 0;         
        } catch(  ArithmeticException err) {
            System.out.println("Error al dividir por cero ");
            val2 = -99; 
        } catch ( Exception err) {
            System.out.println("Error en el calculo algebraico ");    
            val2 = -98; 
        }
        System.out.println("Valor resultante :" + String.valueOf(val2));
    }
    
}
