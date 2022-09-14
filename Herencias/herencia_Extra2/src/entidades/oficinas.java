/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author vluce
 */
public class oficinas  extends edificio {
    int nroOfic;
    int cantPers;
    int nroPisos;

    public oficinas(int nroOfic, int cantPers, int nroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroOfic = nroOfic;
        this.cantPers = cantPers;
        this.nroPisos = nroPisos;
    }

    public int getNroOfic() {
        return nroOfic;
    }

    public void setNroOfic(int nroOfic) {
        this.nroOfic = nroOfic;
    }

    public int getCantPers() {
        return cantPers;
    }

    public void setCantPers(int cantPers) {
        this.cantPers = cantPers;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
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
        return "oficinas{" + "nroOfic=" + nroOfic + ", cantPers=" + cantPers + ", nroPisos=" + nroPisos + '}';
    }
    
    /*  @Override
    public  int  calcularSuperficie(){
    return  ;
    }  
    
        @Override
    public   int calcularVolumen(){
    return 0 ;
}; */ 
    
    public int cantPersonas(){
       return  (  nroOfic * cantPers  ) ;
    };



    
    
}
