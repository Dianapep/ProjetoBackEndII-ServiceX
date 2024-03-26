package br.com.dianafigueiredo.demo.servico.repositores;

import br.com.dianafigueiredo.demo.servico.domain.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
