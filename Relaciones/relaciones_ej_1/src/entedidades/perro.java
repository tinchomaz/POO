/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entedidades;

/**
 *
 * @author serus
 */
public class perro {
    
    
    String nombre;
    String raza;
    String tamano;
    int edad;

    public perro() {
    }

    public perro(String nombre, String raza, String tamano, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", edad=" + edad + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
