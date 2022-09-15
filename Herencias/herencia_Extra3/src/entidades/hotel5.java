/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 
 * 

* 
 */
public class hotel5  extends hotel4 {
 int cantSalones; 
 int cantSuites;
 int cantLimosinas;

 public hotel5(int cantSalones, int cantSuites, int cantLimosinas, int cantHabitaciones, int nroCamas, int cantPisos, int precioHab, String gimnasio, String nomRestaurant, int capRestaurant, String nombre, String dirección, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHab, gimnasio, nomRestaurant, capRestaurant, nombre, dirección, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    
    public int precioHabitacion(){        
        return super.precioHabitacion() + (15 * this.cantLimosinas ) ;
    }
    
    
    @Override
    public String toString() {
        return "hotel5{" + super.toString() +  "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

        
 
 
}
