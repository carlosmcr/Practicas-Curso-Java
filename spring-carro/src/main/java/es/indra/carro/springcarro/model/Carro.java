/**
 * 
 */
package es.indra.carro.springcarro.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aula3
 *
 */
public class Carro {

	private Cliente cliente;
	private List<Producto> productosComprados = new ArrayList<>();
	private String fecha;
	private double total;

	public Carro() {

	}

	public Carro(Cliente cliente, String fecha) {
		super();
		this.cliente = cliente;		
		this.fecha = fecha;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Producto> getProductosComprados() {
		return productosComprados;
	}
	public void setProductosComprados(List<Producto> productosComprados) {
		this.productosComprados = productosComprados;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	

	public final double getTotal() {
    return total;
  }

  public final void setTotal(double total) {
    this.total = total;
  }

  public void aniadirProducto(Producto p) {
	  if(p.getStock() !=0) {
		productosComprados.add(p);
		total = p.getPrecio() + total;
	  }
	}

  @Override
  public String toString() {
    return "Carro [cliente=" + cliente + ", productosComprados=" + productosComprados + ", fecha="
        + fecha + ", total=" + total + "]";
  }

}
