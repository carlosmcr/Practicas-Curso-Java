package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author aula8
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Generica <Integer> g1 = new Generica<Integer>();
		Generica <String> g2 = new Generica<String>();
		Generica <Boolean> g3 = new Generica<Boolean>();
		
		g1.setT(10);
		g2.setT("Hola");
		g3.setT(true);
		
		System.out.println(g1.getT());
		System.out.println(g2.getT());
		System.out.println(g3.getT());

		
		
		Pair<Integer, String> p1 = new OrderedPair(1, "rojo");
		Pair<Integer, String> p2 = new OrderedPair(2, "azul");
		
		System.out.println(p1.getKey()+ p1.getValue());
		System.out.println(p2.getKey()+ p2.getValue());
		
		
//		List<Integer> listado = new ArrayList<>();
//		listado.add(23);
//		listado.add(45);
//		listado.add(33.2); Da error
		
//		List<? extends Number> listadoDesconocido = new ArrayList<>();
//		listadoDesconocido.add(new Integer(23), null);
//		listadoDesconocido.add(new Integer(45), null);
//		listadoDesconocido.add(new Double(33.2), null);
		
		g1.revision(31);
		Generica <Double> g4 = new Generica<>();
		g4.setT(34d);
		g4.revision(32d);
//		g1.revision("Otro String"); Da error
		
		
	
	}
	

}
