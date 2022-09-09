/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author vluce
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal p0  = new Perro("Sultan","Balanceado", 10, "Policia");
        p0.Alimentarse();        
        Perro p1 = new Perro();
        p1.Alimentarse();        
        //----------------------------------//
        Animal g0 = new Gato("Felipe","Salmon Cuyano", 4, "Angora"); 
        g0.Alimentarse();
        //----------------------------------//
        Animal c0 = new Caballo("Galope","Pasto", 6, "Arabe");
        c0.Alimentarse();
        
    }
    
}
