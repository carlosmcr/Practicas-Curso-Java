package es.indra.aerolineas.bean;

import es.indra.aerolineas.bean.impl.Vuelo;

public interface IAerolinea {

	 String getNombre();
	
	 Vuelo[] getVuelos();
	
	
	public Vuelo[] consultaruelos(String origen);
	
	public Vuelo[] consultaruelos(String origen, String destino);
	
	public void anularVuelos(String... vuelos);

	

}
