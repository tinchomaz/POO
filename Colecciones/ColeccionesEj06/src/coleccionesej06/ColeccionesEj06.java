/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej06;

import ServiciosAlmacen.salmacen;
import java.util.Scanner;

/**6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 *
 * @author serus
 */
public class ColeccionesEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        salmacen sa = new salmacen();
        
       int menu=0;
       int art=1;
       Scanner leer = new Scanner(System.in);
       
       do{
           System.out.println(" 1- Ingresar articulo");
           System.out.println(" 2- Modificar precio");
           System.out.println(" 3- Eliminar articulo");
           System.out.println(" 4- Mostrar Stock");
           System.out.println(" 5- Salir");
           
           menu=leer.nextInt();
           
           switch(menu){
               case 1: sa.introducirelemento(art++);
               break;
               case 2: sa.modificarPrecio();
               break;
               case 3: sa.elminar();
               break;
               case 4: sa.mostrarStock();
               break;
              
           }
                   
            }while (menu!=5);
       
        
        
        
     
        
        
        
        
    }
    
}
