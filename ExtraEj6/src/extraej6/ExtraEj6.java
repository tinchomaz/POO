/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej6;

import Entidades.Ahorcado;
import Servicios.ServiciosAhorcado;

/**
 *
 * @author vluce
 */
public class ExtraEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ahorcado juego = new Ahorcado();
        ServiciosAhorcado sa = new  ServiciosAhorcado();
        juego = sa.crearJuego();
        System.out.println(juego.toString());
        sa.juego(juego,  5 );
    }
    
}
