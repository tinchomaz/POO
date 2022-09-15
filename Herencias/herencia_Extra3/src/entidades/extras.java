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
public class extras extends alojamiento  {
  boolean privado; 
  int     metros;

    public extras(boolean privado, int metros, String nombre, String dirección, String localidad, String gerente) {
        super(nombre, dirección, localidad, gerente);
        this.privado = privado;
        this.metros = metros;
    }

    @Override
    public String toString() {
        return  super.toString() +  "extras{" + "privado=" + privado + ", metros=" + metros + '}';
    }

    
    
}
