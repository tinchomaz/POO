/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguia1;

/**
 *
 * @author serus
 */
public class extra_23 {
    
        
            /**
     * @param args the command line arguments
     * 23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
       que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
       20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
       será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
       rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
       por pantalla la sopa de letras creada. 
     */
    public static void main(String[] args) {
        String palabra = "Hola";    
        String palabra2 = "Mundo";    
        String [][] sopa = new String [20][20];
        int fila =0; 
        for (int i = 0; i<20 ; i++)  
            for (int j=0; j<20; sopa[i][j]= "", j++);
        

        fila = buscaFilaLibre(sopa);         
        if (fila!=0 ){
           acomodarPalabra(sopa,fila, palabra) ;            
        }   else   System.out.println("No quedan filas Libres en la Matriz...");           
        
        
        fila = buscaFilaLibre(sopa);         
        if (fila!=0 ){
           acomodarPalabra(sopa,fila, palabra2) ;            
        }   else   System.out.println("No quedan filas Libres en la Matriz...");           
        
        completarSopa(sopa);
        
        for (int i=0; i<20 ; i++)  {            
            for (int j=0; j<20; j++)
               System.out.print( sopa[i][j] );           
            System.out.println("");
            };
        System.out.println("Fibonacchi para 21 =" + String.valueOf( fibo(21)));               
    }
   
    
    
   //----------------------------------------------------------------/  
     public static int fibo (int pNum) {
         if (pNum<=1) {
             return(1);
            }else {
             //return( fibo( pNum-1 ) + fibo( pNum-2 ) );
             return( fibo( pNum-2 ) + fibo( pNum-1 ) );
         }         
     }     
   //----------------------------------------------------------------/  
    public static void completarSopa (String[][] pSopa) {
        for (int i=0 ; i<pSopa.length; i++){
            for (int j=0 ; j<pSopa[i].length; j++){               
                if (pSopa[i][j].isEmpty()){
                    pSopa[i][j]= "#";  //  0--9  
                }
            }
        }
    }
    //----------------------------------------------------------------/  
    public static void acomodarPalabra (String[][] pSopa, int pFila, String pPalabra) {
        // Version 1- Escribo desde la  posicion 0 en adelante
        /* for (int k=0; k<pSopa[pFila].length; k++){           
              if ((k) < pPalabra.length()) { 
                 pSopa[pFila][k]= pPalabra.substring(k,k+1);
              }
          }              
        */
         // Version 2 
         // debo calcular aleatoriamente  donde empezar a escrbir la palabra. -- Pero que entre completa en la fila!!!! 
         //0123456789
         //      ABCD        
         int posicion = (int)(Math.random()* (pSopa[pFila].length - pPalabra.length()));         
         //System.out.println("Uso fila " + String.valueOf(pFila));
         //System.out.println("longitud palabra " + String.valueOf(pPalabra.length()));
         //System.out.println("longitud de fila " + String.valueOf(pSopa[pFila].length));
         //System.out.println("Empiezo a escribir en " + String.valueOf(posicion));
         for (int k=0; k<pPalabra.length(); k++){
                // System.out.println("posicion " + String.valueOf(k+posicion));
                 pSopa[pFila][k+posicion]= pPalabra.substring(k,k+1);
         }
         ///         
    };
    
    //----------------------------------------------------------------/  
    public static int buscaFilaLibre(String[] [] pSopa) {
        /*  Busco una fila que no este ocupada en la matriz */  
        boolean libre = false; 
        /*  aca hay que determinar primero si existe alguna fila libre en la matriz, caso contrario,
            nunca va a encontrar una disponible, y no sale mas del while() de abajo...        
             * HACER  una funcion "sopaFull()"  que retorne VERDADERO cdo ya no hay mas filas libres... 
        */
        int     fila  = 0; 
        while (!libre) {
            //fila = (int) (Math.random() * 20) ; 
            fila = (int) (Math.random() * pSopa.length) ; 
            System.out.println(String.valueOf(fila));
            for (int i = 0; i< pSopa[fila].length; i++ ){
                libre = libre ? libre : pSopa[fila][i].isEmpty();
            //    System.out.print( pSopa[fila][i]+ " " );
            //    System.out.print(pSopa[fila][i].isEmpty() );
            }
            //System.out.println(String.valueOf(libre));
        }
        return( fila );
    }
    }

