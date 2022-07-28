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
public class extra_1 {
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos a calcular");
        int min=leer.nextInt();
        int hora=min/60;
        int dia=hora/24;
        hora=hora-dia*24;
        System.out.println("Los minutos ingresados equivalen a " + dia + " dia y " + hora + " horas" );
                
        
    }
}
