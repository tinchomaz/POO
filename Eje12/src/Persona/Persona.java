/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
public class Persona {
  public String nombre;
  public Date nacimiento;
  Scanner leer=new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Persona() {
    }
    public void crearpersona(){
        int dia;
        int mes;
        int anio;
        System.out.println("Ingrese el nombre");
        this.nombre=leer.nextLine();
        System.out.println("Ingrese el dia");
        dia=leer.nextInt();
        System.out.println("Ingrese mes");
        mes=leer.nextInt();
        System.out.println("Ingrese año");
        anio=leer.nextInt();
        this.nacimiento=new Date(anio-1900,mes-1,dia);
    }
    
    public int calcularedad(){
        Date hoy=new Date();
        int edad;
        edad=hoy.getYear()-nacimiento.getYear();
        return edad;
    }
    
    public String menorque(int edad2){
        String res;
        if(this.calcularedad()>edad2){
            res="es mayor que la edad ingresada";
        }else if (this.calcularedad()<edad2) res="es menor que la edad ingresda";
            else {res="tienen la misma edad";}
        return res;
    }
    public void mostrarpersona(){
        System.out.println("la persona se llama: "+ this.nombre);
        System.out.println("la persona nacio en: "+ this.nacimiento);
        System.out.println("la persona tiene la edad de: "+ this.calcularedad());
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + ", leer=" + leer + '}';
    }
}
