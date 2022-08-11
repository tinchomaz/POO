package coleccioneseje03;
import Servicios.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author vluce
*/
public class Arreglos {
    
public static void main(String[] args) {
   ArrayList<Integer> vector1 = new ArrayList();
   int Cantidad  = 10000; 
   int busquedas =  5000; 
   int valor = 0; 
   int aciertos = 0; 
   boolean encontrado = false;   
   Date inicio = new Date();   
   Date inicio2= new Date();   
   long tiempo1 =0; 
   System.out.println("Test para control de performance de arreglos de datos");
   for (int i=0; i< Cantidad  ; i++){
       vector1.add(   (int)  (Math.random() * 150000)  );
   }
   tiempo1 =  ( (new Date().getTime()) - inicio.getTime()  );
   System.out.println("Vector completo de datos en :" + tiempo1 + " segundos, " + vector1.size() + " elementos");
   System.out.println("Inicio ciclo de busquedas");
   inicio2 = new Date();   
   for (int i=0; i< busquedas ; i++){
       valor =  (int)  (Math.random() * 15000);
       encontrado = false;    
       for (Integer var : vector1 ) {
           if (var.equals(valor) ) {           
               encontrado = true;
               break;
           }
       }
       if (encontrado ) {
           aciertos++;
       }
   }
   tiempo1 =  ( (new Date().getTime()) - inicio2.getTime()  );
   System.out.println("Cantidad de busquedas (sin ordenar) " + busquedas );    
   System.out.println("Cantidad de aciertos  " + aciertos );   
   System.out.println("Tiempo total :" + tiempo1 + " segundos");
   System.out.println("///////////// PROCESO ORDENANDO DATOS ///////////////");
   inicio2 = new Date();   
   Collections.sort(vector1, Comparadores.ordenaLista );
   tiempo1 =  ( (new Date().getTime()) - inicio2.getTime()  );
    aciertos = 0; 
   System.out.println("Tiempo de Ordenamiento de la lista : " + tiempo1 + " segundos");
   System.out.println("Inicio ciclo de busquedas");
   inicio2 = new Date();   
   for (int i=0; i< busquedas ; i++){
       valor =  (int)  (Math.random() * 15000);
       encontrado = false;         
       if (vector1.contains(valor ))  {           
               encontrado = true; 
           }       
       if (encontrado ) {
           aciertos++;
       }
   }
   tiempo1 =  ( (new Date().getTime()) - inicio2.getTime()  );
   System.out.println("Cantidad de busquedas (ordenada) " + busquedas );    
   System.out.println("Cantidad de aciertos  " + aciertos );   
   System.out.println("Tiempo total :" + tiempo1 + " segundos");
   System.out.println("--------- UTILIZANDO UN SET --------------------");
   //HashSet<Integer>  vector2 = new HashSet();    
   TreeSet<Integer>  vector2 = new TreeSet();    
   inicio2 = new Date();   
   for (int i=0; i<Cantidad ;i++ ){
      vector2.add(   (int)  (Math.random() * 150000)  );       
   };
   tiempo1 =  ( (new Date().getTime()) - inicio2.getTime()  );
   System.out.println("El vector2 , tiene :" + vector2.size() + " elementos (distintos) de (" + Cantidad + " elementos agregados)");
   System.out.println("Demando :" + tiempo1 + " llenarlo");
   System.out.println("Inicio ciclo de busquedas en el Conjunto ");
   inicio2 = new Date();   
   aciertos=0; 
   for (int i=0; i< busquedas ; i++){
       valor =  (int)  (Math.random() * 15000);       
       encontrado = false;         
       if (vector2.contains(valor ))  {           
               encontrado = true; 
           }       
       if (encontrado ) {
           aciertos++;
       }
   }
   tiempo1 =  ( (new Date().getTime()) - inicio2.getTime()  );
   System.out.println("Cantidad de busquedas " + busquedas );    
   System.out.println("Cantidad de aciertos  " + aciertos );   
   System.out.println("Tiempo total :" + tiempo1 + " segundos");
  /* for (Integer var : vector2) {
       System.out.println( var.toString());               
   }*/
   }
}
