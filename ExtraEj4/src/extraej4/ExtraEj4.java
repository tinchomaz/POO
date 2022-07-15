/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej4;

import Entidades.Nif;
import Servicios.ServiciosNif;

/**
 *
 * @author vluce
 */
public class ExtraEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nif  usuario = new Nif();
        ServiciosNif sn = new ServiciosNif();
        
        usuario = sn.crearNif();
        System.out.println( usuario.toString());
        
    }
    
}
