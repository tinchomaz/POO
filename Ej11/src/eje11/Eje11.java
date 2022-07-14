/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vluce
 */
public class Eje11 {

    /**
     * 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
     */
    public static void main(String[] args) {
        Scanner  leer  = new Scanner(System.in);
        
        Date hoy = new Date(); 
        
        System.out.println(hoy.toString());
        System.out.println(hoy.getYear()+1900);
        System.out.println(hoy.getMonth()+1 );
        System.out.println(hoy.getDate() );
        int Anio; 
        int Mes ;
        int Dia ; 
        System.out.println("Ingrese el año : ");
        Anio = leer.nextInt();
        System.out.println("Ingrese el mes : ");
        Mes = leer.nextInt();
        System.out.println("Ingrese el dia : ");
        Dia = leer.nextInt();
        Date fecha = new Date(  Anio -1900 , Mes-1 , Dia) ; 
               
               
                
        System.out.println(fecha.toString());
        //System.out.println(fecha.getYear());
        System.out.println(fecha.getYear()+1900);
        System.out.println(fecha.getMonth()+1 );
        System.out.println(fecha.getDate() );
        System.out.println(fecha.getTime());
        //fecha.setTime(hoy.getTime()- 86400 )         ;
        System.out.println(fecha.toString());
        
        
        
        /*
        Date fecha = new Date(2022,12,18); 
        System.out.println(hoy.toString());
        System.out.println(fecha.toString());
        System.out.println(hoy.getYear()+1900);
        System.out.println(hoy.getMonth()+1 );
        System.out.println(hoy.getDate() );
        System.out.println(hoy.getTime() );
        hoy.setTime( hoy.getTime()- fecha.getTime());
        System.out.println(hoy.toString());
        System.out.println(hoy.getYear());
        System.out.println(hoy.getMonth() );
        System.out.println(hoy.getDate() );
          */       
    }    
}
