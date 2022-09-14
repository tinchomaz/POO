/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
a Edificio con los siguientes atributos: ancho, alto y largo. La clase 
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
 */
public   class edificio {
    protected int ancho;
    protected int alto;
    protected int largo;

    public edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto  = alto;
        this.largo = largo;
    }
    
        
public  int  calcularSuperficie(){
    return ancho  * largo ;            
};

public   int calcularVolumen(){
    return ancho  * largo  * alto ;        
}; 

    @Override
    public String toString() {
        return "edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }



}
