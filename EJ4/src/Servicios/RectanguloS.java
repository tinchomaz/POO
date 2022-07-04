/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Rectangulo;
import java.util.Scanner;
/**
 *
 * 
 */
public class RectanguloS {
    Scanner leer=new Scanner(System.in);
    public Rectangulo CRectangulo(){
        Rectangulo rec=new Rectangulo();
        System.out.println("ingrese altura");
        rec.setAltura(leer.nextInt());
        System.out.println("ingrese base");
        rec.setBase(leer.nextInt());
        return rec;
    }
    public void Perimetro(Rectangulo rec){
        rec.setPerimetro((rec.getAltura()+rec.getBase())*2);
    }
    public void Superficie(Rectangulo rec){
        rec.setSuperficie(rec.getAltura()*rec.getBase());
    }
}
