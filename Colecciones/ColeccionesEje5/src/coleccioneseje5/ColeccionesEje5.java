/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccioneseje5;

import Servicios.ServiciosPais;

/**
 
 */
public class ColeccionesEje5 {


    public static void main(String[] args) {
       
        ServiciosPais sp = new ServiciosPais(); 
        
        sp.cargarPaises();
        sp.mostrarPaises();
        sp.revisarPais();
        sp.mostrarPaises();
    }
    
}
