/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

import java.util.Scanner;

/**
 *
 * @author serus
 */
public class Ejemplo_nº_10 {
    

     /* @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
    números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
    Scanner leer=new Scanner(System.in);
    int limite=leer.nextInt();
    int num;
    int suma=0;
    do{
        num=leer.nextInt();
        suma=suma+num;
    }while(suma<limite);
    
    }
    
}
