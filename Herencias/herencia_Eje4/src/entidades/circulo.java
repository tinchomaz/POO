/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class circulo  implements calculosFormas {
    
    public double radio; 

    public circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double area(){
        return ( PI * (radio * radio )  ); 
    };
    @Override
    public double perimetro(){
        return( PI * ( radio + radio ) );
    };

}
