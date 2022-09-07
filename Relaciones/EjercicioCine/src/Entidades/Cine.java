/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author vluce
 * que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
public class Cine {
    private String nombre;
    private Asiento[][] Sala = new Asiento[6][8];
    private Pelicula Peli;
    private int  Precio;
    
    public Cine() {
    }

    public String getNombre() {
        return nombre;
    }

     public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
     
     public int getPrecio() {
        return this.Precio;
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asiento[][] getSala() {
        return Sala;
    }

    public void setSala(Asiento[][] Sala) {
        this.Sala = Sala;
    }

    public Pelicula getPeli() {
        return Peli;
    }

    public void setPeli(Pelicula Peli) {
        this.Peli = Peli;
    }

    @Override
    public String toString() {
        return "Cine{" + "nombre=" + nombre + ", Sala=" + Sala + ", Peli=" + Peli + '}';
    }

                
}
