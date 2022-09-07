/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author vluce
 */
public class Asiento {
private String Fila;
private String Posicion;
private Espectador Persona;

    public Asiento(String Fila, String Posicion) {
        this.Fila = Fila;
        this.Posicion = Posicion;
    }

    public String getFila() {
        return Fila;
    }

    public void setFila(String Fila) {
        this.Fila = Fila;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public Espectador getPersona() {
        return Persona;
    }

    public void setPersona(Espectador Persona) {
        this.Persona = Persona;
    }

    @Override
    public String toString() {
        return "Asiento{" + "Fila=" + Fila + ", Posicion=" + Posicion + ", Persona=" + Persona + '}';
    }
    

}
