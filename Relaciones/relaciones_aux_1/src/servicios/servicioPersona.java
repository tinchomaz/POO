/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.perro;
import entidades.persona;
import java.util.ArrayList;

/**
 *
 * @author vluce
 */
public class servicioPersona {
    public ArrayList<persona> Clientes = new ArrayList();    
    
    public void  crearPersona(){
        persona per = new persona();
        per.setNombre(Nombre());
        per.setDni(Dni());
        Clientes.add(per);
    }
    
    public  void mostrarClientes(){
        int i = 1; 
        for (persona aux:Clientes){
            System.out.println("Cliente : " +  i  + aux.toString());
        }
    }
    
    
 /*public void  Adoptar( int  per, perro animal ) {    
        persona temp ; 
        ArrayList<perro>  listaPerros = new ArrayList();  
        System.out.println("------- Dentro de Adoptar() .-........");
        temp = Clientes.get(per);  
        System.out.println(temp.toString());        
        listaPerros = temp.getMascotas();
        System.out.println("------- Dentro de Adoptar() Veo Lista mascotas ");
        if (listaPerros.size()>=0 ){            
           for (perro i : listaPerros){
               System.out.println(i.toString()); 
           }
          } else {
          System.out.println("Sin elementos en el array");
          }        
        listaPerros.add(animal);
        System.out.println("------- Dentro de Adoptar() Veo Lista mascotas 22  ");
        for (perro i : listaPerros){
            System.out.println(i.toString()); 
        }
 }
 */ 
        
 public String Nombre(){
        String[] nombre = {"Carlos","Hugo","Carla","Luisa","Luisa"};
        return( nombre[  (int) (Math.random()*3)+1 ]); 
    }
    
    public int Dni(){
        int[] numeros = { 24345456,32456765,42876876,24345456,24345456};
        return( numeros[  (int) (Math.random()*3)+1 ]); 
    }
    
    
    
    
}


/* public void   Adoptar( persona per) {
        ArrayList<perro>  masc = new ArrayList(); 
        perro aux = new perro("perla","Dogo","Grande") ; 
        System.out.println("Tiene :"+ per.getMascotas()+ " Mascotas");
          //System.out.println("Tiene :"+ per.getMascotas().size() + " Mascotas");
        System.out.println("Seleccione la mascota a adoptar:");
        for (persona temp : Clientes){
            if (temp.getDni() == per.getDni()) {
                masc= temp.getMascotas();
                masc.add(aux);
                temp.setMascotas( masc ) ;
            }
        }                       
    }
*/ 
    
 /*public void  Adoptar( persona per, perro animal ) {    
        for (persona temp : Clientes){
            if (temp.getDni() == per.getDni()) {
               per.getMascotas().add(animal);
            }
        }                            
 }*/
   