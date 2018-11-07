/**
 * 
 */
package es.indra.aerolineas.main;

import java.security.spec.ECFieldF2m;

import es.indra.aerolineas.bean.IAerolinea;
import es.indra.aerolineas.bean.impl.Aerolinea;
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

		Vuelo[] vuelos = creaVuelos();
		
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		Pasajero p = new Pasajero();
		Empleado emp = new Empleado();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellido("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		emp.setNombre("Carlos");
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.println("|\tLe atiende ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s %s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),p.getApellido(), p.getVuelos().length );
		
		System.out.println("*************************************************************************");
		
		Vuelo[] disponibles = aa.consultarVuelos("MAD1");
		for (int i = 0; i < disponibles.length; i++) {
			if(disponibles[i] != null)
			System.out.println("Solo Origen ".concat(disponibles[i].toString()));
		}
		
		System.out.println("");
		disponibles = aa.consultarVuelos("MAD4", "VLC");
		for (int i = 0; i < disponibles.length; i++) {
			if(disponibles[i] != null)
			System.out.println("Origen y destino " .concat(disponibles[i].toString()));
		}
		
		System.out.println("");
		aa.anularVuelos();
		aa.anularVuelos("Vuelo1", "Vuelo2", "Vuelo3");
		System.out.println("");
		aa.consultarVuelos();

	}

}
