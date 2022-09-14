
package herencia_extra2;

import entidades.edificio;
import entidades.oficinas;
import entidades.poliDeportivo;
import java.util.ArrayList;


public class Herencia_Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<edificio>  edi   = new ArrayList(); 
       oficinas of1 = new oficinas(3 , 4 , 3 , 25, 45, 50);
       edi.add(of1);
       oficinas of2 = new oficinas(5 , 4 , 5 , 55, 45, 80);
       edi.add(of2);
       poliDeportivo pol1 = new poliDeportivo("Villa Deportiva 1", "CUBIERTO", 100, 30, 50); 
       edi.add(pol1);
       poliDeportivo pol2 = new poliDeportivo("Club Actividades Libre", "ABIERTO", 100, 0, 150); 
       edi.add(pol2);
       int  cont =0; 
       int  cantPersonas =0;
       int  cantTechados =0; 
       int  cantAbiertos =0; 
       for (edificio aux : edi ) {
           cont++; 
           System.out.println( "Superficie de edificio " + cont  + " : " +  aux.calcularSuperficie() +" m2 ||" +   
                               " Volumen total:"  + aux.calcularVolumen() + " m3");
           if (aux.getClass().getTypeName()  == "entidades.oficinas"  ){
               oficinas aux2 = (oficinas) aux;  
              System.out.println(" Cantidad de personas: "  +  aux2.cantPersonas()  );
              cantPersonas = cantPersonas + aux2.cantPersonas();
           } else {
               poliDeportivo aux2 = (poliDeportivo) aux;  
               if (aux2.getTipoTec() =="CUBIERTO") {
                   cantTechados++;
               }else {
                   cantAbiertos++;
               }
           };          
       }
        System.out.println("Cantidad  total de personas : " + cantPersonas);              
        System.out.println("Cantidad  Polideportivos Techados : " + cantTechados);              
        System.out.println("Cantidad  Polideportivos Abiertos : " + cantAbiertos);              
    }    
}
