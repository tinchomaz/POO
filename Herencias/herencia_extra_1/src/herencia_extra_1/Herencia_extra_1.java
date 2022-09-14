/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_extra_1;

import entidades.alquiler;
import entidades.barco;
import entidades.barcosmotor;
import entidades.veleros;
import entidades.yates;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.

* Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

* Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

* En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

* Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 *
 * @author serus
 */
public class Herencia_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int op; 
       ArrayList<barco> bar = new ArrayList(); 

       Date fecha2 = new Date(2022-1900, 9,1);
       System.out.println(fecha2);
        
       
        veleros v1 = new veleros(1, "burrito", 4, 2018);
        yates y1 = new yates(1000, 10, "MESSI", 10, 2022);
        barcosmotor bm1 = new barcosmotor(800,"ARG002", 8, 2021);    
        barco b1 = new barco("ARG001", 6, 2020);
        alquiler a1 = new alquiler("Pepe",33100100, new Date(),fecha2, 10, b1);
        
        
        bar.add(v1);
        bar.add(bm1);
        bar.add(y1);
        bar.add(b1);
        
        for(barco aux: bar){
            
        System.out.println(" Barcos disponibles " + aux.toString());
        }
        
        System.out.println("///////////////////////////////////////");
        
        System.out.println("Que barco desea alquilar");
        Scanner leer = new Scanner(System.in);
        op = leer.nextInt();
        
        bar.get(op);
        
        
        
        /*(String cliente, int dni, Date fechaalq, Date fechadev, int amarre, barco barco)*/
        /*barco(String matricula, int eslora, int año) */
        /*bmotor(int potencia, String matricula, int eslora, int año)*/
        /*yates(int potenciaYate, int camarotes, String matricula, int eslora, int año)*/
        /*veleros(int mastiles, String matricula, int eslora, int año)*/
        
        
        System.out.println("Precios de alquiler");
        
        a1.setBarco(bar.get(op));
        /*bar.get(op).getClass().getTypeName();*/
        
        a1.setFechadev(new Date(122, 8,20));
        System.out.println("Precio de " + bar.get(op).getClass().getTypeName() + " $ " + a1.calcularAlquier() + bar.get(op).toString());
         
        System.out.println("///////////////////////////////////////");
        
        
        
    }
    
}
