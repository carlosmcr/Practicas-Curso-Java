package es.indra.carro.springcarro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.indra.carro.springcarro.model.Categoria;
import es.indra.carro.springcarro.model.Producto;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	@Query("SELECT p FROM Producto p WHERE p.id_categoria = :id_categoria")
	public List<Producto> getProductosPorCategoria(@Param("id_categoria") int id_categoria);

}
