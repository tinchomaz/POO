/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

/**
 *
 * @author serus
 */
public class puntos {
    
    public double x;
    public double y;

    public puntos() {
    }

    public puntos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "puntos{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
