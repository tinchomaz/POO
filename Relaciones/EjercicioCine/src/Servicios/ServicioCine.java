/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vluce
 */
public class ServicioCine {
    
    private Cine EsteCine; 
    private int Recaudacion =0;     
    private int CantEspectadores =0;     
    private ArrayList<Espectador> Gente = new ArrayList();
    
    public int getRecaudacion(){
        return Recaudacion; 
    }
    
    public int getCantidad(){
        return CantEspectadores; 
    }
    public void setPrecio(int Valor) {
        EsteCine.setPrecio(Valor);
    }
    
    public void CrearCine(){
        Pelicula Peli = new Pelicula();
        Peli.setTitulo("El dia del Programador II");
        Peli.setEdadMin(21);
        Peli.setDuracion(180);
        Peli.setDireccion("Juan Carlos del Pozo");
        
        EsteCine = new Cine();        
        EsteCine.setNombre("Sala uno del cine");
        EsteCine.setPeli(Peli);
        Recaudacion =0;     
        CantEspectadores =0;    
        //EsteCine.setPrecio(350);       
        /* --------- Completar Sala ----------*/  
        Asiento[][] aux = EsteCine.getSala();
        for (int i = 0 ; i<6 ; i++ ){           
            for (int fila =0; fila <8 ; fila++){
                Asiento asi = new Asiento( String.valueOf(fila + 1 ), //Fila 
                                           (i==0)?"A":(i==1)?"B":(i==2)?"C":(i==3)?"D":(i==4)?"E":(i==5)?"F":"G"); // Posicion
                aux[i][fila] = asi; 
            }            
        }
        EsteCine.setSala(aux);
    };

    
    
public void LlenarCine(){    
        Asiento[][] aux = EsteCine.getSala();
        for (int i=0;i< aux.length; i++ ){
            for (int j=0;j<aux[i].length; j++){
                Espectador cli = new Espectador(); 
                //cli.setNombre("Cliente " + String.valueOf(i)+"-"+String.valueOf(j));
                cli.setNombre("Cliente " + i +"-"+ j );
                cli.setSaldo( (int) ( Math.random() * 1500 ) );
                cli.setFecNacimiento(Fecha()); 
                if (cli.getSaldo() >= EsteCine.getPrecio() && 
                        ((new Date()).getYear() -  cli.getFecNacimiento().getYear()) > EsteCine.getPeli().getEdadMin()  ){
                   aux[i][j].setPersona(cli);
                }
                Gente.add(cli);
            }           
        }
}

 private Date Fecha(){        
        return ( new Date( (int) ( 70 + (Math.random()* 50 )),
                           (int) ( 1  + (Math.random()* 12 )),
                           (int) ( 1  + (Math.random()* 28 ))
                          ) 
               );
    };

public void VerCine(){    
        Asiento[][] aux = EsteCine.getSala();
        System.out.println(EsteCine.getNombre());
        System.out.println(EsteCine.getPeli().toString());
        System.out.println("Valor de la Entrada :" + String.valueOf(EsteCine.getPrecio()));
        System.out.println("-----------------------------------------");
        int Recaudacion = 0; 
        int CantEspectadores =0; 
        for (int i=0;i< aux.length; i++ ){
            for (int j=0;j<aux[i].length; j++){
                System.out.print("|" + aux[i][j].getFila() );               
                System.out.print(aux[i][j].getPosicion());                               
                if (aux[i][j].getPersona() != null ) {
                    System.out.print("::" + aux[i][j].getPersona().getNombre());                                                                       
                    this.Recaudacion =  this.Recaudacion + EsteCine.getPrecio(); 
                    this.CantEspectadores++;
                }else {
                    System.out.print("::***LIBRE***" );                               
                }
            }           
            System.out.println("");           
        }
        System.out.println("------------------------------------");
        System.out.println("Total recaudado de la Sala: $" + String.valueOf(this.Recaudacion));
        System.out.println("Total espectadores a la Sala:" + String.valueOf(this.CantEspectadores));         
        System.out.println("------------------------------------");        
        }

public void verGente(){
        System.out.println("Personas generadas ");
        for (Espectador tipo : Gente ){            
                 System.out.println( tipo.toString() );                                                                                           
                }            
   }
}

