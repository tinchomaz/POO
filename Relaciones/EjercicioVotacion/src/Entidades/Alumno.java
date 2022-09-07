
package Entidades;

/**
 *
 * @author vluce
 */
public class Alumno {
private int    Id;     
private String Nombre;
private int    Dni;
private Integer CntVotos;

    public Alumno() {
    }

    public String getNombre() {
        return Nombre;
    }
    public void setId(int Id){
        this.Id = Id; 
    }
    public int getId(){
        return this.Id ; 
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public Integer getCntVotos() {
        return CntVotos;
    }

    public void setCntVotos(int CntVotos) {
        this.CntVotos = CntVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ID=" + String.valueOf(Id)+  ", Nombre=" + Nombre + ", Dni=" + Dni + ", CntVotos=" + CntVotos.toString() + '}';
    }

}
