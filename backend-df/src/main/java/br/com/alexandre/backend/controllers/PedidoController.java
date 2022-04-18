package br.com.alexandre.backend.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.backend.dto.PedidoDto;
import br.com.alexandre.backend.models.Pedido;
import br.com.alexandre.backend.services.PedidoService;

@RestController
@Transactional
@RequestMapping(value = "/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
		
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		List<Pedido> pedidos = service.findAll();
		return ResponseEntity.ok().body(pedidos);
	}
	
	@PostMapping
	public ResponseEntity<Pedido> realizaPedido(PedidoDto pedido){
		Pedido realizaPedido = service.realizaPedido(pedido);
		return ResponseEntity.ok().body(realizaPedido);
	}	
}
