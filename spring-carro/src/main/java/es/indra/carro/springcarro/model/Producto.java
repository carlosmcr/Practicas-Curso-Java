/**
 * 
 */
package es.indra.carro.springcarro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author aula3
 *
 */
@Entity
public class Producto {

	@Id
	@GeneratedValue
	private int id_producto;
	private String nombre;
	private String descripcion;
	// @JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private int id_categoria;
	private double precio;
	private int stock;

	public Producto() {

	}

	public Producto(int id_producto, String nombre, String descripcion, int id_categoria, double precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.id_categoria = id_categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", id_categoria=" + id_categoria + ", precio=" + precio + ", stock=" + stock + "]";
	}

}
