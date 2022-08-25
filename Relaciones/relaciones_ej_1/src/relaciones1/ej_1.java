/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones1;

import entedidades.perro;
import entedidades.persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author serus
 */
public class ej_1 {

    /**
     1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
      clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
      atributos: nombre, apellido, edad, documento y Perro.
      Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
      pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
      la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        
        
    Scanner leer = new Scanner(System.in);  
    
    ArrayList<persona> info = new ArrayList();
      
    for(int i=0;i<2;i++){
        
      perro m1 = new perro(); 
      
      System.out.println("Ingrese su nombre de la mascota");
      m1.setNombre(leer.next());
      System.out.println("Ingrese la raza");
      m1.setRaza(leer.next());
      System.out.println("Ingrese el tamaño de la mascota");
      m1.setTamano(leer.next());
      System.out.println("Ingrese la edad de la mascota");
      m1.setEdad(leer.nextInt());
    
      persona p1 = new persona();
      
      System.out.println("Ingrese su nombre");
      p1.setNombre(leer.next());
      System.out.println("Ingrese su apellido");
      p1.setApellido(leer.next());
      
      p1.setMascota(m1);
      System.out.println("Ingrese el dni");
      p1.setDni(leer.nextInt());
      System.out.println("Ingrese su edad");
      p1.setEdad(leer.nextInt());
      
        
    
        info.add(p1);
    }    
        
      for(persona aux:info){
       System.out.println(aux.toString());    
      }  
      
}
} 