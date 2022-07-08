/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import atributos.atributofrase;
import java.util.Scanner;

/**
 *
 * @author serus
 */
public class ClassCadena {
    
  /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada*/
    Scanner leer = new Scanner(System.in);
    public void mostrarVocales(atributofrase vocal){
        int contador=0;
        for (int i=0; i < vocal.longitud; i++){
            
            if (vocal.frase.substring(i, i+1).equalsIgnoreCase("a")||vocal.frase.substring(i, i+1).equalsIgnoreCase("e")||vocal.frase.substring(i, i+1).equalsIgnoreCase("i")||vocal.frase.substring(i, i+1).equalsIgnoreCase("o")||vocal.frase.substring(i, i+1).equalsIgnoreCase("u")){
                contador++;
            }
            
            
        }
        System.out.println(contador);
        }

/* b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"*/
    
    
    public void invertir(atributofrase inv){
        for (int i = inv.longitud; i > 0; i--){
            
            System.out.print(inv.frase.substring(i-1, i));
            
        }
        System.out.println("");
    }

/* c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: */
 
     public void repetir(atributofrase rep){
        String letra;
        int contador=0;
         
        System.out.println("Ingrese la letra que quiera contar");
        letra = leer.next();
        for (int i=0; i < rep.longitud; i++){
            if (rep.frase.substring(i, i+1).equalsIgnoreCase(letra)){
                contador++;
            }
            }System.out.println("la letra se repite " + contador + " veces"); 
     }


     /** e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.*/
     
     
     public void comparar(atributofrase com){
         String comp;
         int contador=0;
         Scanner leer = new Scanner(System.in);
         System.out.println(" Ingrese una nueva palabra para comparar, si es mas de una, separelas con un espacio"); 
     
         comp=leer.nextLine();
         contador = comp.length();
                 
         if (contador==com.longitud){
             System.out.println("las frases son de igual longitud");
         }else
             System.out.println("las frases tienen distinta longitud");
     
     
     }

/** f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.*/

public void unir(atributofrase com){
         String comp;
         
         Scanner leer = new Scanner(System.in);
         System.out.println(" Ingrese una nueva palabra para unir, si es mas de una, separelas con un espacio"); 
     
         comp=leer.nextLine();
         com.setFrase(com.getFrase().concat(" ").concat(comp));
         
         System.out.println(com.getFrase());
                 
       
     
     
     }
     
    /** g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.*/ 
   
public void reemplazar(atributofrase ree){
    
     Scanner leer = new Scanner(System.in);
    
        String temp="";
        System.out.println(" Ingrese la letra para reemplazar ");
        String letra = leer.next();
        
        
        
        for (int i=0; i < ree.longitud; i++){
            
            if (ree.frase.substring(i, i+1).equalsIgnoreCase("a")){
                temp=temp.concat(letra);
            }else{
                temp=temp.concat(ree.frase.substring(i, i+1));
            }
                  
        }ree.setFrase(temp);
         
         System.out.println(ree.getFrase());
}

/*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no. */










 }
