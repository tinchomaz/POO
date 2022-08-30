/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.perro;
import entidades.persona;
import servicios.servicioPerro;
import servicios.servicioPersona;

/**
 *
 * @author vluce
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioPersona sp = new servicioPersona(); 
        servicioPerro   serp = new  servicioPerro(); 
        perro   p1; 
        persona per1= new persona(); 
        serp.crearPerro();       
        serp.crearPerro();
        serp.crearPerro();
        
        p1 = serp.Animales.get(0);
        
        serp.mostrarAnimales();
        System.out.println("--------------------------");        
        sp.crearPersona();
        per1= sp.Clientes.get(0);
        per1.setMascotas(p1);
        sp.crearPersona();        
        //sp.crearPersona();
        sp.mostrarClientes();
        System.out.println("--------------------------");        
        //sp.Adoptar(per1,p1);
        //sp.Adoptar(1,p1);
        //sp.mostrarClientes();
        
    }
    
}
