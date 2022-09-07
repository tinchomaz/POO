/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author vluce
 * , de las películas nos interesa saber
el título, duración, edad mínima y director. P
 */
public class Pelicula {
    
    private String Titulo;
    private float  Duracion;
    private int EdadMin;
    private String Direccion;

    public Pelicula() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public float getDuracion() {
        return Duracion;
    }

    public void setDuracion(float Duracion) {
        this.Duracion = Duracion;
    }

    public int getEdadMin() {
        return EdadMin;
    }

    public void setEdadMin(int EdadMin) {
        this.EdadMin = EdadMin;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Duracion=" + Duracion + ", EdadMin=" + EdadMin + ", Direccion=" + Direccion + '}';
    }
    
}
