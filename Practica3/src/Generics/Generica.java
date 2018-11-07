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
public class Generica<T> {
	
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo " + t.getClass().getName());
	}
	
	public <U> void intPadre(U u) {
		List<? super Integer> lista = new ArrayList<>();
		lista.add((Integer) u);
		
	}
	
	
}
