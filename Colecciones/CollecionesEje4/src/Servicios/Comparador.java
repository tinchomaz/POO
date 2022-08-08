/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Comparator;
import Entidades.Pelicula;

/**
 *
 * @author Flores
 */
public class Comparador {

public static Comparator<Pelicula> ordenaPorDuracion = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t1.getDuracion().compareTo(t.getDuracion());
    }
};
public static Comparator<Pelicula> ordenaPorCorta = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t1, Pelicula t) {
        return t1.getDuracion().compareTo(t.getDuracion());
    }
};
public static Comparator<Pelicula> ordenaPorTitulo = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t1, Pelicula t) {
        return t1.getTitulo().compareTo(t.getTitulo());
    }
};
public static Comparator<Pelicula> ordenaPorDirector = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula t1, Pelicula t) {
        return t1.getDirector().compareTo(t.getDirector());
    }
};
}