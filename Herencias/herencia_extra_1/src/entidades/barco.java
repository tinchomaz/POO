/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/** su matrícula, su eslora en metros y año de fabricación.
 *
 * @author serus
 */
public class barco {
    
    protected String matricula;
    protected int eslora;
    protected int año;

    public barco() {
    }

    public int modulo(){
        
        return eslora*10;
    }
    
            
    public barco(String matricula, int eslora, int año) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año = año;
    }

    @Override
    public String toString() {
        return "barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
