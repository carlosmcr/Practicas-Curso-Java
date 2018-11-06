/**
 * 
 */
package es.indra.aerolineas.bean.impl;

/**
 * @author aula6
 *
 */
public class Empleado extends Persona{

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String solicitarInformacion() {
		return "Toma informacion";
	}
}
