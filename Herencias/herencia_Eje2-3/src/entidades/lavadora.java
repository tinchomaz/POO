
package entidades;

import java.util.Scanner;

public class lavadora  extends electro {

    //private String carga ;   // Superior / Frontal  
    private int  carga ;   // capadicad de lavado en KG de ropa 
    
    public lavadora() {        
    }    

    public lavadora( int precio, String color, String consumo, int peso, int carga ) {
        super(precio, color, consumo, peso);        
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void  crearLavadora() {
        Scanner  leer = new Scanner(System.in); 
        super.crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga del Lavarropa (KG)");
        this.setCarga(leer.nextInt());
    }
    
    @Override
    public void precioFinal() {
        
        super.precioFinal();
        
        int Val =0; 
        if (this.carga >10 ) {
            Val = Val + 500;             
        }                
        this.precio = this.precio + Val; 
    }
    
    /*
    
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000


    */
    
    @Override
    public String toString() {
        //return "lavadora{" + "carga=" + carga + '}';
        return  super.toString() + "lavadora{" + "carga=" + carga + '}'  ; 
    }
    
}