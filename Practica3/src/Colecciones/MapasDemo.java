/**
 * 
 */
package Colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aula8
 *
 */
public class MapasDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> estudiantes = new HashMap<>();
		
		estudiantes.put("Perez", "Andres");
		estudiantes.put("Gomez", "Andres");
		estudiantes.put("Ariza", "Andres");
	
		System.out.println(estudiantes.size());
		
		for(Map.Entry<String, String> elemento: estudiantes.entrySet()) {
			System.out.println("Clave: "+ elemento.getKey() +" y valor: "+ elemento.getValue());
		}
	}
	


}
