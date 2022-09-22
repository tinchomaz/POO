/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author vluce
 */
public class servicioDivision   {
    
    public DivisionNumero CrearNumero(){
        
        DivisionNumero aux = new DivisionNumero(); 
         return (aux) ;         
    }
    
    
    public int LeerNumero() throws Exception {
        Scanner  leer = new Scanner(System.in).useDelimiter("\n");
        String  valor = "" ;    
        int nValor = 0; 
        boolean fin = false;         
        do{
           System.out.println("Ingrese un valor numerico:");
           valor = leer.next();
           try {
           nValor= Integer.parseInt(valor) ; 
           fin = true; 
           } catch (Exception err ) {
              System.out.println("Error aca!!! No ingreso un numero valido...");
              System.out.println("Desea continuar? (S = SI)");
              valor = leer.next();
              if (!valor.equalsIgnoreCase("S")) {
                  throw new Exception("No deseo seguir ahora");
              }
           }        
        } while (!fin); 
        return nValor; 
    }
    /*-----------------------------------------*/ 
    public int LeerNumero2() throws DatoErroneo {
        Scanner  leer = new Scanner(System.in).useDelimiter("\n");
        String  valor = "" ;    
        int nValor = 0; 
        boolean fin = false;         
        do{
           System.out.println("Ingrese un valor numerico(2):");
           valor = leer.next();
           try {
           nValor= Integer.parseInt(valor) ; 
           fin = true; 
           } catch (Exception err ) {
              System.out.println("Error aca!!! No ingreso un numero valido...");
              System.out.println("Desea continuar? (S = SI)");
              valor = leer.next();
              if (!valor.equalsIgnoreCase("S")) {
                  throw new DatoErroneo(  "La pifiamos....");
              }
           }        
        } while (!fin); 
        return nValor; 
    }
    
   public double Divisor(int A, int B)  throws  DatoErroneo {
        double  nValor =0; 
        Integer val1 = A ;
        if ( val1.equals(null) ) {  throw new DatoErroneo("El dividendo es nulo.."); };
        val1 = B; 
        if ( val1.equals(null) ) {  throw new DatoErroneo("El divisor  es nulo.."); };        
        try{
            nValor = A/B  ; 
        }catch(Exception err ) {
           throw new DatoErroneo("No se puede dividir por cero!!!");
        }       
       return nValor; 
   }
}
