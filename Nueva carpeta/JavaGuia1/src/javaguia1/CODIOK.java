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
public class CODIOK {
    public static void main(String[] arg){
        Scanner leer = new Scanner (System.in);
        
        String palabra;
        String ultimo;
        int largo;
                
        do{
         System.out.println(" ingrese la palabra/s para codificar y finalice con un punto (.) ");
         palabra = leer.nextLine();
         palabra = palabra.toUpperCase();
         largo = palabra.length();
         ultimo = palabra.substring(palabra.length()-1,palabra.length());
         
        }while (!( ultimo.equals(".")));
         
       // System.out.println(" ingreso palabras sin finalizar con el punto (.) ");
    
        
       

        String Salida = "";
        int i;
        for (i=0;i<largo-1;i++){
            Salida = Salida.concat(cambio(palabra.substring(i, i+1)) );
        }
           System.out.println(Salida);
       }        
  
    public static String cambio( String palabraA){
        
        String retornar ;
        switch (palabraA) {
            case  "A" : retornar = "@";
            break;
             case "E" : retornar = "#";
            break;
             case "I" : retornar = "$";
            break;
             case "O" : retornar = "%";
            break;
             case "U" : retornar = "-";
            break;
            default : {
                      retornar = palabraA;  
                }
        } 
        return   retornar; } 
    }

