package es.indra.aerolineas.bean;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;

	public Persona() {
		super();
	}
	
	public String getNombre() {
		return nombre.toUpperCase();
	}

}