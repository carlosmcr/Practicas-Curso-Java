/**
 * 
 */
package es.indra.aerolineas.exceptions;

/**
 * @author aula8
 *
 */
public class ErrorLecturaDeVuelosException extends Exception {

	public ErrorLecturaDeVuelosException(String msg) {
		super(msg);
	}
	
	public ErrorLecturaDeVuelosException(Throwable cause) {
		super(cause);
	}
	
	public ErrorLecturaDeVuelosException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
