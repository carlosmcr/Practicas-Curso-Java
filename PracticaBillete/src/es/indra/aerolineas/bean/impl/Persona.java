package es.indra.aerolineas.bean.impl;

public abstract class  Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;

	public  Persona() {
	}
	
	public String getNombre() {
		return nombre.toUpperCase();
	}


	public abstract String solicitarInformacion();
}