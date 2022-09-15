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
public class camping  extends extras {
    
    int capMax; 
    int canBanios; 
    boolean conRestaurant; 

    public camping(int capMax, int canBanios, boolean conRestaurant, boolean privado, int metros, String nombre, String dirección, String localidad, String gerente) {
        super(privado, metros, nombre, dirección, localidad, gerente);
        this.capMax = capMax;
        this.canBanios = canBanios;
        this.conRestaurant = conRestaurant;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCanBanios() {
        return canBanios;
    }

    public void setCanBanios(int canBanios) {
        this.canBanios = canBanios;
    }

    public boolean isConRestaurant() {
        return conRestaurant;
    }

    public void setConRestaurant(boolean conRestaurant) {
        this.conRestaurant = conRestaurant;
    }

    
    @Override
    public String toString() {
        return super.toString() +  "camping{" + "capMax=" + capMax + ", canBanios=" + canBanios + ", conRestaurant=" + conRestaurant + '}';
    }

    
}
