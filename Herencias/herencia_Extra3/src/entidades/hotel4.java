/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las 
características de las distintas categorías son las siguientes: 
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
 */
public class hotel4  extends alojamiento {
    
    int cantHabitaciones;
    int nroCamas; 
    int cantPisos; 
    int precioHab;   // precio  
    String gimnasio;  
    String nomRestaurant; 
    int capRestaurant;
    
    
    public hotel4(int cantHabitaciones, int nroCamas, int cantPisos, int precioHab, String gimnasio, String nomRestaurant, int capRestaurant, String nombre, String dirección, String localidad, String gerente) {
        super(nombre, dirección, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
        this.gimnasio = gimnasio;
        this.nomRestaurant = nomRestaurant;
        this.capRestaurant = capRestaurant;
    }

    
    public int precioHabitacion(){        
        int valor   = 0;        
        int valorGim= 0;        
        if( this.capRestaurant <30  )  {
            valor = 10;
        }else if ( this.capRestaurant >=30 && this.capRestaurant < 50  )  {
            valor = 30;
        }else {
            valor = 50;
        }
        valorGim = (this.gimnasio.equalsIgnoreCase("Gim-A")? 50 : 30 );
        return ( 50 + (this.nroCamas * 1) + valor  + valorGim ) ;
    }
    
    
    
    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public int getCapRestaurant() {
        return capRestaurant;
    }

    public void setCapRestaurant(int capRestaurant) {
        this.capRestaurant = capRestaurant;
    }

  
    @Override
    public String toString() {
        return "hotel4{" + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", precioHab=" + precioHab + ", gimnasio=" + gimnasio + ", nomRestaurant=" + nomRestaurant + ", capRestaurant=" + capRestaurant + '}';
    }

        
    
}
