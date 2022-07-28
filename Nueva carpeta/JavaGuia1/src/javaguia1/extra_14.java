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
public class extra_14 {
 public static void main(String[] args) {
        // TODO code application logic here
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.*/
        Scanner leer=new Scanner(System.in);
        System.out.println("cuantas familias son");
        int N=leer.nextInt();
        System.out.println("cuantos hijos tienen");
        int M=leer.nextInt();
        int [][] Familia=new int [N][M];
        int edad=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.println("cuantos año tiene el hijo: " + (j+1));
                Familia[i][j]=leer.nextInt();
                edad+=Familia[i][j];
            }
        }
        System.out.println("el promedio de engendros es "+ edad/(M*N));
    }
    
}   

