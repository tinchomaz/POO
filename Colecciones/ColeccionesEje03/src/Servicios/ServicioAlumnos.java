/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
pregunta al usuario si quiere crear otro Alumno o no
 */
public class ServicioAlumnos {
    
    ArrayList< Alumno > ListaAlumnos =  new ArrayList();
    Scanner  leer  = new Scanner(System.in);
    
    public void GenerarAlumno() {
        Alumno al = new Alumno();
        ArrayList<Integer> vecNotas =  new ArrayList();
        System.out.println("Ingrese el nombre del Alumno");
        al.setNombre(leer.next());
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println("Ingrese la nota :" +  i );
            vecNotas.add(leer.nextInt());
        }
        al.setNotas(vecNotas);
        ListaAlumnos.add(al); 
    }
    
    public void MostrarAlumnos(){                      
        for( Alumno var : ListaAlumnos){       
            System.out.println(var.toString());  
        }
    }
    
    /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
promedio final, devuelto por el método y mostrado en el main
     */
    public double notaFinal( ){
        double promedio = 0; 
        double acumulado = 0; 
        boolean  encontrado = false ; 
        String nombre = "" ;
        System.out.println("Ingrese el  nombre del alumno ");        
        nombre = leer.next();
        for( Alumno var : ListaAlumnos){       
            if (var.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for ( int notas :  var.getNotas()) {
                    acumulado = acumulado + notas; 
                }  
                promedio = acumulado / var.getNotas().size(); 
            }                
        }
        if  ( !encontrado )   {
              System.out.println("No existe ese alumno");
            } ;
        return (promedio);
    }
}
