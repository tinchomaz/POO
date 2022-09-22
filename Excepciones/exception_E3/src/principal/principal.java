/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.DivisionNumero;
import java.util.Scanner;
import servicios.servicioDivision;

/**
 *
 * @author vluce
 */
public class principal {


    public static void main(String[] args) {
        // TODO code application logic here
        /*  version uno   
        Scanner  leer = new Scanner(System.in).useDelimiter("\n");
        String  valor = "" ;
        DivisionNumero dn = new DivisionNumero();         
        boolean fin = false;         
        do{
           System.out.println("Ingrese un valor numerico:");
           valor = leer.next();
           try {
           dn.setNumA(Integer.parseInt(valor)) ; 
           fin = true; 
           } catch (Exception err ) {
              System.out.println("Error aca!!! No ingreso un numero valido...");
           }
        //System.out.println("final");
        } while (!fin); 
*/ 
        /* Version 2 --------*/ 
        servicioDivision sd = new servicioDivision(); 
        DivisionNumero Numero;         
        Numero = sd.CrearNumero();
        try {
             Numero.setNumA( sd.LeerNumero() );
        } catch (Exception err){
            System.out.println("No se ingresa numero valido");
        }
        
        try {
             Numero.setNumB( sd.LeerNumero2() );
        } catch (Exception err){
            System.out.println( err.getMessage()) ;
            System.out.println("No se ingresa numero valido");           
        }
        System.out.println( Numero.toString());
        double  resultado =0; 
        try{
            resultado =     sd.Divisor(Numero.getNumA(),Numero.getNumB()) ; 
        }catch(Exception err ) {
            System.out.println("Error : " +  err.getMessage());
        }
        System.out.println("Resultado de la division = " + resultado );        
    }
    
    
}
