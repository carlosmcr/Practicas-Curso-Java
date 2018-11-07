/**
 * 
 */
package es.indra.aerolineas.bean.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.indra.aerolineas.bean.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vuelo[] consultarVuelos(String origen, String destino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void anularVuelos(String... vuelos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarVuelos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultarVuelos2() throws IOException {
		// TODO Auto-generated method stub
		
	}



}
