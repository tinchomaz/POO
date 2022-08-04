/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos 
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer 
con sus 3 notas.
 */
public class Alumno {
    public String nombre ;
    public ArrayList <Integer> notas = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        String texto = "";
        for ( Integer var : notas) {        
            texto = texto.concat( var.toString().concat(":") );
            //System.out.println( var) ;
        }
        //return "Alumno{" + "nombre=" + nombre + ", notas=" + notas.get(0) + ":" +  notas.get(1)  + ":" + notas.get(2) + '}';
        return "Alumno{" + "nombre=" + nombre + ", notas=" + texto  + '}';
    }
    
    
}
