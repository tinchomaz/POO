/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidades.Operaciones;

/**
 *
 * @author Flores
 */
public class Ej3 {

    /**Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    public static void main(String[] args) {
      Operaciones numeros=new Operaciones(20,10);
      Operaciones numeros2=new Operaciones();
      Operaciones numeros3=new Operaciones();
      numeros2.setNum1(40);
      numeros2.setNum2(5);
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        System.out.println(numeros2.getNum1());
        System.out.println(numeros2.getNum2());
     
        numeros3.crearOperacion();
        
        System.out.println("-----------------------------");
        System.out.println(numeros.sumar());
        System.out.println(numeros.restar());
        System.out.println(numeros.mult());
        System.out.println(numeros.div());
        System.out.println("-----------------------------");
        System.out.println(numeros2.sumar());
        System.out.println(numeros2.restar());
        System.out.println(numeros2.mult());
        System.out.println(numeros2.div());
        System.out.println("-----------------------------");
        System.out.println(numeros3.sumar());
        System.out.println(numeros3.restar());
        System.out.println(numeros3.mult());
        System.out.println(numeros3.div());
    }
    
}
