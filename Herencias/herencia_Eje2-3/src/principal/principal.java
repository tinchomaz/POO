/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.electro;
import entidades.lavadora;
import entidades.televisor;
import java.util.ArrayList;

/**
 *
 * @author vluce
 */
public class principal {

   
    public static void main(String[] args) {
        /*   EJERCICIO 2 
        electro  e1   = new electro( 1001, "GRIS", "B", 25); 
        lavadora lav1 = new lavadora(1001, "BLANCO", "B", 25, 100);        
        lav1.crearLavadora();
        lav1.precioFinal();
        System.out.println(    lav1.toString()   ); 
        televisor tel1 = new televisor(1,false, 10, "BLA","X",10);         
        System.out.println(      tel1.toString()  ); 
        tel1.creartelvisor();
        tel1.precioFinal();
        System.out.println(      tel1.toString()  ); 
        ------------- Fin Ejercicio 2 */ 
        /* ------- Ejercicio 3  --------------*/ 
        ArrayList<electro>  Stock = new ArrayList(); 
        lavadora lav1 = new lavadora( 1000,"BLANCO", "B", 40, 8 );
        Stock.add(lav1);
        lavadora lav2 = new lavadora( 2000,"GRIS", "A", 38, 12 );
        Stock.add(lav2);
        televisor tel1 = new televisor(55,false, 35000, "BLANCO","D",10); 
        Stock.add(tel1);
        televisor tel2 = new televisor(32,true, 28000, "NEGRO","B",8); 
        Stock.add(tel2);
        double Valor = 0; 
        double Valor1 = 0; 
        for (electro aux : Stock ){
            aux.precioFinal();
            System.out.println( "Original :" +  aux.toString()); 
            aux.precioFinal();
            System.out.println( "Ajustado :" +  aux.toString()); 
            System.out.println("-----------------------------------");
            Valor = Valor + aux.getPrecio() ; 
            //  Saber a que clase pertenece el objeto  // 
            if ( aux.getClass().getTypeName().equalsIgnoreCase("entidades.lavadora")  ){
                Valor1 = Valor1 + aux.getPrecio() ; 
               } 
            }
        System.out.println("Valor total del Stock:     $" + Valor);
        System.out.println("Valor total de lavadora   :$" + Valor1);
        System.out.println("Valor total de televisores:$" +  (Valor - Valor1)  );
        
        
   
        
        
        
    }
    
}
