/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.IOException;
import java.security.spec.ECFieldF2m;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

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
		Map<Integer, Billete> billetes = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Vuelo[] vuelos = creaVuelos();
		Vuelo vuelo;
		
		Billete billete3 = new Billete();
		Billete billete4 = new Billete();
		billete3.setFecha("12-04-2018");
		billete4.setFecha("12-04-2018");
		billete3.setIdBillete(12);
		billete3.setIdBillete(13);
		billetes.put(billete3.getIdBillete(), billete3);
		billetes.put(billete4.getIdBillete(), billete4);
		
		
		int opcion = 0;
		do {
				
			System.out.println("Introduzca opcion :");
			System.out.println("1 - Comprar");
			System.out.println("2 - Ver Todos los billetes");
			System.out.println("3 - Salir");
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
				vuelo = vuelos[sc.nextInt()];			
	
				Billete billete = new Billete();
				billete.setDestino(vuelo.getDestino());
				billete.setOrigen(vuelo.getOrigen());
				System.out.println("Eliga una fecha (dd-mm-yyyy): ");
				billete.setFecha(sc.next());
				System.out.println("Eliga un asiento :");	
				billete.setAsiento(sc.nextInt());			
				billete.setIdBillete(pasajero.getId()+vuelo.getId());
				pasajero.setBillete(billete);
				System.out.println(pasajero.toString());
				billetes.put(billete.getIdBillete(), billete);				
				break;
			case 2:
				Billete billete2 = new Billete();
				System.out.println("Introcduzca una fecha a buscar: (dd-mm-yyyy)");
				billetes = billete2.verBilletesPorFecha(sc.next(), billetes);
				for(Entry<Integer, Billete> elemento: billetes.entrySet()) {
					System.out.println(elemento);
				}
	
			default:
				break;
			}
		} while (opcion != 3);
		
		
	}

}
