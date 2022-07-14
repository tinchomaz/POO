/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej2;

import Puntos.puntos;
import ServiciosPuntos.serviciosPuntos;

/**
 *
 * @author serus
 */
public class ExtraEj2 {

    /**
     * @2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link:
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    puntos punto1 = new puntos();
    puntos punto2 = new puntos();
    serviciosPuntos sp = new serviciosPuntos();
    
    punto1 = sp.crearpuntos();
    punto2 = sp.crearpuntos();
    
    System.out.println(punto1.toString()+punto2.toString());
    
    
    sp.calcular(punto1, punto2);
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
