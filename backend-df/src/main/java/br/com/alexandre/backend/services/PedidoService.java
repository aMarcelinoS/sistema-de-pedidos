package br.com.alexandre.backend.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexandre.backend.dto.PedidoDto;
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
		pedido.setSituacao(Pedido.SITUACAO_AGUARDANDO);
		pedido.setItens(pedidoDto.getItens());
		return repository.save(pedido);		
	}
	
	public Optional<Pedido> detalhePedido(Long id) {
		return repository.findById(id);		
	}
	
	public Pedido atualizaPedido(Long id, Pedido obj){
		Pedido p = repository.getById(id);
		atualizaDados(p, obj);
		return repository.save(p);
		
	}

	private void atualizaDados(Pedido p, Pedido obj) {
		p.setSituacao(obj.getSituacao());		
	}
}
