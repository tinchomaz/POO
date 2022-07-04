/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidad.Rectangulo;
import java.util.Scanner;
import Servicios.RectanguloS;
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
        /*LLAMAR AL CREADOR DE RECTANGULOS*/
        RectanguloS rec=new RectanguloS();
        /*-------------------------------*/
        Rectangulo rec1=rec.CRectangulo();
        
        /*LLAMAMOS A REC.PERIMETRO Y LE PONEMOS LA VARIABLE REC1 PARA QUE CREE SU PERIMETRO EN LA CLASE SERVICIO*/
        rec.Perimetro(rec1);
        /*------------------------------------------------------------------------------------------------------*/
        rec.Superficie(rec1);
        System.out.println(rec1.toString());
    }
    }
    

