/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 *Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano
 */
public class ServicesPersona {
    
    public Persona CrearPersona(){
        Persona per = new Persona();
        Scanner leer  = new Scanner(System.in);
        
        System.out.println("Ingrese  el nombre de la persona:");
        per.setNombre(leer.next());
        System.out.println("Ingrese  su edad:");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese  su peso:");
        per.setPeso(leer.nextInt());
        System.out.println("Ingrese  su altura:");
        per.setAltura(leer.nextInt());
        System.out.println("Ingrese  el sexo de la persona:");               
        String opcion;        
        String[] lista = {"H","M","O"};
        opcion = LeeString(lista, "Ingrese H, M u O ");        
        per.setSexo(opcion);
        return per;
    };
    
    //kg/(altura^2 en mts )
    public int calcularIMC( Persona per){
        double   imc;     
        imc=  ((double)per.getAltura()/100)  * ( (double) per.getAltura() / 100)  ;        
        imc = (double) per.getPeso() / imc;         
        //System.out.println("imc" + imc );
        if (imc < 20) {
            return  -1 ;
        } else if ( imc >=20 && imc <= 25 ){
            return  0 ; 
        } else  {
            return 1;    
                }
    }
    
    public  boolean  esMayorDeEdad( Persona per){
        if (per.getEdad() > 18 )  return true;
        return false;
    }
    
    /*----------------------------------------------------------------------*/ 
    public String LeeString( String [] pOpciones, String pMensaje ){        
        Scanner leer = new Scanner(System.in);
        String nValor="" ;      
        boolean lExiste = false;
        System.out.println( pMensaje );                               
        while( true )  {
            nValor = leer.next();     
            nValor = nValor.substring(0, 1).toUpperCase();            
            lExiste = false;
            for (int i = 0; i< pOpciones.length ; i++ ){
                lExiste = lExiste ? true : nValor.equals(pOpciones[i]);               
            };
            if (!lExiste ){               
                System.out.println("Error: El valor ingresado no es una opcion Valida..." );                  
                System.out.println( pMensaje );                               
            }else break; 
        }
        return nValor; 
    }
}
