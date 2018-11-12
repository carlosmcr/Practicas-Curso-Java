package es.indra.aerolineas.bean.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Billete {

	
		private String fecha;
		private String origen;
		private String destino;
		private int asiento;
		private int idBillete;
		private Map<Integer, Billete> billetes = new HashMap<>();
		
		
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		public String getOrigen() {
			return origen;
		}
		public void setOrigen(String origen) {
			this.origen = origen;
		}
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		public int getAsiento() {
			return asiento;
		}
		public void setAsiento(int asiento) {
			this.asiento = asiento;
		}
		public int getIdBillete() {
			return idBillete;
		}
		public void setIdBillete(int idBillete) {
			this.idBillete = idBillete;
		}
		
		public Map<Integer, Billete> getBilletes() {
			return billetes;
		}
		public void setBilletes(Map<Integer, Billete> billetes) {
			this.billetes = billetes;
		}
		@Override
		public String toString() {
			return "Billete [fecha=" + fecha + ", origen=" + origen + ", destino=" + destino + ", asiento=" + asiento
					+ ", idBillete=" + idBillete + "]";
		}
		

		public Map<Integer, Billete> verBilletesPorFecha(String fecha1, Map<Integer, Billete> map) {
			for(Entry<Integer, Billete> elemento: map.entrySet()) {
				if(elemento.getValue().getFecha().equals(fecha1)) {
					billetes.put(elemento.getKey(), elemento.getValue());	
				}
			}
			return billetes;
		}
		
		
		
		
		

	

}
