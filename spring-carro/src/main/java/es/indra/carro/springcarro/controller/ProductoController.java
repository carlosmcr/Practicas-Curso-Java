package es.indra.carro.springcarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.indra.carro.springcarro.model.Producto;
import es.indra.carro.springcarro.model.Respuesta;
import es.indra.carro.springcarro.service.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	ProductoService productoService;
	@Autowired
	Respuesta resp;

	@RequestMapping(value = "/producto", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> getAllCategoria() {
		return new ResponseEntity<List<Producto>>(this.productoService.getAllProducto(), HttpStatus.OK);
	}

	@RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)
	public ResponseEntity<Producto> getById(@PathVariable("id") int id) {
		return new ResponseEntity<Producto>(this.productoService.getProductoById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/producto", method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Producto producto) {
		this.productoService.saveProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/producto", method = RequestMethod.PUT)
	public ResponseEntity<Respuesta> update(@RequestBody Producto producto) {
		if (this.productoService.editProducto(producto)) {
			resp.setCode(200);
			resp.setMensaje("Producto Modificado");
			return new ResponseEntity<Respuesta>(resp, HttpStatus.OK);
		}
		resp.setCode(404);
		resp.setMensaje("Error al modificar el producto");
		return new ResponseEntity<Respuesta>(resp, HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/producto/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeById(@PathVariable("id") int id) {
		Producto producto = this.productoService.getProductoById(id);
		this.productoService.removeProducto(producto);
		return new ResponseEntity<String>("Producto eliminada", HttpStatus.OK);
	}

}
