/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**l nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 *
 * @author serus
 */
public class alquiler {
    
    String cliente;
    int dni;
    Date fechaalq;
    Date fechadev;
    int amarre;
    barco barco;

    public alquiler() {
    }

    /* Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora). */
    
    public int calcularAlquier(){
       
        
        
        Date fecha;
        double aux;
        
        aux = (fechadev.getTime()- fechaalq.getTime());
       
        aux = aux/60/60/1000/24;
        
        
        System.out.println("Dias de amarre: " + (int)aux);
        System.out.println("--------------------------");
        aux = aux * barco.modulo();
        
        
                
     return (int)aux;   
    }
    
    
    public alquiler(String cliente, int dni, Date fechaalq, Date fechadev, int amarre, barco barco) {
        this.cliente = cliente;
        this.dni = dni;
        this.fechaalq = fechaalq;
        this.fechadev = fechadev;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaalq() {
        return fechaalq;
    }

    public void setFechaalq(Date fechaalq) {
        this.fechaalq = fechaalq;
    }

    public Date getFechadev() {
        return fechadev;
    }

    public void setFechadev(Date fechadev) {
        this.fechadev = fechadev;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public barco getBarco() {
        return barco;
    }

    public void setBarco(barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "alquiler{" + "cliente=" + cliente + ", dni=" + dni + ", fechaalq=" + fechaalq + ", fechadev=" + fechadev + ", amarre=" + amarre + ", barco=" + barco.toString() + '}';
    }
    
    
    
    
    
}
