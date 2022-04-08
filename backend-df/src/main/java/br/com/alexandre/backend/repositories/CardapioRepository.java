package br.com.alexandre.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alexandre.backend.models.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}
