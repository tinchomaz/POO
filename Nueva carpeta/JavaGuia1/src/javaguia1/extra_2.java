/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

/**
 *
 * @author serus
 */
public class extra_2 {
    
public static void main(String[] args) {
        
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int camb=0;
        
        System.out.println("Los valores iniciales son: A="+A);
        System.out.println("Los valores iniciales son: B="+B);
        System.out.println("Los valores iniciales son: C="+C);
        System.out.println("Los valores iniciales son: D="+D);
        System.out.println("------------------------------");
        
        camb=B;
        B=C;
        C=A;
        A=D;
        D=camb;
     
        System.out.println("Los valores finales son: A="+A);
        System.out.println("Los valores finales son: B="+B);
        System.out.println("Los valores finales son: C="+C);
        System.out.println("Los valores finales son: D="+D);
        System.out.println("------------------------------");
        
 }
}
