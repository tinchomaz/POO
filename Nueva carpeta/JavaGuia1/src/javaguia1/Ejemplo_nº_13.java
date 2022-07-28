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
public class Ejemplo_nº_13{
 public static void main(String[] args) {
        // TODO code application logic here
    /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *         */
    Scanner leer=new Scanner(System.in);
    int N=leer.nextInt();
    
    for(int i=0;i<N;i++){
        if(i==0 || i==N-1){
        for(int j=0;j<N;j++){
          System.out.print("*");
        }
          System.out.println("");
        }else{for(int j=0;j<N;j++){
            if(j==0){
          System.out.print("*"); 
            }else if(j==N-1){
                System.out.println("*"); 
            }
            else{
                System.out.print(" ");
            }
        }}
            

    }
}
}
 
   