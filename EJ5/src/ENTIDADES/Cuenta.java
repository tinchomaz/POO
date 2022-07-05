/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDADES;

/** 
 *
 * @author serus
 */
public class Cuenta {
    
    public int numerodeCuenta;
    public int dni;
    public double saldo;
    
    public Cuenta() {
    }

    public Cuenta(int numerodeCuenta, int dni, double saldo) {
        this.numerodeCuenta = numerodeCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(int numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numerodeCuenta=" + numerodeCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }

    
}
