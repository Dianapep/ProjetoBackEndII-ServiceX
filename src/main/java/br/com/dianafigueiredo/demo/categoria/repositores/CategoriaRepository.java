package br.com.dianafigueiredo.demo.categoria.repositores;

import br.com.dianafigueiredo.demo.categoria.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
