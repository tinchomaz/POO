/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.Comparator;

/**
 *
 * @author vluce
 */
public class Comparadores {
      
public static Comparator<Alumno> ordenaPorVotos = new Comparator<Alumno>() {
    @Override
    public int compare(Alumno p1, Alumno p2) {
        return  p2.getCntVotos().compareTo(p1.getCntVotos());
    }
};    
}
