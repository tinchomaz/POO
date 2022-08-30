/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.perro;
import java.util.ArrayList;

/**
 *
 * @author vluce
 */
public class servicioPerro {
    public ArrayList<perro> Animales  = new ArrayList();
    
    public void crearPerro(){
        perro aux = new perro();
        aux.setNombre(Nombre());
        aux.setRaza(Raza());
        aux.setTamanio(Tamanio());
        Animales.add(aux);
    }
    
     public  void mostrarAnimales(){
        int i = 1; 
        for (perro aux:Animales){
            System.out.println("perro : " +  i  + aux.toString());
        }
    }
    
    
     public String Nombre(){
        String[] nombre = {"Coco","Sultan","Figo","Cuco","Perlita"};
        return( nombre[  (int) (Math.random()* 3)+1 ]); 
    }
     
    public String Raza(){
        String[] nombre = {"Dogo","Salchicha","Mestizo","Caniche","Otros"};
        return( nombre[  (int) (Math.random()*3)+1 ]); 
    } 
     
    public String Tamanio(){
        String[] nombre = {"grande","mediano","pequeño","Varios"};
        return( nombre[  (int) (Math.random()*2)+1 ]); 
    } 
}

