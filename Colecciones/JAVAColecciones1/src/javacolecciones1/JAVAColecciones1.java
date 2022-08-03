/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class JAVAColecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      ArrayList<String> Raza = new ArrayList();
      String perro="";
      do{
          System.out.println("ingrese raza de perro,si no quiere ingresar mas ponga -no-");
          perro=leer.nextLine();
          if (!perro.equals("no")){
              Raza.add(perro);
          }
      }while(!perro.equals("no"));
      
      for(String var:Raza){
            System.out.println(var);
      }
      
      do{
          System.out.println("De los perros ingresados elija una raza para eliminar o ponga -no-");
          perro=leer.nextLine();
          if (!perro.equals("no")){
              Raza.remove(perro);
              perro="no";
          }
      }while(!perro.equals("no"));
      
    
      for(String var:Raza){
            System.out.println(var);
      }
}
}
