/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosRaices;

import Raices.raices;
import java.util.Scanner;

/**• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. 
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 *
 * @author serus
 */
public class serviciosRaices {
    
    public raices crear(){
        
        raices r1 = new raices();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente a ");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el coeficiente b ");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el coeficiente c ");
        r1.setC(leer.nextDouble());
        
        return r1;
        }
  
/*• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c */
    
    public double dis(raices disc){
        
        System.out.println(Math.pow((disc.getB()),2)-(4*disc.getA()*disc.getC()));
        return Math.pow((disc.getB()),2)-(4*disc.getA()*disc.getC());
        
    }
    
    /* Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. */
    
    public boolean tieneraices(raices tiene){

    if(this.dis(tiene)>= 0)
    {
    
      return true;
    }else
        return false;
}

/*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. */
    
    public boolean solocero(raices tiene){

    if(this.dis(tiene) == 0)
    {
    
      return true;
    }else
        return false;
}


/*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
soluciones.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b        */ 

public void obtener(raices ob){
    double res;
    if(this.tieneraices(ob)){
        res=(ob.getB()*(-1)) + (Math.sqrt(Math.pow((ob.b),2)-(4*ob.a*ob.c)))/(2*ob.a);
        System.out.println(res + " raiz 1 ");
        res=(ob.getB()*(-1)) - (Math.sqrt(Math.pow((ob.b),2)-(4*ob.a*ob.c)))/(2*ob.a);
        System.out.println(res + " raiz 2 ");
    }else
        System.out.println(" No tiene raiz ");
        
}    

/*• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. */


public void obtenerraiz(raices ob){
    double res;
    if(this.solocero(ob)){
        res=(ob.getB()*-1)+ (Math.sqrt(Math.pow((ob.b),2)-(4*ob.a*ob.c)))/(2*ob.a);
        System.out.println(res + " raiz ");
        
        
    }else
        System.out.println(" No tiene raiz ");
}


/* Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje. */


public void calcular(raices cal){
    
    if(this.solocero(cal)){
        this.obtenerraiz(cal);
        
    }else if(this.tieneraices(cal)){
        this.obtener(cal);
    }else
        System.out.println("No tiene raiz");
        
            
    
}









}