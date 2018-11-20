package es.indra.carro.springcarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.carro.springcarro.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

//	@Query("SELECT p FROM Producto p WHERE p.id_categoria = :id_categoria")
//	public List<Producto> getProductosPorCategoria(@Param("id_categoria") int id_categoria);

}
