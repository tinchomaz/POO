/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosAlmacen;

import EntidadesAlmacen.ealmacen;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author serus
 */
public class salmacen {
    
    HashMap<Integer, ealmacen> stock = new HashMap();
    
    Scanner leer = new Scanner(System.in);
    
public void introducirelemento (int art){
    
    
    ealmacen ea = new ealmacen();
    System.out.println("Ingrese el articulo");
    ea.setArticulo(leer.next());
    System.out.println("Ingrese el precio del producto");
    ea.setPrecio(leer.nextInt());
    System.out.println("Ingrese cantidad del producto");
    ea.setStock(leer.nextInt());
    
    
    stock.put(art,ea);

    
}    

public void elminar(){
    
    mostrarStock();
    int articulo;
    System.out.println("Ingrese el Codigo a eliminar");
    articulo=leer.nextInt();
    stock.remove(articulo);
   
    
    
}

 public void modificarPrecio(){
    
    mostrarStock();
    int articulo;
    int newprecio;
    System.out.println("Ingrese el Codigo para modificar precio");
    articulo=leer.nextInt();
     System.out.println("Ingrese el nuevo precio");
     newprecio=leer.nextInt();
    stock.get(articulo).setPrecio(newprecio);

}

public void mostrarStock(){
     
     for (Map.Entry<Integer,ealmacen> entry: stock.entrySet()){
         System.out.println(entry.getValue().toString() + " CODIGO " + entry.getKey());
     }
     
 }   
    
}
