package Main;

import Entidades.Pelicula;
import Servicios.ServiciosPeli;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flores
 */
public class Pelis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        ServiciosPeli obj=new ServiciosPeli();
        
        obj.Crearpeli();
        obj.MostrarPeli();
        obj.MostrarCorta();
        obj.MostrarTitulo();
        obj.MostrarDirector();
    }
    
}
