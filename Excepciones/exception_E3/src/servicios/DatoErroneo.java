/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author vluce
 */
public class DatoErroneo extends Exception {

    /**
     * Creates a new instance of <code>DatoErroneo</code> without detail
     * message.
     */
   
   
    public DatoErroneo() {
        
    }

    /**
     * Constructs an instance of <code>DatoErroneo</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DatoErroneo(String msg) {
        super(msg);       
    }    
    
}
