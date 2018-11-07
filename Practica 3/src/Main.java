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

	}

}
