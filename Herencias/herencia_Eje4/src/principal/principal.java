
package principal;

import entidades.circulo;
import entidades.rectangulo;


public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------- CIRCULOS -----------");
        circulo cir1 = new circulo(3);         
        System.out.println(" AREA     : " +    cir1.area() ); 
        System.out.println(" PERIMETRO: " +    cir1.perimetro()); 
        System.out.println("-------- RECTANGULO -----------");
        rectangulo rec1 = new rectangulo(3,8);         
        System.out.println(" AREA     : " +    rec1.area() ); 
        System.out.println(" PERIMETRO: " +    rec1.perimetro());         
        
    }
    
}
