package br.com.alexandre.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.backend.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
