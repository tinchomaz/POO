/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

/**
 *
 * @author serus
 */
public class extra_12 {
    
 /**
     * @param args the command line arguments
     * 12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<=9; i++){
           for (int j=0; j<=9; j++){ 
               for (int k=0; k<=9; k++){ 
               System.out.println( tres(String.valueOf(i))+"-"+tres(String.valueOf(j))+"-"+tres(String.valueOf(k)) );
               }
           }
        }
    }
    
    
   public static String tres(String numero) { 
       String letra ; 
       switch( numero){
           case "3" : letra = "E";
                      break;
           default :  letra = numero;
       }
       return letra;
   }
   
}
