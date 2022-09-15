/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 Los alojamientos se identifican por un nombre, una dirección, 
una localidad y un gerente encargado del lugar
 */
public class alojamiento {
 protected String nombre ; 
 protected String dirección;
 protected String localidad;
 protected String gerente;

    public alojamiento(String nombre, String dirección, String localidad, String gerente) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    
    @Override
    public String toString() {
        return "alojamiento{" + "nombre=" + nombre + ", direcci\u00f3n=" + dirección + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }
    
 
    
}
