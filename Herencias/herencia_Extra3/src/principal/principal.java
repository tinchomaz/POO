/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.alojamiento;
import entidades.camping;
import entidades.hotel4;
import entidades.hotel5;
import entidades.residencias;
import java.util.ArrayList;

/**
 *
 * @author vluce
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<alojamiento>  guia = new ArrayList();  
        alojamiento  aloj1 = new alojamiento("Hotel primero","San Matin 1234","Capital", "Jorge Lopez Diaz") ; 
        guia.add(aloj1);
        alojamiento aloj2 = new hotel4(25, 50, 1, 7500,"Gim-A","El gran encuentro", 100, "Hotel 4 estrella", "Calle primera", "Entre costas ","Gernete entre Costas " ); 
        guia.add(aloj2);        
        alojamiento aloj3 = new hotel5(2, 13, 2, 27, 55, 1, 9500,"Gim-B","El gran encuentro", 100, "Hotel 5 estrella", "Calle Segunda 5", "Cinco Saltos ","Gerenta de Saltos " ); 
        guia.add(aloj3);                
        hotel5 aux5 = (hotel5) aloj3;         
        System.out.println(" Precio por habitacion :" +  aux5.precioHabitacion() );         
        alojamiento cam1 = new camping(65, 8, true , false, 2500, "camping playero", "Costa del rio 234", "Villa lago", "Don Cacho ") ;
        guia.add(cam1);                
        alojamiento cam2 = new residencias( 12, true, true, false, 1000, "Residencias de verano", "Alvear 400 ", "Ciudadela", "Carla lopez") ;
        guia.add(cam2);                
        camping aux6 = (camping) cam1;           
        System.out.println(aux6.toString()) ;
        System.out.println("-----------------------------");
        
        for(alojamiento aux : guia) {
            //        System.out.println( aux.toString());            
            if (aux.getClass().getTypeName() == "entidades.hotel4"){
                hotel4 aux4 = (hotel4) aux;         
                System.out.println("Precio de habitacion(4) : " +  aux4.precioHabitacion() ) ; 
            };
            if (aux.getClass().getTypeName() == "entidades.hotel5"){
                hotel5 aux_5 = (hotel5) aux;         
                System.out.println("Precio de habitacion(5) : " +  aux_5.precioHabitacion() ) ; 
            }
            if (aux.getClass().getTypeName() == "entidades.camping"){
                camping cmp = (camping) aux;         
                if( cmp.isConRestaurant() ) {
                    System.out.println( cmp.getNombre() +  " Si tiene restaurant");
                }
            }
            if (aux.getClass().getTypeName() == "entidades.residencias"){
                residencias res1 = (residencias) aux;         
                if( res1.isDtoSindicatos() ) {
                    System.out.println( res1.getNombre() +  " Si tiene descuento a Sindicatos");
                }
            }
        };       
        
    }
    
}
