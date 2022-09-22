/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import servicio.Banner;

/**
 *
 * @author vluce
 */
public class principal {

    /**
5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Secreto   = Secreto(); 
        int Intentos =0; 
        int Valor = 0 ; 
        String nada ; 
        String pistas=""; 
        boolean fin = false; 
        boolean acierto = false; 
        /*Banner display = new Banner(); 
        display.escribir(0);
        display.mostrar();
        display.escribir(1);
        display.escribir(2);
        display.mostrar();*/ 
        System.out.println(Secreto);
        do {
           System.out.println(((pistas.length()>0 )? " ingresastes:":"" ) +  pistas);
           System.out.println("Ingrese el valor sugerido para determinar la incognita(1-->500)?");
           fin = false; 
           do{
            try{
                Valor = leer.nextInt();
                fin = true; 
            }catch(Exception err) {
                System.out.println("El valor ingresado no es numerico. Reingreselo nuevamente");
                nada = leer.next();
            } finally{
                Intentos++; 
            }
           }while (!fin) ; 
           if (Valor > Secreto) {
               System.out.println("El valor es MAYOR al esperado...");
           } else if  (Valor < Secreto) {
               System.out.println("El valor es MENOR al esperado...");
           } else {
               acierto = true; 
           }
           pistas= String.valueOf(Valor).concat((pistas.length()!=0)?"#":"").concat(pistas); 
        } while (!acierto); 
        System.out.println("Valor ingresado es el ESPERADO " );
        System.out.println("Cantidad de intentos:" +  Intentos  );
    }
    
    /*
    --------------------------------------------------------------------------------
    */
    
    private static int Secreto(){
        return  (int)(Math.random() * 500 ) + 1   ; 
    }    
}
