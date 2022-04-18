package br.com.alexandre.backend.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.backend.models.Produto;
import br.com.alexandre.backend.services.ProdutoService;

@RestController
@Transactional
@RequestMapping( value = "/cardapio")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll(){
		List<Produto> prod = produtoService.findAll();		
		return ResponseEntity.ok().body(prod);
	}
	
	
}
