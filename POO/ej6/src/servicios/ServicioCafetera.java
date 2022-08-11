/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ServicioCafetera {
    public void llenarCafetera(Cafetera Cafe){
        Cafe.setCantidadActual(Cafe.getCapacidadMaxima());
    
    }
    public void servirTaza(Cafetera Cafe, int volumenTaza){
        if (Cafe.getCantidadActual()>=volumenTaza){
      Cafe.setCantidadActual(Cafe.getCantidadActual()-volumenTaza);
        }else {
            System.out.println("No hay suficiente café para esta taza");
        Cafe.setCantidadActual(0);
        }
       
    }
    public void vaciarCafetera(Cafetera Cafe){
        Cafe.setCantidadActual(0);
    }
    public void agregarCafe (Cafetera Cafe){
        int cantidad;
        Scanner Leer=new Scanner (System.in);
        System.out.println("ingrese la cantidad de café a agregar en ml");
        cantidad=Leer.nextInt();
        if(Cafe.getCantidadActual()+cantidad<=Cafe.getCapacidadMaxima()){
        Cafe.setCantidadActual(Cafe.getCantidadActual()+cantidad);  
        }else {
            System.out.println("La cafetera se va a revalsar...");
        }      
    }
    
    
}
