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
public class extra_5 {
 public static void main(String[] args) {
        
        /*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de Socio");
        
        String opc=leer.nextLine();
        
        System.out.println("Ingrese el costo del tratamiento");
        
        double cost=leer.nextDouble();
        opc=opc.toLowerCase();
        

        switch(opc){
            
            case "a": System.out.println("EL total a pagar es: " + cost*0.5);
            break;
            
            case "b": System.out.println("EL total a pagar es: " + cost*0.65);
            break;
   
            case "c": System.out.println("EL total a pagar es: " + cost);
            break;
        }
        
    }
}