/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.ServicioCafetera;
/** Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author nahue
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer=new Scanner (System.in);
        ServicioCafetera sc=new ServicioCafetera(); 
        Cafetera cafe1=new Cafetera();
        cafe1.setCapacidadMaxima(2000);
        cafe1.setCantidadActual(1000);
        System.out.println(cafe1.getCantidadActual());
        sc.llenarCafetera(cafe1);
        System.out.println(cafe1.getCantidadActual());
        System.out.println("ingrese el volumen de la taza que va a servir");
        sc.servirTaza(cafe1,Leer.nextInt());
        System.out.println(cafe1.getCantidadActual());
        sc.vaciarCafetera(cafe1);
        System.out.println(cafe1.toString());
        sc.agregarCafe(cafe1);
        System.out.println(cafe1.toString());
    }

   
    
}
