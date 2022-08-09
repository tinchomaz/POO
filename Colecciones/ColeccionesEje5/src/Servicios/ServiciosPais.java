/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**

 */
public class ServiciosPais {

  HashSet<Pais>   listaPaises = new HashSet();
  
   Scanner leer  = new Scanner(System.in);
   
  public void cargarPaises(){
      boolean fin  = false ;
      String  opcion ; 
      do {
          Pais var = new Pais(); 
          System.out.println("Ingrese el nombre del Pais  ");
          var.setNombre( leer.nextLine().toUpperCase());
          listaPaises.add( var  );      
          System.out.println("Desea ingresar otro pais ? (s/n)");
          opcion = leer.nextLine();
          if (opcion.equalsIgnoreCase("N")  ) {
              fin = true; 
          }
      }while (!fin) ;
           
  }
  
  
  public void  mostrarPaises(){            
      // sirve para ordernar el   HashSet  --> ArrayList // 
      ArrayList<Pais> arrayPaises = new ArrayList(listaPaises );
      Collections.sort(arrayPaises, Comparadores.ordenaPorNombre);      
      for (Pais var : arrayPaises ){
          System.out.println(var.toString());
      }
  }
  
  
  public void  revisarPais(){
       String var ;       
       boolean existe  = false; 
       System.out.println("Ingrese el nombre del pais a buscar");
       var = leer.nextLine().toUpperCase();
       Iterator<Pais> it2  = listaPaises.iterator();
       while (it2.hasNext()){
           String nomPais = it2.next().getNombre();
           if (nomPais.equalsIgnoreCase(var)) {
               it2.remove();
               existe = true; 
           }
       }
       if (!existe){
       System.out.println("El pais " + var  + " NO EXISTE en la lista");
       };
  }
}
