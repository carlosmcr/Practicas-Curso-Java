/**
 * 
 */
package es.indra.pair.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.indra.pair.beans.Carro;
import es.indra.pair.beans.Cliente;
import es.indra.pair.beans.Producto;
import es.indra.pair.negocio.Compras;

/**
 * @author CARLOS
 *
 */
public class Venta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion = 0;
		int opcion2 = 0;
		int idCategoria = 0;
		int idProducto = 0;
		Scanner sc = new Scanner(System.in);
		Compras c = new Compras();
		List<List<Producto>> listaCategorias = c.crearProducto();
		List<Carro> listaCarro = new ArrayList<>();
		do {
			System.out.println("");
			System.out.println("Seleccione su rol: ");
			System.out.println("");
			System.out.println("1 - Cliente");
			System.out.println("2 - Empleado");
			System.out.println("3 - Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				do {
					System.out.println("");
					System.out.println("Elija una opción: ");
					System.out.println("");
					System.out.println("1 - Ver produtos");
					System.out.println("2 - Comprar");
					System.out.println("3 - Salir");
					opcion2 = sc.nextInt();
					switch (opcion2) {
					case 1:
						System.out.println("");
						System.out.println("Lista de productos por categoria: ");
						System.out.println("");						
						for (List<Producto> list : listaCategorias) {
							System.out.println(list.get(0).getCategoria().getNombre());
							System.out.println("Id\t\t|Nombre\t\t|Descripción\t\t|Categoría\t\t|Precio\t\t|Unidades");
							for (int i = 0; i < list.size(); i++) {
								System.out.printf("%s\t\t|%s\t\t\t|%s\t\t|%s\t\t|%s\t\t|%s\n",i+1,list.get(i).getNombre(), list.get(i).getDescripcion(),list.get(i).getCategoria().getNombre(), list.get(i).getPrecio(), list.get(i).getStock());
							}
							System.out.println("");
						}
						break;
					case 2:
						System.out.println("");
						System.out.println("Indique cual de estos clientes es usted: ");
						System.out.println("");
						List<Cliente> listaClientes = c.crearClientes();
						System.out.println("Id\t|Nombre\t\t|Apellidos\t|Teléfono");
						for (Cliente cliente : listaClientes) {
							System.out.printf("%s\t %s\t %s\t %s\n",cliente.getIdCliente(), cliente.getNombre(),cliente.getApellido(), cliente.getTelefono());
						}
						int idCliente = sc.nextInt();
						Cliente cliente = listaClientes.get(idCliente);
						System.out.println("Bienvenido ".concat(cliente.getNombre()));
						Carro carro = new Carro();
						carro.setCliente(cliente);
						carro.setFecha("08-11-2018");
						do {	
							System.out.println("");
							System.out.println("Lista de productos por categoria: ");
							System.out.println("");
							System.out.println("1 - Alimentacion");
							System.out.println("2 - Perfumeria");
							System.out.println("3 - Limpieza");
							System.out.println("4 - Salir");
							idCategoria = sc.nextInt() - 1;
							if (idCategoria == 3) {
								break;
							}
							System.out.println("Id\t\t|Nombre\t\t|Descripción\t\t|Categoría\t\t|Precio\t\t|Unidades");
							for (int i = 0; i < listaCategorias.get(idCategoria).size(); i++) {
								System.out.printf("%s\t\t|%s\t\t|%s\t\t|%s\t\t|%s\t\t|%s\n",i+1,listaCategorias.get(idCategoria).get(i).getNombre(),listaCategorias.get(idCategoria).get(i).getDescripcion(),listaCategorias.get(idCategoria).get(i).getCategoria().getNombre(), listaCategorias.get(idCategoria).get(i).getPrecio(), listaCategorias.get(idCategoria).get(i).getStock());
							}
							System.out.println("");
							System.out.println("Elija un producto: ");
							System.out.println("");
							idProducto = sc.nextInt() - 1;
							Producto producto = listaCategorias.get(idCategoria).get(idProducto);
							if(producto.getStock() !=0) {				
								System.out.println(producto.getNombre() .concat(" ha sido añadido al carro"));
								carro = c.comprar(carro, producto);
								System.out.println("Productos del carro: ");
								for (Producto listaProductos : carro.getProductosComprados()) {
									System.out.print(listaProductos.getNombre().concat(", "));								
								}
							}else {
								System.out.println("No hay stock.");
							}
							
							System.out.println("");
						} while (idCategoria != 3);
						if (carro.getTotal() != 0) {
							listaCarro.add(carro);					
						}
						break;
					case 3:
						break;
					default:
						break;
					}
				} while (opcion2 != 3);
				break;
			case 2:
				do {
					System.out.println("");
					System.out.println("Elija una opción: ");
					System.out.println("");
					System.out.println("1 - Lista con todos los carros con fecha");
					System.out.println("2 - Cambiar  stock");
					System.out.println("3 - Salir");
					opcion2 = sc.nextInt();
					switch (opcion2) {
					case 1:
						if(listaCarro.isEmpty() ||listaCarro == null) {
							System.out.println("");
							System.out.println("No hay registros.");
						}else {
						System.out.println("Fecha:\t\t|Cliente:\t|Total:\t|Productos:");
							for (int i = 0; i < listaCarro.size(); i++) {
								System.out.printf("%s\t|%s\t|%s\t",listaCarro.get(i).getFecha(), listaCarro.get(i).getCliente().getNombre(), listaCarro.get(i).getTotal());
								for (int j = 0; j < listaCarro.get(i).getProductosComprados().size(); j++) {
									System.out.print(listaCarro.get(i).getProductosComprados().get(j).getNombre().concat(", "));
								}
								System.out.println("");
							}
						}
						System.out.println("");
						break;
					case 2:
						do {	
							System.out.println("");
							System.out.println("Lista de productos por categoria: ");
							System.out.println("");
							System.out.println("1 - Alimentacion");
							System.out.println("2 - Perfumeria");
							System.out.println("3 - Limpieza");
							System.out.println("4 - Salir");
							idCategoria = sc.nextInt() - 1;
							if (idCategoria == 3) {
								break;
							}
							System.out.println("Id\t\t|Nombre\t\t|Descripción\t\t|Categoría\t\t|Precio\t\t|Unidades");
							for (int i = 0; i < listaCategorias.get(idCategoria).size(); i++) {
								System.out.printf("%s\t\t|%s\t\t|%s\t\t|%s\t\t|%s\t\t|%s\n",i+1,listaCategorias.get(idCategoria).get(i).getNombre(),listaCategorias.get(idCategoria).get(i).getDescripcion(),listaCategorias.get(idCategoria).get(i).getCategoria().getNombre(), listaCategorias.get(idCategoria).get(i).getPrecio(), listaCategorias.get(idCategoria).get(i).getStock());
							}
							System.out.println("");
							System.out.println("Elija un producto: ");
							System.out.println("");
							idProducto = sc.nextInt() - 1;
							Producto producto = listaCategorias.get(idCategoria).get(idProducto);
							System.out.println("Elija cantidad: ");
							listaCategorias = c.modificarStock(producto.getNombre(), sc.nextInt(), listaCategorias);							
						
						} while (idCategoria != 3);
						
						break;
					default:
						break;
					}					
				} while (opcion2 != 3);				
				break;
			}
		} while (opcion != 3);
	}

}
