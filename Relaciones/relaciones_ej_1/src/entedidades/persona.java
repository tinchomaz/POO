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
public class persona {
    
    
    String nombre;
    String apellido;
    int dni;
    int edad;
    perro mascota;

    public persona() {
    }

    public persona(String nombre, String apellido, int dni, int edad, perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public perro getMascota() {
        return mascota;
    }

    public void setMascota(perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", mascota=" + mascota + '}';
    }
    
    
    
    
    
    
    
    
    
}
