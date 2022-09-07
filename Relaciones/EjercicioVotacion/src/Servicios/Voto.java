
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;

/**
 *
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
public class Voto {
    
    private Alumno Votante; 
    private  int[] Votados = new int[3]; 

    public Voto(Alumno Votante) {
        this.Votante = Votante;
    }

    public Alumno getVotante() {
        return Votante;
    }

    public void setVotante(Alumno Votante) {
        this.Votante = Votante;
    }

    public int[] getVotados() {
        return Votados;
    }

    public void setVotados(int[] Votados) {
        this.Votados = Votados;
    }
    
    
}
