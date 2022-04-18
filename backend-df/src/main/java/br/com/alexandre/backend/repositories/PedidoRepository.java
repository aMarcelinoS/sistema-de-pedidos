package br.com.alexandre.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alexandre.backend.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
