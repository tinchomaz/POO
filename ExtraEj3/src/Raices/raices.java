/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raices;

/**
 *
 * @author serus
 */
public class raices {
    
    public double a;
    public double b;
    public double c;

    public raices() {
    }

    public raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
    
    
    
}
