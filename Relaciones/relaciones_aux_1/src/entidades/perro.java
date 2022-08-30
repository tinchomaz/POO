/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author vluce
 */
public class perro {
    private   String Nombre; 
    private   String Tamanio;
    private   String Raza; 

    @Override
    public String toString() {
        return "perro{" + "Nombre=" + Nombre + ", Tamanio=" + Tamanio + ", Raza=" + Raza + '}';
    }

    public perro() {
    }

    public perro(String Nombre, String Tamanio, String Raza) {
        this.Nombre = Nombre;
        this.Tamanio = Tamanio;
        this.Raza = Raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    
}
