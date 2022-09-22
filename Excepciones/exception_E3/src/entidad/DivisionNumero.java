/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author vluce
 */
public class DivisionNumero {
    private int numA ; 
    private int numB ; 

    public DivisionNumero() {
    }

    
    public DivisionNumero(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "numA=" + numA + ", numB=" + numB + '}';
    }
    
    
    
}
