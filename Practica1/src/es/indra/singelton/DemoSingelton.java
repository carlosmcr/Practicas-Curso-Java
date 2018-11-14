package es.indra.singelton;

public class DemoSingelton {

	public static void main(String[] args) {
		
		Singelton instancia = Singelton.getSingelton();		
		instancia.setUrl("Hola");
		System.out.println(instancia.getUrl());
		
		
		Singelton instancia2 = Singelton.getSingelton();
		instancia2.setUrl("Hola2");
		
		System.out.println(instancia.getUrl());/////<--------	
		
	}
}
