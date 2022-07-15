/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

/**
 *
 * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. 
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en 
mayúscula; por ejemplo: 00395469-F).

 */
public class ServiciosNif {
    
    public Nif crearNif(){
        Scanner   leer  = new Scanner(System.in);
        Nif user = new Nif();
        System.out.println("Ingrrese el DNI del usuario:");  
        user.setDNI(leer.nextLong() );
        user.setLETRA( calcularDig( user.getDNI() ) );
        return user; 
    }
    /**
     * La letra correspondiente al dígito verificador se calculará a traves de un método que 
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número 
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en 
un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente.
     */
    public String  calcularDig( long  pDNI ){
        String[] verificador = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resto = 0; 
        resto = (int) pDNI%23;
        System.out.println(resto);
        return verificador[resto]; 
    }    
}