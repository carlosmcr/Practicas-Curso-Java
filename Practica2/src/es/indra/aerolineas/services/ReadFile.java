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

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author aula6
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException {
		Path path =  Paths.get("C:/Users/aula8/Desktop/Carlos/Eclipse/Vuelos.txt");	
		List<String> contenido = new ArrayList<>();
			try {
				contenido = Files.readAllLines(path);
			} catch (IOException e) {
				throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo", e);
			}
		return contenido;
	}
	
	public List<String> retornarVuelosPropagandoError() throws IOException{
		Path path =  Paths.get("C:/Users/aula8/Desktop/Carlos/Eclipse/Vuelos.txt");	
		List<String> contenido = new ArrayList<>();
		contenido = Files.readAllLines(path);
		return contenido;
	}
	

}
