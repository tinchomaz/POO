/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * nombre y tipo de instalación que puede ser Techado o 
Abierto
 */
public class poliDeportivo extends edificio {
    
     String   nombre; 
     String   tipoTec;

    public poliDeportivo(String nombre, String tipoTec, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoTec = tipoTec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoTec() {
        return tipoTec;
    }

    public void setTipoTec(String tipoTec) {
        this.tipoTec = tipoTec;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "poliDeportivo{" + "nombre=" + nombre + ", tipoTec=" + tipoTec + '}';
    }
     
    /*                
    @Override
    public  int  calcularSuperficie(){
    return 0;
    };


    @Override
    public   int calcularVolumen(){
    return 0 ;
    }; 
    */ 

}
