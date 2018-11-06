/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author aula6
 *
 */
public class ReadFile {
	
	public void retornarVuelos() {
	Path path =  Paths.get("C:/Users/aula6/Desktop/Eclipse/Vuelos.txt");
	
		try {
			List<String> contenido = Files.readAllLines(path);
			
			System.out.println(contenido);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}
}
