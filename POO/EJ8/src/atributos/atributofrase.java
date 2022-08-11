/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributos;

/**
 *
 * @author serus
 */
public class atributofrase {
    
    public String frase;
    public int longitud;
    
    

    public atributofrase() {
    }

    public atributofrase(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "atributofrase{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

   
    
    
}
