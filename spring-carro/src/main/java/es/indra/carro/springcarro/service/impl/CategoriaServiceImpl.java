package es.indra.carro.springcarro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.carro.springcarro.model.Categoria;
import es.indra.carro.springcarro.repository.CategoriaRepository;
import es.indra.carro.springcarro.service.CategoriaService;

@Component
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> getAllCategoria() {
		return this.categoriaRepository.findAll();
	}

	@Override
	public Categoria getCategoriaById(int id) {
		return this.categoriaRepository.getOne(id);
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		return this.categoriaRepository.save(categoria);
	}

	@Override
	public Boolean editCategoria(Categoria categoria) {
		if (this.categoriaRepository.existsById(categoria.getId_categoria())) {
			this.categoriaRepository.save(categoria);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void removeCategoria(Categoria categoria) {
		this.categoriaRepository.delete(categoria);
	}

//	@Override
//	public List<Producto> getProductosPorCategoria(int id_categoria) {
//		return this.categoriaRepository.getProductosPorCategoria(id_categoria);
//	}

}
