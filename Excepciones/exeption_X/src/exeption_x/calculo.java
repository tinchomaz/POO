/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption_x;

/**
 *
 * @author vluce
 */
public class calculo {
   
    public int division (int A , int B)  throws Exception {
        int c =0; 
        try{
            c= A/B;
        }catch (Exception er){
            throw (er);
        }            
        return  c; 
    }
}
