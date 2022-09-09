
package entidades;

/**
 *
 * @author vluce
 */
public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    public Perro() {
        super("SinNombre","Carne", 1, "Callejero");
    }
    
    @Override
    public void Alimentarse(){
        System.out.println("Este Perro, come:" + this.alimento);
    }
}
