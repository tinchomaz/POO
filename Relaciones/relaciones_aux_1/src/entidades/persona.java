/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author vluce
 */
public class persona {
    private String nombre;
    private int    dni;
    //public ArrayList<perro> Mascotas;     
    public perro  Mascotas;     

    public persona() {
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", dni=" + dni + ", Mascotas=" + Mascotas + '}';
    }

    public persona(String nombre, int dni, perro Mascotas) {
        this.nombre = nombre;
        this.dni = dni;
        this.Mascotas = Mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public perro getMascotas() {
        return Mascotas;
    }

    public void setMascotas(perro Mascotas) {
        this.Mascotas = Mascotas;
    }
    
    
    
}
