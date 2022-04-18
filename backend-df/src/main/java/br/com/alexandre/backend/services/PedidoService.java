package br.com.alexandre.backend.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.backend.dto.PedidoDto;
import br.com.alexandre.backend.enums.SituacaoPedido;
import br.com.alexandre.backend.models.Pedido;
import br.com.alexandre.backend.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> findAll(){
		return repository.findAll();
	}
	
	public Pedido realizaPedido(PedidoDto pedidoDto) {
		Pedido pedido = new Pedido();
		pedido.setDataHora(LocalDateTime.now());
		pedido.setSituacaoPedido(SituacaoPedido.Aguardando);
		pedido.setItens(pedidoDto.getItens());
		return repository.save(pedido);		
	}
}
