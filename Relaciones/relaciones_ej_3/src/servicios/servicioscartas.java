/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author serus
 */
public class servicioscartas {
    
    ArrayList<cartas> baraja = new ArrayList();
    ArrayList<cartas> pozo = new ArrayList();
    
    public void rellenarmazo(){
       
            for (int j=1;j<=7;j++){
                baraja.add(new cartas("oro",j));
            } for (int j=10;j<=12;j++){
                baraja.add(new cartas("oro",j));
                 }           
        for (int j=1;j<=7;j++){
                baraja.add(new cartas("copa",j));
            } for (int j=10;j<=12;j++){
                baraja.add(new cartas("copa",j));
                 }  
             for (int j=1;j<=7;j++){
                baraja.add(new cartas("espada",j));
            } for (int j=10;j<=12;j++){
                baraja.add(new cartas("espada",j));
                 }  
             for (int j=1;j<=7;j++){
                baraja.add(new cartas("basto",j));
            } for (int j=10;j<=12;j++){
                baraja.add(new cartas("basto",j));
                 }  
        }
      /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.  */ 
        
      public void mostrarbaraja(){
          
          for (cartas aux:baraja)
              System.out.println(aux.toString());
              
        }  
       public void mostrarpozo(){
          
          if 
                  (pozo.size()==0)
               System.out.println("el pozo ya no tiene cartas");
          else{
              for (cartas aux:pozo)
              System.out.println(aux.toString());
          }
              
          /* cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario*/    
        }  
      /*barajar(): cambia de posición todas las cartas aleatoriamente.*/
      
      public void barajar(){
          
          Collections.shuffle(baraja);
          
      }
/*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.*/

      public void siguientecarta(){
          
          pozo.add(baraja.get(0));
          baraja.remove(0);
          
      }
      
     /*cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/ 
      
     public void cartasdispo(){
    
         System.out.println("cartas disponibles " + baraja.size());
    
}

/*darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.*/
     
     
     public void darcartas(){
         Scanner leer = new Scanner(System.in);
         int cantidad;
         System.out.println("ingrese la cantidad de cartas");
         cantidad=leer.nextInt();
         
         if
             (cantidad<=baraja.size())
             for (int i = 0; i < cantidad; i++) {
                 siguientecarta();
             }
             
         else
             System.out.println("no hay esa cantidad de cartas en el mazo");
         


     }

}
        
    
    
    
    
    
    
    

