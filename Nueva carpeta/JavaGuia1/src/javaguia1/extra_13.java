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
public class extra_13 {
   
public static void main(String[] args) {
        // TODO code application logic here
        /*13. Crear un programa que dibuje una escalera de números, donde cada línea de números
        comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
        usuario al comenzar. Ejemplo: si se ingresa el número 3:
        1
        12
        123*/
        
        Scanner leer=new Scanner(System.in);
        int escalera=leer.nextInt();
        for(int i=0;i<escalera;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
    

