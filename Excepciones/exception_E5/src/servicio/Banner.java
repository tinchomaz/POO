/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author vluce
 */
public class Banner {
    String [][] matriz = new String[10][80];
    int  posicion = 0; 
    
    public Banner() {
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = " ";
            }
        }
        this.posicion =0; 
    }
 
    
    
 public void escribir(int Valor)   {
     String [][] cero = {{"#","#","#","#"},     
                         {"#"," "," ","#"},
                         {"#"," "," ","#"},
                         {"#"," "," ","#"},
                         {"#"," "," ","#"},
                         {"#"," "," ","#"},
                         {"#","#","#","#"} };     
     
     String [][] uno  = {{" "," ","#"," "},     
                         {" "," ","#"," "},
                         {" "," ","#"," "},
                         {" "," ","# "," "},
                         {" "," ","#"," "},
                         {" "," ","#"," "},
                         {"#","#","#","#"} };
     
     String [][] dos  = {{"#","#","#","#"},     
                         {" "," "," ","#"},
                         {" "," "," ","#"},
                         {"#","#","#","#"},
                         {"#"," "," "," "},
                         {"#"," "," "," "},
                         {"#","#","#","#"} };
     this.posicion= this.posicion + 8 ;                        
     switch (Valor) {
         case 0 : {
          for (int i=0; i<cero.length;i++ ){            
            for (int j=0; j<cero[i].length  ;j++ ){               
                matriz[i][j+posicion]= cero[i][j];
            }
          }
         };
         break;
         case 1 : {
          for (int i=0; i<uno.length;i++ ){            
            for (int j=0; j<uno[i].length  ;j++ ){               
                matriz[i][j+posicion]= uno[i][j];
            }
          }
         };
         break;
         case 2 : {
          for (int i=0; i<dos.length;i++ ){            
            for (int j=0; j<dos[i].length  ;j++ ){               
                matriz[i][j+posicion]= dos[i][j];
            }
          }
         };
         break;
     }
 }
 
 /*--------------------------------------------------------------*/ 
 
 public void mostrar(){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print( matriz[i][j]); 
            }
            System.out.println("");
        }
 }   
    
 
}
