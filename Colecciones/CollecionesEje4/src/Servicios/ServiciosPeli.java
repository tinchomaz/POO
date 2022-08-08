package Servicios;


import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */

/**
 *
 * @author Flores
 */
public class ServiciosPeli {
    Scanner leer=new Scanner(System.in);
    ArrayList <Pelicula> ListaPeli= new ArrayList();
    
    public void Crearpeli(){
        String ciclo;
        do{
            /*HAY QUE INSTANCIAR LA VARIABLE DENTRO DE EL WHILE PARA QUE SE LIMPIE Y SE PUEDA CREAR UN NUEVO ELEMENTO
            DENTRO DE LA LISTA ARRAY.SI NO SE SOBREESCRIBE EL MISMO ELEMENTO UNA Y OTRA VEZ
            */
           Pelicula var=new Pelicula();
           System.out.println("Ingrese director");
           var.setDirector(leer.nextLine());
           System.out.println("Ingrese titulo");
           var.setTitulo(leer.nextLine());
           System.out.println("Ingrese duracion");
           var.setDuracion(Integer.parseInt(leer.nextLine()));
           ListaPeli.add(var);
           System.out.println("Desea continuar?");
           ciclo=leer.nextLine();
        }while(!ciclo.equalsIgnoreCase("no"));
        
        for(Pelicula v:ListaPeli){
            System.out.println(v.toString());
        }
        System.out.println("------------------------");
        for (Pelicula v:ListaPeli){
            if(v.getDuracion()>1){
                System.out.println(v.toString());
            }
        }
        System.out.println("-------------------------");
        
    }
    public void MostrarPeli(){                      
        Collections.sort(ListaPeli, Comparador.ordenaPorDuracion);
        for( Pelicula var : ListaPeli){       
            System.out.println(var.toString());  
        }
        System.out.println("------------------------------");
    }
    public void MostrarCorta(){
        Collections.sort(ListaPeli, Comparador.ordenaPorCorta);
        for( Pelicula var : ListaPeli){       
            System.out.println(var.toString());  
        } 
        System.out.println("--------------------------");
    }
    public void MostrarTitulo(){
                Collections.sort(ListaPeli, Comparador.ordenaPorTitulo);
        for( Pelicula var : ListaPeli){       
            System.out.println(var.toString());  
        } 
        System.out.println("--------------------------");
    }
        public void MostrarDirector(){
                Collections.sort(ListaPeli, Comparador.ordenaPorDirector);
        for( Pelicula var : ListaPeli){       
            System.out.println(var.toString());  
        } 
        System.out.println("--------------------------");
    }
}
