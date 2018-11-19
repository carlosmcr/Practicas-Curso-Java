package es.indra.carro.springcarro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
	@GeneratedValue
	private int id_categoria;
	private String nombre;
	// @JsonManagedReference
	// @JoinColumn(name = "id_producto")
	@OneToMany(mappedBy = "categoria")
	private List<Producto> listaProductos;

	public Categoria() {

	}

	public Categoria(int id_categoria, String nombre, List<Producto> listaProductos) {
		super();
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.listaProductos = listaProductos;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre=" + nombre + ", listaProductos=" + listaProductos + "]";
	}

}
