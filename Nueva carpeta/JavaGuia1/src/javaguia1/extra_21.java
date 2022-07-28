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
public class extra_21 {
    
  /**
21. Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. 
* Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.
*                 NOTA 1    NOTA 2    NOTA 3   NOTA 4    | promedio 
*     ALUMNO 1      1        2          3        4       |    99 
*     ALUMNO 2                                           |    99 
* 
*     ALUMNO 10                                          |    99 
* ----------------------------------------------------------
* 
* 
     */
    
    public static void main(String[] args) {
        int [][]  calific   = new int [10][5];
        leerNotas(calific); 
        calcularPromedios(calific); 
        mostrar(calific);        
    }
    
    public static void leerNotas( int [][]  Notas) {    
       for (int i = 0 ; i < Notas.length ; i++ ) {
           for (int j = 0 ; j < Notas[i].length -1  ; j++ ) {
               Notas[i][j] =  (int) (Math.random() * 10 ) + 1 ; 
           }
       }
      
    };
    
    public static void calcularPromedios(int [][]  Notas){
        double  promedio  = 0 ; 
         for (int i = 0 ; i < Notas.length ; i++ ) {
           promedio  = 0 ; 
           for (int j = 0 ; j < Notas[i].length -1  ; j++ ) {               
               promedio = promedio + (double)  Notas[i][j] * (j==0?  0.10 :  ( j==1 ? 0.15: (j==2? 0.25: 0.50 )));                                  
           }
           Notas[i][4] = (int) promedio; 
       }
        
        
    }; 
    public static void mostrar(int [][]  Notas){
        int  aprob = 0;
        int  desap = 0;
          for (int i = 0 ; i < Notas.length ; i++ ) {
           for (int j = 0 ; j < Notas[i].length ; j++ ) {
               System.out.print(Notas[i][j] + " " );
           }
           System.out.println( (Notas[i][4]>=7 ? "APROBADO" : "DESAPROBADO") );
           aprob = aprob + ((Notas[i][4]>=7 ? 1 : 0));
           desap = desap + ((Notas[i][4]>=7 ? 0 : 1));
           }
        System.out.println( "--------------------------------" );
        System.out.println( " Aprobados   : " + aprob );
        System.out.println( " Desaprobados: " + desap );
       }
    };