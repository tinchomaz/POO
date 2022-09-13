
package entidades;

import java.util.Scanner;

/**
 *
a Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro
 */
public class electro {
     protected int precio;
     protected String color;
     protected String consumo;
     protected int peso; 

    public electro() {
    }

    public electro(int precio, String color, String consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

        
     public void crearElectrodomestico(){
         Scanner  leer  = new Scanner(System.in);
         System.out.println("---- ingrese los valores del electrodomestico ----------");   
         //System.out.println(" Precio : "); 
         this.precio =  1000;  
         System.out.println(" Color : "); 
         this.color = comprobarColor( leer.next().toUpperCase())  ; 
         System.out.println(" Consumo energetico : (A-->F) "); 
         this.consumo =  comprobarConsumoEnergetico( leer.next() )  ;
         System.out.println(" Peso  : (KG) "); 
         this.peso = leer.nextInt();
     }
    
    
    @Override
    public String toString() {
        return "electro{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    
     
    private  String comprobarConsumoEnergetico(String letra) {
        if (letra.equals("A")  || letra.equals("B") || letra.equals("C")|| letra.equals("D") || letra.equals("E") || letra.equals("F")   ){
            return   letra; 
        }else  
            return "F";
    }    
    
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.
    */ 
    
    private  String comprobarColor(String color){
        if (color == null) {
            return "BLANCO";
        }
        if (color == "BLANCO" || color == "AZUL" ||  color == "GRIS" || color == "NEGRO" || color == "ROJO" ){
            return color; 
        } else {            
            return "BLANCO";        
        }
    }        
    /*
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
    */ 
   
public  void precioFinal() {
       int Valor = 0; 
        switch ( this.consumo) {
            case "A" : Valor = 1000; 
                       break ;
            case "B" : Valor = 800; 
                       break ;
            case "C" : Valor = 600; 
                       break ;
            case "D" : Valor = 500; 
                       break ;
            case "E" : Valor = 300; 
                       break ;
            case "F" : Valor = 100; 
                       break ;           
            default :  Valor = 100;             
        }
        if (this.peso >0 &&  this.peso <= 19   ) {
            Valor = Valor + 100;             
        }
        if (this.peso >=20 &&  this.peso <= 49   ) {
            Valor = Valor + 500;             
        }
        if (this.peso >=50 &&  this.peso <= 79   ) {
            Valor = Valor + 800;             
        }
        if (this.peso >=80  ) {
            Valor = Valor + 1000;             
        }
        
        this.precio = this.precio + Valor; 
    }
    
}
    

 /*
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:

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

         

