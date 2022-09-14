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
public class yates extends barco {
    
    int potenciaYate;
    int camarotes;
    
    @Override
    public int modulo(){
        
       return super.modulo()+ potenciaYate + camarotes;
 
    }

    public yates(int potenciaYate, int camarotes) {
        this.potenciaYate = potenciaYate;
        this.camarotes = camarotes;
    }

    public yates(int potenciaYate, int camarotes, String matricula, int eslora, int año) {
        super(matricula, eslora, año);
        this.potenciaYate = potenciaYate;
        this.camarotes = camarotes;
    }
    
}
