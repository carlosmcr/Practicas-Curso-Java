/**
 * 
 */
package es.indra.practica1;

import java.util.Scanner;

/**
 * @author aula8
 *
 */
public class MetodosEntrada {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		String nombre, apellidos;
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("Introduzca sus edad: ");
		edad = sc.nextInt();
 
		System.out.printf("Usted se llama %s %s y tiene %s años.",nombre, apellidos, edad);

	}

}
