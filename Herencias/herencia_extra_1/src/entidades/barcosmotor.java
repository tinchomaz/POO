/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author serus
 */
public class barcosmotor extends barco {
    
    int potencia;
    
    @Override
    public int modulo(){
        
       return super.modulo()+ potencia;
 
    }

    public barcosmotor(int potencia) {
        this.potencia = potencia;
    }

    public barcosmotor(int potencia, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.potencia = potencia;
    }
    
    
}
