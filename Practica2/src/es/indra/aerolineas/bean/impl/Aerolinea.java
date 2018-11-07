/**
 * 
 */
package es.indra.aerolineas.bean.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.indra.aerolineas.bean.IAerolinea;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	public Aerolinea() {		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public Vuelo[] getVuelos() {
		return vuelos;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	@Override
	public Vuelo[] consultarVuelos(String origen) {
		Vuelo[] disponibles = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {
			if(vuelos[i].getOrigen().equals(origen)) {
				disponibles[i] = vuelos[i];
			}
		}		
		return disponibles;
	}
	
	@Override
	public Vuelo[] consultarVuelos(String origen, String destino) {
		Vuelo[] disponibles = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {
			if(vuelos[i].getOrigen().equals(origen) && vuelos[i].getDestino().equals(destino)) {
				disponibles[i] = vuelos[i];
			}
		}		
		return disponibles;
	}
	
	@Override
	public void consultarVuelos() {
		ReadFile rf = new ReadFile();
		List<String> contenido = rf.retornarVuelos();		
		for(String c: contenido) {
			System.out.println(c);
		}
	}
	
	@Override
	public void anularVuelos(String... vuelos) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
		
	}


	

}
