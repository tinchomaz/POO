/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraEj3;

import Raices.raices;
import ServiciosRaices.serviciosRaices;

/**
 *
 * @author serus
 */
public class ExtraEJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    raices r = new raices();
    serviciosRaices sr = new serviciosRaices();
    
    r = sr.crear();
    
    sr.calcular(r);
    
    


    }


    
}
