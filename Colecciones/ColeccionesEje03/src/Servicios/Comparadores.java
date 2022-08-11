package Servicios;

import Entidades.Alumno;
import coleccioneseje03.Arreglos;
import java.util.Comparator;

/**
 *
 * @author vluce
 */
public class Comparadores {

public static Comparator<Alumno> ordenaPorNombreDesc = new Comparator<Alumno>() {
    @Override
    public int compare(Alumno t, Alumno t1) {
        return t1.getNombre().compareTo(t.getNombre());
    }
};

public static Comparator<Integer> ordenaLista = new Comparator<Integer>() {
    @Override
    public int compare(Integer t, Integer t1) {
        return t1.compareTo(t);
    }
};
}
