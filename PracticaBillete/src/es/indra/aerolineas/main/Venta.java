/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.IOException;
import java.security.spec.ECFieldF2m;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import es.indra.aerolineas.bean.IAerolinea;
import es.indra.aerolineas.bean.impl.Aerolinea;
import es.indra.aerolineas.bean.impl.Billete;
import es.indra.aerolineas.bean.impl.Empleado;
import es.indra.aerolineas.bean.impl.Pasajero;
import es.indra.aerolineas.bean.impl.Vuelo;

/**
 * @author josejarizav
 *
 */
public class Venta {
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD"+i,"VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Billete> billetes = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		Vuelo[] vuelos = creaVuelos();
		Vuelo[]	vuelosComprados = new Vuelo[10];
		
		int opcion = 0;
		System.out.println("Introduzca opcion :");
		System.out.println("1- Comprar");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			Pasajero pasajero = new Pasajero();
			System.out.print("Introduzca su nombre :");
			pasajero.setNombre(sc.next());
			System.out.print("Introduzca su apellido :");
			pasajero.setApellido(sc.next());
			System.out.print("Introduzca su DNI :");
			pasajero.setDni(sc.next());
			System.out.println("Eliga un vuelo :");
			
			for (int i = 0; i < vuelos.length; i++) {
				System.out.println(vuelos[i].toString());
				
			}
			vuelosComprados[contador] = vuelos[sc.nextInt()];
			contador++;
			pasajero.setVuelos(vuelosComprados);
			System.out.println("Usted ha comprado los siguiente vuelos: ");
			for (int i = 0; i < vuelosComprados.length; i++) {
				if(vuelosComprados[i] != null)				
				System.out.println(vuelosComprados[i].toString());			
			}
			Billete billete = new Billete();
			billete.setDestino(vuelosComprados[]);
			pasajero.setBillete(billete);
			
			break;

		default:
			break;
		}
		
		
	}

}
