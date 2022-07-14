/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje09;

import Entidades.Matematica;

/**
 *
 * @author vluce
 */
public class Eje09 {

    /**
     9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica cal1 = new Matematica();       
        cal1.setNum1( Math.random() * 10 );
        cal1.setNum2( Math.random() * 10 );
        System.out.println(cal1.toString());
        System.out.println( " mayor valor  : " + cal1.devolverMayor());
        System.out.println( " Potencia de : " +Math.round(cal1.devolverMayor()) +
                            " elevado a la " + Math.round(cal1.devolverMenor())  + " es : " +  cal1.calcularPotencia());
        System.out.println( " Raiz cuadrada de:"   + Math.abs( cal1.devolverMenor()) + " es :" +  cal1.calculaRaiz()); 
        
        Matematica cal2 = new Matematica( Math.random() * 15 ,  Math.random() * 50 );
        System.out.println(cal2.toString());
        System.out.println( " Potencia de : " +Math.round(cal2.devolverMayor()) +
                            " elevado a la " + Math.round(cal2.devolverMenor())  + " es : " +  cal2.calcularPotencia());
    }
    
}
