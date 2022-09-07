
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vluce
 */
public class Simulador {
ArrayList<Alumno>  Estudiantes = new ArrayList(); 
ArrayList<Voto>    Votacion = new ArrayList(); 
static int secuencia =1; 

public void CrearAlumnos(int nCantidad){
   for (int i=0; i< nCantidad; i++){
      Alumno aux = new Alumno(); 
      aux.setCntVotos(0);
      aux.setNombre(Nombres());
      aux.setDni(Dni());
      aux.setId( secuencia++ );
      Estudiantes.add(aux);
   }   
 }

public void Votacion(){
    for (Alumno aux : Estudiantes){
        Voto v1 = new Voto(aux); 
        int[] votos = new int[3]; 
        v1.setVotante(aux);  
        /* debo seleccionar los tres votados por el aluno */ 
        boolean correcto = false ;
        int seleccionado ;
        for (int i=0; i< votos.length;i++){
          correcto = false;   
          do {
             seleccionado = (int) (  (Math.random() *  Estudiantes.size()) + 1 ) ;
             if (seleccionado != aux.getId()) {
                 correcto = true;
                 if (votos.length >= 0 && seleccionado == votos[0]  ){
                    correcto = false;
                 }
                 if (votos.length >= 1 && seleccionado == votos[1]  ){
                    correcto = false;
                 }
                 if (votos.length >= 2 && seleccionado == votos[2]  ){
                    correcto = false;
                 }
             }
          }while (!correcto);
          votos[i]= seleccionado;
          /*-- Sumar un voto en el Alumno Seleccionado */  
          Alumno Este ; 
          for (Alumno temp : Estudiantes ) {
              if (temp.getId() == seleccionado) {
                  Este = Estudiantes.get(temp.getId()-1);
                  Este.setCntVotos( Este.getCntVotos() + 1 );
              }
          } 
          /*----------------------------------------------*/ 
        }
        v1.setVotados( votos );             
        /* Almacenar la votacion */ 
        Votacion.add(v1);
    }
}
public void Recuento(int Cantidad){
    Collections.sort(Estudiantes, Comparadores.ordenaPorVotos) ;
    int cont = 0; 
    for (Alumno aux : Estudiantes ){
        if (cont++ < Cantidad ){
            System.out.println( ((cont<=5)? "TITULAR :":"SUPLENTE:" ) + aux.toString());        
        }
    }
}
public void VerVotacion(){
    for (Voto aux : Votacion ){
        System.out.println(  aux.getVotante().toString() ); 
        for (int i = 0; i< aux.getVotados().length ; i++){
            System.out.print( "|"+aux.getVotados()[i] );
        }
        System.out.println("|");
    }
}

public void VerAlumnos(){
    System.out.println("--------Detalle de alumnos -------------");
    for (Alumno aux : Estudiantes){
        System.out.println(aux.toString());
    }
}

private int Dni(){    
    if (Estudiantes.isEmpty()){
        return (int) ((Math.random() * 1000000) + 20000000) ; 
    }else {
        boolean unico = true;
        int nro;
        do {
           unico = true ; 
           nro = (int) ((Math.random() * 15000000) + 20000000) ; 
           for (Alumno aux : Estudiantes){
               if (unico = ( nro == aux.getDni() )) {
                  break;
               } 
           }
        } while (unico);
        return nro;
    }
}

private String Nombres(){
    String[] Lista = {"Carlos Perez","Lucas Lopez","Monica Diaz","Cecilia Dominguez","Carla Lopez","Sebastian Hoga",
                      "Lucia Lopez","Carlos Perez","Cumbio Rodriguez","Maxima Consuelo Diaz","Eshter Groidman",
                      "Conchata Ferrer", "Esteban Diaz","Veronica Castro","Mike Jordan","Anibal Romero","Kevin Gomez"};
    return Lista [ (int) (Math.random() * Lista.length )  ]; 
  } 
}
