/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3;

import java.util.Scanner;
import servicios.servicioscartas;

/**
 *
 * @author serus
 */
public class ej_3_ {

    /**
     * 3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
    debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.

     */
    public static void main(String[] args) {
      
    servicioscartas sc = new servicioscartas();

     sc.rellenarmazo();
  
        int opcion;
        Scanner leer = new Scanner(System.in);
        boolean salir;
        salir=false;
              
        do{
           
        System.out.println("Ingrese la opcion deseada");
        
        System.out.println("1_ BARAJAR");
        System.out.println("2_ SIGUIENTE CARTA");
        System.out.println("3_ CARTAS DISPONIBLES");
        System.out.println("4_ DAR CARTAS");
        System.out.println("5_ CARTAS DEL POZO");
        System.out.println("6_ MOSTRAR BARAJA"); 
        System.out.println("7_ SALIR"); 
        opcion = leer.nextInt();
    
   
        switch(opcion){
            
             case 1: 
            
             sc.barajar();
            break;
             case 2: 
            
            sc.siguientecarta();
            break;
             case 3: 
            
            sc.cartasdispo();
            break;
             case 4: 
           
             sc.darcartas();
            break;
             case 5: 
            
            sc.mostrarpozo();
            break;
             case 6 : 
            
            sc.mostrarbaraja();
            break;
             case 7 : 
            salir=true;
           
     }   
    }while(!salir);
        

    
    
    
    
    }
    
}
