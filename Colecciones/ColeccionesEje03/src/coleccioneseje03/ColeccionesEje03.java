/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccioneseje03;

import Servicios.Comparadores;
import Servicios.ServicioAlumnos;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vluce
 */
public class ColeccionesEje03 {

    /**
 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas.
     */
    public static void main(String[] args) {
       ServicioAlumnos sa = new ServicioAlumnos();
       boolean fin = false;
       String  opcion = "";
       Scanner  leer  = new Scanner (System.in);
       
       do{       
          sa.GenerarAlumno();
           System.out.println("Para  finalizar ingrese N , otra tecla para continuar...");
           opcion = leer.next();
           if ( opcion.equalsIgnoreCase("N")) {
               fin = true;
           }
       } while (!fin) ;        
       
       sa.MostrarAlumnos();
       System.out.println("- Ordenado descendente por  nombres ");               
       sa.MostrarAlumnosPorNombre();
       fin = false;
       do{       
          System.out.println( sa.notaFinal() ) ;
          System.out.println("Para  finalizar ingrese N , otra otro alumno...");
           opcion = leer.next();
           if ( opcion.equalsIgnoreCase("N")) {
               fin = true;
           }
       } while (!fin) ;        
    }    
}
