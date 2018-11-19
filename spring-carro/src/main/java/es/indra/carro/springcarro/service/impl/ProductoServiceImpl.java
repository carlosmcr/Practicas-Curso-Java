package es.indra.carro.springcarro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.carro.springcarro.model.Producto;
import es.indra.carro.springcarro.repository.ProductoRepository;
import es.indra.carro.springcarro.service.ProductoService;

@Component
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> getAllProducto() {
		return this.productoRepository.findAll();
	}

	@Override
	public Producto getProductoById(int id) {
		return this.productoRepository.getOne(id);
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return this.productoRepository.save(producto);
	}

	@Override
	public Boolean editProducto(Producto producto) {
		if (this.productoRepository.existsById(producto.getId_producto())) {
			this.productoRepository.save(producto);
			return true;
		}
		return false;
	}

	@Override
	public void removeProducto(Producto producto) {
		this.productoRepository.delete(producto);

	}

}
