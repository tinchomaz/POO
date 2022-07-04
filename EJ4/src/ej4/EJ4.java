/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Flores
 */
public class EJ4 {

    /**
     * 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Rectangulo rec1;
        rec1=new Rectangulo(leer.nextInt(),leer.nextInt());
        
       rec1.setPerimetro((rec1.getAltura()+rec1.getBase())*2);
       rec1.setSuperficie(rec1.getAltura()*rec1.getBase());
        System.out.println(rec1.toString());
    }
    }
    

