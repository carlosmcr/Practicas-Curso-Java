package es.indra.carro.springcarro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.indra.carro.springcarro.model.Categoria;

@Service
public interface CategoriaService {

	public List<Categoria> getAllCategoria();

	public Categoria getCategoriaById(int id);

	public Categoria saveCategoria(Categoria categoria);

	public Boolean editCategoria(Categoria categoria);

	public void removeCategoria(Categoria categoria);
}
