/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption_x;

import java.util.Scanner;

/**
 *
 * @author vluce
 */
public class Exeption_X {

    /**
     * 3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. 
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner  leer = new Scanner(System.in);
        int val1=0;
        int val2=0;
        int val3=0;
        String  valor =""; 
        boolean  fin; 
        fin = false;
        do {
        System.out.println("Ingrese  un valor : ");
        valor = leer.next();
        try{
           val1 = Integer.parseInt(valor); 
           fin = true; 
           } catch(Exception a) {
             System.out.println("No ingreso un numero");                         
             }  
        } while (!fin);
        ////////////////////////////////////////////////////////
        System.out.println("Ingrese  otro valor : ");
        fin = false;
        do {
        System.out.println("Ingrese  un valor : ");
        valor = leer.next();
        try{
           val2 = Integer.parseInt(valor); 
           fin = true; 
           } catch(Exception a) {
             System.out.println("No ingreso un numero");                         
             }  
        } while (!fin);
       /*   opcion A -------------      
        try{
        val3 = val1 / val2; 
        } catch ( Exception er ){
            System.out.println("La division por cero no se puede hacer");            
            val3 = 0; 
        }        
        System.out.println("El cociente es : " + val3 );
        ------------------------------*/ 
       /* Opcion B ----------------------*/ 
        calculo cal = new calculo();
        try {
        System.out.println("El resultado es: "  +    cal.division(val1, val2) );
        } catch (Exception err) {
             System.out.println("Error en Division()");
        }
        
    }
    
}
