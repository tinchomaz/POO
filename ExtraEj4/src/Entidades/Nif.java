/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * 4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su 
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra 
(String o char) que le corresponde. Dispondrá de los siguientes métodos: 
• Métodos getters y setters para el número de DNI y la letra.
 */
public class Nif {
    public long DNI ; 
    public String LETRA;

    public Nif() {
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLETRA() {
        return LETRA;
    }

    public void setLETRA(String LETRA) {
        this.LETRA = LETRA;
    }

    @Override
    public String toString() {
        return "Nif= " + DNI + "-" + LETRA ;
    }
    
}
