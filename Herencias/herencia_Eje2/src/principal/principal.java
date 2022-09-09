/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.electro;
import entidades.lavadora;
import entidades.televisor;

/**
 *
 * @author vluce
 */
public class principal {

   
    public static void main(String[] args) {
        
        electro  e1   = new electro( 1001, "GRIS", "B", 25); 
        lavadora lav1 = new lavadora(1001, "BLANCO", "B", 25, 100); 
        //lavadora lav1 = new lavadora(1001, "BLANCO", "B", 25, "NADA"); 
          
        
        //System.out.println(    e1.toString()   ); 
        //System.out.println(    lav1.toString()   ); 
        //e1.crearElectrodomestico();
        //System.out.println(    e1.toString()   );  
        //lav1.crearLavadora();
       // lav1.precioFinal();
       // System.out.println(    lav1.toString()   ); 
        televisor tel1 = new televisor(1,false, 10, "BLA","X",10);         
        System.out.println(      tel1.toString()  ); 
        tel1.creartelvisor();
        tel1.precioFinal();
        System.out.println(      tel1.toString()  ); 
    }
    
}
