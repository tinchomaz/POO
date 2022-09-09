/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author vluce
 */
public class televisor extends electro {
    
    private  int     resolucion  ; 
    private  boolean sintonizador ; 

    public televisor() {
    }

    public televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public televisor(int resolucion, boolean sintonizador, int precio, String color, String consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
     public void  creartelvisor() {
        Scanner  leer = new Scanner(System.in); 
        String opcion = "";
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del TELE");
        this.resolucion = leer.nextInt();
        System.out.println("Tipo de sintonizador.  Incluye TDT?  (SI/NO)");
        opcion = leer.next().toUpperCase();        
        this.sintonizador = false;  
        if  (opcion.equals("SI")) {
            this.sintonizador = true;  
        } else {
            System.out.println("Opcion incorrecta ");
        } ;     
        
    }
    
     
      @Override
    public void precioFinal() {
        
        super.precioFinal();
        
        int Val =0; 
        if (this.resolucion >40  ) {
            Val = this.precio* 30 / 100 ; 
        }                
        this.precio = this.precio + Val; 
        if (this.sintonizador = true  ) {
            this.precio = this.precio + 500; 
        }                
    }

    @Override
    public String toString() {
        return super.toString() +  "televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
 
}
