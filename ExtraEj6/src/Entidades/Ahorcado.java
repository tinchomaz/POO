/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como 
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad 
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los 
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
public class Ahorcado {
    public  char[]  Palabra  ; 
    public  int  encontradas; 
    public  int  jugadas; 

    public Ahorcado() {
    }
    
     public Ahorcado(int   tamanio) {
         Palabra  = new char[tamanio]; 
    }

    public Ahorcado(char[] Palabra, int encontradas, int jugadas) {
        this.Palabra = Palabra;
        this.encontradas = encontradas;
        this.jugadas = jugadas;
    }

    public char[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(char[] Palabra) {
        this.Palabra = Palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        String  texto= "" ; 
        for ( int i = 0 ; i< Palabra.length ; i++) {
            System.out.print(this.Palabra[i]);
        }
        return "Ahorcado{" + "Palabra=" + Palabra + ", encontradas=" + encontradas + ", jugadas=" + jugadas + '}';
    }

    
    
    
}
