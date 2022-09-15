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
public class residencias extends extras {
    
    int cantHabitaciones; 
    boolean dtoSindicatos; 
    boolean camDeportes; 

    public residencias(int cantHabitaciones, boolean dtoSindicatos, boolean camDeportes, boolean privado, int metros, String nombre, String dirección, String localidad, String gerente) {
        super(privado, metros, nombre, dirección, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.dtoSindicatos = dtoSindicatos;
        this.camDeportes = camDeportes;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDtoSindicatos() {
        return dtoSindicatos;
    }

    public void setDtoSindicatos(boolean dtoSindicatos) {
        this.dtoSindicatos = dtoSindicatos;
    }

    public boolean isCamDeportes() {
        return camDeportes;
    }

    public void setCamDeportes(boolean camDeportes) {
        this.camDeportes = camDeportes;
    }

    
}
