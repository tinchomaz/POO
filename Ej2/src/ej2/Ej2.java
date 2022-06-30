/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Entidades.Circunferencia;

/**
 *
 * @author Flores
 */
public class Ej2 {
/*
    2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia radio=new Circunferencia(50);
        Circunferencia radio2=new Circunferencia();
        
        
        System.out.println(radio.getRadio());
        radio.setRadio(40);
        System.out.println(radio.getRadio());
        radio2.crearCircunferencia();
        System.out.println(radio2.getRadio());
        System.out.println(radio2.area());
        System.out.println(radio.area());
        System.out.println(radio2.peri());
        System.out.println(radio.peri());
    }
    
}
