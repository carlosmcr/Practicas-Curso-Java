/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aula6
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() {
	Path path =  Paths.get("C:/Users/aula8/Desktop/Carlos/Eclipse/Vuelos.txt");	
	List<String> contenido = new ArrayList<>();
		try {
			contenido = Files.readAllLines(path);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return contenido;
	}
}
