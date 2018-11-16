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

import es.indra.carro.springcarro.aspects.annotation.TiempoDeEjecucion;
import es.indra.carro.springcarro.model.Categoria;
import es.indra.carro.springcarro.model.Respuesta;
import es.indra.carro.springcarro.service.CategoriaService;

@RestController
public class CarroController {

	@Autowired
	CategoriaService categoriaService;
	@Autowired
	Respuesta resp;

	@TiempoDeEjecucion
	@RequestMapping(value = "/categoria", method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> getAllCategoria() {
		return new ResponseEntity<List<Categoria>>(this.categoriaService.getAllCategoria(), HttpStatus.OK);
	}

	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> getById(@PathVariable("id") int id) {
		return new ResponseEntity<Categoria>(this.categoriaService.getCategoriaById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/categoria", method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody Categoria categoria) {
		this.categoriaService.saveCategoria(categoria);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@RequestMapping(value = "/categoria", method = RequestMethod.PUT)
	public ResponseEntity<Respuesta> update(@RequestBody Categoria categoria) {
		if (this.categoriaService.editCategoria(categoria)) {
			resp.setCode(200);
			resp.setMensaje("Categoria Modificada");
			return new ResponseEntity<Respuesta>(resp, HttpStatus.OK);
		}
		resp.setCode(404);
		resp.setMensaje("Error al modificar la Categoria");
		return new ResponseEntity<Respuesta>(resp, HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/categoria/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> removeById(@PathVariable("id") int id) {
		Categoria categoria = this.categoriaService.getCategoriaById(id);
		this.categoriaService.removeCategoria(categoria);
		return new ResponseEntity<String>("Categoria eliminada", HttpStatus.OK);
	}
}
