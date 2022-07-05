/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.Cuenta;
import java.util.Scanner;





/**
 *
 * @author serus
 */
public class ServiciosCuenta {
    
   Scanner leer = new Scanner(System.in);
    
    public Cuenta datos(){
       
        Cuenta C1 = new Cuenta();
       
        System.out.println(" Ingrese el numero su Cuenta");
        C1.setNumerodeCuenta(leer.nextInt());
        System.out.println(" Ingrese numero de Dni ");
        C1.setDni(leer.nextInt());
        C1.setSaldo(0);
        return C1;
        
       
    }
    
    public void ingresar(Cuenta ing){
      
      
        System.out.println(" ingrese el dinero a depositar ");
        int ingreso = leer.nextInt();
        ing.setSaldo(ingreso+ing.getSaldo());
       
  
    }
    
    public void retiro(Cuenta ret){
        
        System.out.println(" Ingrese el monto a retirar ");
        int monto = leer.nextInt();
        if(ret.saldo<monto){
            System.out.println("no se puede retirar ese monto");
            
        }
        else{ 
            System.out.println(" Extraccion realizada ");
            ret.setSaldo(ret.saldo-monto);
        }
        
    }
    
   
    
    
}
