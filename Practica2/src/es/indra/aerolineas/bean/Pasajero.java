/**
 * 
 */
package es.indra.aerolineas.bean;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	public Vuelo[] vuelos;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vuelo[] getVuelos() {
		return vuelos;
	}
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	

}
