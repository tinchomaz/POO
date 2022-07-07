/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeje07;

import Entidades.Persona;
import Services.ServicesPersona;

/**
 *
 * @author vluce
 */
public class PooEje07 {

    /**
     * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicesPersona sp = new ServicesPersona();
        Persona[]  vector =  new Persona[4];
        
        vector[0] = sp.CrearPersona();                
        vector[1] = sp.CrearPersona();                
        vector[2] = sp.CrearPersona();                
        vector[3] = sp.CrearPersona();                
        
        int control ; 
        int  pesoBajo=0 ; 
        int  pesoOk=0 ; 
        int  pesoAlto=0 ; 
        int  mayores =0; 
        double  temp = 0; 
        for (int i = 0 ; i< 4 ; i++){
           control = sp.calcularIMC(vector[i]);
            System.out.println(" persona "+vector[i].getNombre() + " Peso :" + control );
           if (control == -1) {
               System.out.println(" Peso  inferior para " + vector[i].getNombre() );                      
               pesoBajo++;
           }  else if (control ==0 ) {
               System.out.println(" Peso  ideal  para " + vector[i].getNombre() );                                     
               pesoOk++ ; 
           } else {
               System.out.println(" Peso  excedido para " + vector[i].getNombre() );                                     
               pesoAlto++ ; 
           }         
           if ( sp.esMayorDeEdad(vector[i])) {
               System.out.println("Mayor de edad para  " + vector[i].getNombre());
               mayores++;               
           }
        }
        System.out.println(" Mayores " +  mayores );
        if  (pesoOk  == 0) {
            System.out.println(" Porcentaje de personas con peso ideal   : " +    0   );                
        }else  System.out.println(" Porcentaje de personas con peso ideal   : " +    (float) pesoOk/4 * 100   );                
            
        if  (pesoBajo  == 0) {
            System.out.println(" Porcentaje de personas con peso inferior: " +    0   );                
        }else  System.out.println(" Porcentaje de personas con peso inferior: " +    (float) pesoBajo /4 * 100   );
        
        if  (pesoAlto  == 0) {
            System.out.println(" Porcentaje de personas con peso alto   : " +    0   );                
        }else  System.out.println(" Porcentaje de personas con peso alto   : " +    (float) pesoAlto/4 * 100   );                
        
        if  (mayores == 0) {
            System.out.println(" Porcentaje de personas mayores  es  : " +    0   );                      
        }else {
           temp =  ( (double) mayores/4) * 100; 
          System.out.println(" Porcentaje de personas mayores   : " +    temp);  
        }              
        
     /*   System.out.println( "caso 1 "  +  3/4 * 100 );
        System.out.println( "caso 2 "  + (float) 3/4 * 100 );
        System.out.println( "caso 3"  + ((float) 3/4)  * 100 );
       */          
        
        
       // System.out.println(" Porcentaje de personas con peso superior: " +    ( pesoAlto/4) * 100   );                
       // System.out.println(" Porcentaje de personas Mayores de edad  : " +    ( mayores /4)  * 100   );                
                
                 
    }
    
}
