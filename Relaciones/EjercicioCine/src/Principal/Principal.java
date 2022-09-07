/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Servicios.ServicioCine;

/**
 *
 * @author vluce
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioCine  sc = new ServicioCine(); 
         sc.CrearCine();
         sc.setPrecio(245);
         sc.LlenarCine();
         sc.VerCine();
         System.out.println(sc.getCantidad());
         System.out.println(sc.getRecaudacion());
         
      //   sc = new ServicioCine(); 
         sc.CrearCine();
         sc.setPrecio(450);
         sc.LlenarCine();
         sc.VerCine();
         sc.verGente();
    }
    
}
