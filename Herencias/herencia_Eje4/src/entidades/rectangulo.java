/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class rectangulo  implements calculosFormas {
    
    public double base ; 
    public double altura; 

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
       
      
    @Override
    public double area(){
        return ( base * altura  ); 
    };
    @Override
    public double perimetro(){
        return( (base + altura ) * 2 );
    };
}
