package es.indra.carro.springcarro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.indra.carro.springcarro.model.Producto;

@Service
public interface ProductoService {

	public List<Producto> getAllProducto();

	public Producto getProductoById(int id);

	public Producto saveProducto(Producto producto);

	public Boolean editProducto(Producto producto);

	public void removeProducto(Producto producto);

}
