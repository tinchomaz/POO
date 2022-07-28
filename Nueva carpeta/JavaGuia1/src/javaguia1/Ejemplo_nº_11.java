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
public class Ejemplo_nº_11 {
  public static void main(String[] args) {
Scanner leer=new Scanner(System.in);
    int num1=leer.nextInt();
    int num2=leer.nextInt();
    int opcion=0;
    do{
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
          opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                                                                            break;
                case 4: 
                    System.out.println(num1/num2);
                    break;
            }

    }while(opcion!=5);
}   
}
   


