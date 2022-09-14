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
public class veleros extends barco {
    
    int mastiles;
    
    @Override
    public int modulo(){
        
       return super.modulo()+ mastiles;
 
    }
    

    public veleros(int mastiles) {
        this.mastiles = mastiles;
    }

    public veleros(int mastiles, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.mastiles = mastiles;
    }
    
    
    
}
