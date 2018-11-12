package es.indra.pair.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.pair.beans.Carro;
import es.indra.pair.beans.Categoria;
import es.indra.pair.beans.Cliente;
import es.indra.pair.beans.Producto;

public class Compras {



	public List<List<Producto>> crearProducto() {

		Categoria alimentacion = new Categoria(1, "Alimentacion");
		Categoria perfumeria = new Categoria(2, "Perfumeria");
		Categoria limpieza = new Categoria(3, "Limpieza");

		Producto arroz = new Producto(1,"Arroz", "Legumbre", alimentacion, 2.99, 5);
		Producto judias = new Producto(2,"Judias", "Verdura", alimentacion, 4.99, 0);
		Producto naranja = new Producto(3,"Naranja", "Fruta", alimentacion, 6.45, 70);
		List<Producto> p1 = new ArrayList<>();
		p1.add(arroz);
		p1.add(judias);
		p1.add(naranja);

		Producto desodorante = new Producto(4,"Axe", "Bueno olor", perfumeria, 9.99, 7);
		Producto colonia = new Producto(5,"Nenuco", "La de siempre", perfumeria, 4.99, 9);
		Producto maquillaje = new Producto(6,"Maquillaje", "Para la cara", perfumeria, 8.45, 15);
		List<Producto> p2 = new ArrayList<>();
		p2.add(desodorante);
		p2.add(colonia);
		p2.add(maquillaje);

		Producto legia = new Producto(7,"Legia", "Limpia bien", limpieza, 3.89, 9);
		Producto detergente = new Producto(8,"Detergente", "Con aroma", limpieza, 2.99, 0);
		Producto jabon = new Producto(9,"Jabon", "Verde", limpieza, 6.75, 9);
		List<Producto> p3 = new ArrayList<>();
		p3.add(legia);
		p3.add(detergente);
		p3.add(jabon);

		List<List<Producto>> listaCategorias = new ArrayList<>();
		listaCategorias.add(p1);
		listaCategorias.add(p2);
		listaCategorias.add(p3);
		
		return listaCategorias;		

	}

	public List<Cliente> crearClientes() {
		List<Cliente> listaClientes = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Cliente c = new Cliente(i,"Cliente" + i, "Apellido" + i, "Direccion" + i, 12 + i);
			listaClientes.add(c);
		}
		return listaClientes;
	}

	public Carro comprar(Carro carro, Producto p) {	
		carro.aniadirProducto(p);
		return carro;
	}
	
	public List<List<Producto>> modificarStock(String nombre, int stock,List<List<Producto>> listaCategorias) {
	  
	  Compras comp = new Compras();
	  List<List<Producto>> listaCategorias2 = listaCategorias;
	  for(List<Producto> pro : listaCategorias2) {
	    for(Producto prod : pro) {
	      if(prod.getNombre().equals(nombre)) {
	        prod.setStock(stock);
	        
	      }
	      
	    }
	    
	  }return listaCategorias2;
	  
	  
	  
	}
//	public void incrementarStock(Map<Integer, List<Producto>> mapa, String producto){
//		for(Map.Entry<Integer, List<Producto>> elemento: mapa.entrySet()) {
//			for (int i = 0; i < ; i++) {
//				if(elemento.getValue().get(0).getNombre())
//				
//			}
//		}
//	}
//	

}
