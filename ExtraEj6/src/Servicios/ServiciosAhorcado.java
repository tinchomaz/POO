/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.
* 
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length.
* 
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
* 
* 
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades.
* 
* 
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
* 
• Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main
* 
 */
public class ServiciosAhorcado {
    
    public  void juego( Ahorcado Ahor  , int intentos){
         Scanner  leer  = new Scanner(System.in); 
         char Letra ; 
         boolean fin  =false; 
         boolean ret  =false; 
         do {
             System.out.println(" una letra para continuar ");
             Letra = leer.next().charAt(0);
             ret = buscar(Ahor, Letra);
             ret = encontradas(Ahor, Letra);
             intentos(Ahor,intentos );  
            // if()             
         } while(!fin);               
    }
    
    public  void intentos(Ahorcado Ahor , int intentos ) {
        System.out.println("Le quedan "+ (intentos  - Ahor.jugadas ) + " intentos");         
    }
    
    public boolean  encontradas( Ahorcado Ahor, char Letra) {
        System.out.println("Se han encontrado " + Ahor.encontradas + " letras" );
        System.out.println("Faltan por encontrar " + (longitud(Ahor)- Ahor.encontradas) + " letras" );
        return buscar(Ahor, Letra);        
    }
    
    
    public boolean  buscar ( Ahorcado Ahor, char Letra) {
        boolean  encontrado = false; 
        Ahor.setJugadas(  Ahor.getJugadas() + 1 );
        for (int i=0; i< longitud(Ahor); i++  ){
            if ( Ahor.Palabra[i]== Letra) {
                encontrado = true;                
                System.out.println("La letra [" + Letra + "] si  forma parte de la palabra");
                Ahor.setEncontradas( Ahor.getEncontradas()+1 );
                //break;
            }else {
                System.out.println("La letra NO  forma parte de la palabra");                
            }
        }   
        return   encontrado; 
    }  
    
    
    public  int  longitud( Ahorcado  Ahor){
      return  Ahor.Palabra.length;        
    };
    
    public  Ahorcado crearJuego(){
       /*
         * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.
        */ 
       Scanner  leer  = new Scanner(System.in);
      
       String   cadena ; 
       int      longitud; 
        System.out.println("Ingrese la palabra para comenzar a jugar");
        cadena = leer.next(); 
        longitud =  cadena.length();
        Ahorcado  temp = new Ahorcado(longitud);  
        char   letra ; 
        for (int i=0 ; i< longitud ; i++) {
            letra = cadena.charAt(i); 
            temp.Palabra[i] = letra;
        }
        return   temp; 
    }
}

