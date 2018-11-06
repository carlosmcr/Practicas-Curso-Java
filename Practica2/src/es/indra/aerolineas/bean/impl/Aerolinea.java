/**
 * 
 */
package es.indra.aerolineas.bean.impl;

import es.indra.aerolineas.bean.IAerolinea;

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
	public Vuelo[] consultaruelos(String origen) {
		Vuelo[] disponibles = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {
			if(vuelos[i].getOrigen().equals(origen)) {
				disponibles[i] = vuelos[i];
			}
		}		
		return disponibles;
	}
	
	@Override
	public Vuelo[] consultaruelos(String origen, String destino) {
		Vuelo[] disponibles = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {
			if(vuelos[i].getOrigen().equals(origen) && vuelos[i].getDestino().equals(destino)) {
				disponibles[i] = vuelos[i];
			}
		}		
		return disponibles;
	}	
	
	@Override
	public void anularVuelos(String... vuelos) {
		System.out.println("Numero de vuelos a anular: " + vuelos.length);
		
	}


	

}
