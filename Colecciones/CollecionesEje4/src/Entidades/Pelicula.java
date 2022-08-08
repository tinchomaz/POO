package Entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Flores
 */
public class Pelicula{
    
    String director;
    String titulo;
    int Duracion;

    public Pelicula() {
    }

    public Pelicula(String director, String titulo, Integer Duracion) {
        this.director = director;
        this.titulo = titulo;
        this.Duracion = Duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return Duracion;
    }

    public void setDuracion(Integer Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", titulo=" + titulo + ", Duracion=" + Duracion + '}';
    }
    
}
