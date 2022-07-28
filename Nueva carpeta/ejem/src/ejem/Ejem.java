/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejem;
  import java.util.ArrayList;

/**
 *
 * @author serus
 */
public class Ejem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   


		/*
		 * Creamos un ArrayList, recordemos que un ArrayList puede ser de cualquier
		 * tipo; para no complicar las cosas haremos un ArrayList de tipo String
		 */
		ArrayList<String> canciones = new ArrayList<>();
		// Le agregamos datos
		canciones.add("Ashes to ashes");
		canciones.add("Beds are burning");
		canciones.add("It's only rock 'n' Roll (But I like it)");
		System.out.println("Recorriendo con método 1");
		// Método 1
                System.out.println("------------------------------");
		for (String cancion : canciones) {
			System.out.println(cancion);
		}
		System.out.println("Recorriendo con método 2");
		// Método 2
                System.out.println("------------------------------");
		for (int x = 0; x < canciones.size(); x++) {
			String cancion = canciones.get(x);
			System.out.println(cancion);
		}
		System.out.println("Recorriendo con método 3");
		// Método 3
                System.out.println("------------------------------");
		canciones.forEach((cancion) -> {
			System.out.println(cancion);
		});
	}
}  
    
    
   
