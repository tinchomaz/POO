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
public class extra_9 {
    
 public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int dividendo =0;   
     int divisor   =0;   
     int  i = 0;      
     
     //dividendo  = LeeEntero(1,209      ,"Ingrese un DIVIDENDO ahora"); 
     //divisor    = LeeEntero(1,dividendo,"Ingrese un DIVISOR ahora"); 
        System.out.println("Ingrese un DIVIDENDO ahora");
     dividendo  = leer.nextInt();
     System.out.println("Ingrese un DIVISOR ahora");
     divisor    = leer.nextInt();
     
     while(divisor <= dividendo){
         i++;
         dividendo = dividendo - divisor; 
        // dividendo -= divisor;  // idem a la linea anterior  
     }
        System.out.println("El resultado de la division (COCIENTE) es : " + i );
        System.out.println("El resto de la division es : " + dividendo );     
        
                
    }
    /*  121 / 20 
                 121 - 20 = 101    1
                 101 - 20 = 81     2
                  81 - 20 = 61     3
                  61 - 20 = 41     4 
                  41 - 20 = 21     5 
                  21 - 20 =  1 
    
    
    */
    
    
    /*--------------------------------------------------
    Esta funcion la uso para leer y validar numeros enteros 
    le paso como parametros: el menor valor permitido, 
                             el mayor valor permitido,
                             el mensaje  que debe mostrar cdo pido el numero 
    ------------------------------------------------------*/ 
    
    
    public static int LeeEntero(int pDesde, int pHasta, String pMensaje ){        
        Scanner leer = new Scanner(System.in);
        int nValor=0 ;      
        System.out.println( pMensaje );                               
        while( leer.hasNextInt()){
            nValor = leer.nextInt();
            if (nValor < pDesde || nValor > pHasta ){               
            
            // **  esto lo vemos  despues, pero es una forma de if() en la asignacion misma   *
            /*  puede servir para reemplazar esto: 
                 if (valor > minimo) { 
                     minimo = valor; 
                    } 
            se reemplazaria por esto : 
                  minimo = ( valor>minimo ? valor : minimo ); 
            ******************
            */
                System.out.println("Error: Ingrese un valor entre ["+ String.valueOf(pDesde) + " -- " + String.valueOf(pHasta) +"]" );                  
                System.out.println( pMensaje );                               
            }else break; 
        }
        return nValor; 
    }
}