package es.indra.carro.springcarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.carro.springcarro.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
