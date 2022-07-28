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
public class codificacionbien {
    
public static void main(String[] args) {
        // EJERCICIO 11  // 
        Scanner   leer = new Scanner(System.in); 
        String texto ;
        String ultimo;
        int largo=0;
        do {
            System.out.println("Ingrese  un texto  (finalizado en punto)");
            
            texto  =  leer.nextLine();
       
            largo = texto.length();
                  
            ultimo = texto.substring(texto.length()-1, texto.length()) ;
         
           } while ( !(ultimo.equals("."))  ) ;       
        
        
       
        String Salida = "";
        for (int i = 0 ; i < largo-1 ; i++){
                  
           Salida = Salida.concat( cambio(texto.substring(i, i+1)) );            
         
        }
        System.out.println(Salida);
    }
    /* -------------------*/ 
    public static String cambio( String pLetra ) {
        String retornar ;
        switch (pLetra) {
            case "a" : retornar = "@";
            break;
             case "e" : retornar = "#";
            break;
             case "i" : retornar = "$";
            break;
             case "o" : retornar = "%";
            break;
             case "u" : retornar = ".";
            break;
            default : {
                      retornar = pLetra;  
                }
        } ;
        return   retornar; 
    }
    
}

