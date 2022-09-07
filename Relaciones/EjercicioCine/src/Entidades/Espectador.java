/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author vluce
 * , del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible
 */
public class Espectador {
    
    private String nombre;
    private Date   FecNacimiento;
    private int    Saldo; 

    public Espectador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecNacimiento() {
        return FecNacimiento;
    }

    public void setFecNacimiento(Date FecNacimiento) {
        this.FecNacimiento = FecNacimiento;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", FecNacimiento=" + 
                String.valueOf(FecNacimiento.getDate())    +"/"+  
                String.valueOf(FecNacimiento.getMonth()+1) +"/"+  
                String.valueOf(1900 + FecNacimiento.getYear()) +
                " Edad: "  + String.valueOf( 
                                             ((new Date()).getYear() - FecNacimiento.getYear())
                                            ) +
                ", Saldo=" + Saldo + '}';
    }
    
    
}
