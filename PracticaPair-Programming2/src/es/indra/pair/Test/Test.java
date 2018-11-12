package es.indra.pair.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.indra.pair.beans.Carro;
import es.indra.pair.beans.Categoria;
import es.indra.pair.beans.Cliente;
import es.indra.pair.beans.Producto;
import es.indra.pair.negocio.Compras;

public class Test {

	public static void main(String[] args) {
		Compras c = new Compras();
		
		
		// Crea y muestra lista de productos por categoria
		System.out.println("Lista de productos por categoria: ");
		List<List<Producto>> listaCategorias = c.crearProducto();
		for (List<Producto> list : listaCategorias) {
			System.out.println(list.get(0).getCategoria().getNombre());
			for (Producto producto : list) {
				System.out.println(producto);
			}
			System.out.println("");
		}
		
		//Cambia el stock del Producto
		System.out.println("Lista de prodcutos actualizada: ");
        c.modificarStock("Naranja", 50, listaCategorias);
        List<List<Producto>> listaActualizada = c.modificarStock("Naranja", 50, listaCategorias);
        for (List<Producto> list : listaActualizada) {
            
            for (Producto producto : list) {
                System.out.println(producto);
            }
            System.out.println("");
        }
        

		// Crea y muestra lista de clientes
		System.out.println("Lista de CLientes: ");
		List<Cliente> listaClientes = c.crearClientes();
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
		System.out.println("");

		
		//Crea un carro, se le asocia un cliente, una fecha y se le añaden productos a la lista de productos del carro.
		System.out.println("Carro de un cliente: ");
		Carro carro = new Carro();
		carro.setCliente(listaClientes.get(0));
		carro.setFecha("08-11-2018");
		carro = c.comprar(carro, listaCategorias.get(0).get(0));
		carro = c.comprar(carro, listaCategorias.get(0).get(2));
		carro = c.comprar(carro, listaCategorias.get(0).get(1));
		carro = c.comprar(carro, listaCategorias.get(1).get(2));
		System.out.println(carro.getCliente());
		for (Producto producto : carro.getProductosComprados()) {
			System.out.println(producto );
			
		}
		//Imprime el total de la compra
		System.out.println( " Total: " + carro.getTotal());
		System.out.println("");
		
		//Crea y añade los carros a una lista general
		System.out.println("Lista con todos los carros con fecha");
		List<Carro> listaCarro = new ArrayList<>();
		listaCarro.add(carro);
		for (Carro carro2 : listaCarro) {
			System.out.println(carro2);
		}
		
		
	}
	

}
