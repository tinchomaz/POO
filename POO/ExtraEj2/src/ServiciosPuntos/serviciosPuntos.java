/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosPuntos;

import Puntos.puntos;
import java.util.Scanner;

/**
 *
 * @author serus
 */
public class serviciosPuntos {
    
    /*Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto.*/
    
    
    public puntos crearpuntos(){
        
        Scanner leer = new Scanner(System.in);
        puntos var = new puntos();
        System.out.println(" ingrese el primer numero");
        var.setX(leer.nextDouble());
        System.out.println(" ingrese el segundo numero");
        var.setY(leer.nextDouble());
        return var;
}
    
    
    /*Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos.*/
    
    public void calcular(puntos punto1,puntos punto2){
        
        double res;
        res = Math.sqrt(Math.pow((punto1.getX()-punto2.getX()),2) + Math.pow((punto1.getY()-punto2.getY()),2));
        
        System.out.println(res);
        
        
    }
    
}
