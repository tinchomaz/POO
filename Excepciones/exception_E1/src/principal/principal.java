/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Entidades.Persona;
import Services.ServicesPersona;

/**
 *
 * @author vluce
 */
public class principal {

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
        
        Persona per1 = null;         
        //Persona per1 = new Persona();         
        try{
            
            System.out.println(   sp.esMayorDeEdad(per1)) ;        
            
        //}catch (NullPointerException err ) {
         //   System.out.println(" Puntero nulo...");
        }catch (Exception err) {
            System.out.println("Hay problemas....");
            System.out.println( "Error:" +   err.toString() ); 
            //err.printStackTrace();             
        } finally {                   
            System.out.println("Ya podemos seguir...");
        }
        
        System.out.println("Otros comando");
        System.out.println("Otros comando");
        /*-------------- Prueba de acceder a un item fuera de rango  ----*/         
        try {
             vector[0] = per1;
             vector[1] = per1;
             vector[2] = per1;        
             vector[4] = per1;  // genera la primer exception . Se lo comenta para que se active la segunda Exception
        //vector[3] = (10/34) ;
        //} catch (ArrayIndexOutOfBoundsException err  ) {
        //    System.out.println("Error, no se puede acceder a ese elemento del array");            
        } catch (Exception otro ){
            System.out.println("Otro error no especificado...");
            System.out.println( "Error:" +    otro.toString() ); 
        } 
        System.out.println("Resto del programa");
    /*
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
               
        
        System.out.println(" Porcentaje de personas con peso ideal   : " +  ((pesoOk>0)? (float) pesoOk/4 * 100 : 0 )  );
                
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
    */       
    }
    
}
